class Solution {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int[] nextGreaterElements(int[] nums) {
        for (int x : arr) {
            rm.addNumber(x);
            System.out.println(rm.getMedian());
        }
    }

    public void addNumber(int num) {

        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        // Balance heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double getMedian() {

        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }

        if (maxHeap.size() > minHeap.size())
            return maxHeap.peek();

        return minHeap.peek();
    }
}