class Solution {
    public int largestRectangleArea(int[] heights) {
       int[] psi= previousIndices(heights);
       int[] nsi=nextIndices(heights);
       int max=0;
       for(int i =0 ; i< heights.length;i++)
       {
           int width = nsi[i] - psi[i] - 1;
           int area = heights[i] * width;

           max = Math.max(max, area);

       }
       return max;
    }
    static int[] previousIndices(int[] arr)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack= new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()])
            {
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            map.put(stack.pop(),-1);
        }

        int[] ans= new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            ans[i]=map.get(i);
        }
        return ans;
    }
    static int[] nextIndices(int[] arr)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for(int num=0;num<=arr.length-1;num++)
        {
            while(!stack.isEmpty() && arr[num]<  arr[stack.peek()])
            {
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty())
        {
            map.put(stack.pop(), arr.length);
        }

        int[] ans= new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            ans[i]=map.get(i);
        }
        return ans;
    }
}