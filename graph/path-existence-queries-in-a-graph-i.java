class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        ArrayList<Integer>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(Math.abs(nums[i] - nums[j]) <= maxDiff) {
                    graph[i].add(j);
                    graph[j].add(i);
                }
            }
        }

        boolean[] ans = new boolean[queries.length];

        for(int i = 0; i < queries.length; i++) {
            int src = queries[i][0];
            int dest = queries[i][1];

            boolean[] visited = new boolean[n];
            ans[i] = dfs(src, dest, graph, visited);
        }

        return ans;
    }

    static boolean dfs(int curr, int dest, ArrayList<Integer>[] graph, boolean[] visited) {

        if(curr == dest)
            return true;

        visited[curr] = true;

        for(int next : graph[curr]) {
            if(!visited[next]) {
                if(dfs(next, dest, graph, visited))
                    return true;
            }
        }

        return false;
    }
        
    }
