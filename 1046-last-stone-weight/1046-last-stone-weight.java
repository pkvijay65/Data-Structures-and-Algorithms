class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        
        while (maxHeap.size() > 1) {
            int top1 = maxHeap.poll();
            int top2 = maxHeap.poll();
            
            int diff = top1 - top2;
            
            if (diff > 0) {
                maxHeap.add(diff);
            } 
        }
        
        return maxHeap.size() > 0 ? maxHeap.poll() : 0;
    }
}