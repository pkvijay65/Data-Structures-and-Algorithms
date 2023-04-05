class Solution {
    public int findLongestChain(int[][] pairs) {
        Comparator<int[]> sortBySecondElement = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double o1SecondElement = o1[1];
                double o2SecondElement = o2[1];
                if (o1SecondElement < o2SecondElement) {
                    return -1;
                } else if (o1SecondElement > o2SecondElement) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Arrays.sort(pairs, sortBySecondElement);
        
        int chainLen = 1; 
        int chainEnd = pairs[0][1];
        
        for(int i = 1; i < pairs.length; i++){
            
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
            
        } 
        
        return chainLen;
    }
}