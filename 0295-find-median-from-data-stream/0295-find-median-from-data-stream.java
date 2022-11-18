class MedianFinder {
     PriorityQueue<Integer> minHeap;
     PriorityQueue<Integer> maxHeap;
    
    public MedianFinder() {
         minHeap = new PriorityQueue<>();
         maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
                public int compare (Integer a, Integer b){
                    return  b-a;
             }
         });

    }
    
    public void addNum(int num) {
        minHeap.add(num);
        
        if (minHeap.size() > maxHeap.size() +1 ){
            maxHeap.add(minHeap.poll());
        }
        
        if (maxHeap.size() != 0 && minHeap.size() != 0 && maxHeap.peek() > minHeap.peek()){
            int temp1 = minHeap.peek();
            int temp2 = maxHeap.peek();
            
            minHeap.remove();
            maxHeap.remove();
            
            maxHeap.add(temp1);
            minHeap.add(temp2);
        }
              
    }
    
    public double findMedian() {
        int size1 = maxHeap.size();
        int size2 = minHeap.size();
        double ans;
        
        if ((size1 + size2)%2 !=0){
            ans = (double)minHeap.peek();
        }
        else {
            ans = ((double)(minHeap.peek() + maxHeap.peek()))/2;
        }
        
        return ans;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */