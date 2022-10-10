class Solution {
    public int[] relativeSortArray(int[] A, int[] B) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i<A.length; i++){
            if (hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i]) + 1);
            }
            else hm.put(A[i], 1);
        }

        for (int i = 0; i<B.length; i++){
            if (hm.containsKey(B[i])){
                for (int j= 0; j<hm.get(B[i]); j++){
                    ans.add(B[i]);
                }
                hm.remove(B[i]);
            }
        }
        Arrays.sort(A);

        for (int value: A){
           if (hm.containsKey(value)){
               ans.add(value);
           }
        }

        int n = ans.size();
        int result[] = new int[n];

        for (int i = 0; i<n; i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}