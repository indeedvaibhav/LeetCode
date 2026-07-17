class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        int skipped=0;
        for(int i=sandwiches.length-1;i>=0;i--)
            stack.push(sandwiches[i]);

        Queue<Integer> queue= new LinkedList<>();
        for(int j=0;j<students.length;j++)
            queue.offer(students[j]);


        while(!queue.isEmpty() && skipped< queue.size())
        {
            if(queue.peek()==stack.peek())
            {
                stack.pop();
                queue.poll();
                skipped=0;
            }
            else {
                int val= queue.poll();
                queue.offer(val);
                skipped++;
            }
        }
        return queue.size();

    }
}