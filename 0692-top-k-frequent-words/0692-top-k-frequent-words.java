class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for (String word : words){
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        
        PriorityQueue<String> container = new PriorityQueue<>(new Comparator <String>(){
            @Override
            public int compare(String str1, String str2){
                int freq1 = hm.get(str1);
                int freq2 = hm.get(str2);
                
                if (freq1 == freq2) return str2.compareTo(str1);
                return freq1 - freq2;
            }
        });
        
        for (Map.Entry<String,Integer> word :hm.entrySet()){
            container.add(word.getKey());
            
            if (container.size() > k){
                container.poll();
            }
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        while (!container.isEmpty()){
            ans.add(container.poll());
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}