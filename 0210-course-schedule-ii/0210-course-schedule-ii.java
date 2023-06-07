class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> [] adjList = new ArrayList[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            
            adjList[u].add(v);
            inDegree[v]++;
        }
        
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                que.add(i);
            }
        }
        
        int count = 0;
        int ans[] = new int[numCourses];
        int index = numCourses - 1;
        while (!que.isEmpty()) {
            int temp = que.remove();
            ans[index--] = temp;
            count++;
            for (int i = 0; i < adjList[temp].size(); i++) {
                int neighbor = adjList[temp].get(i);
                
                inDegree[neighbor]--;
                
                if (inDegree[neighbor] == 0) {
                    que.add(neighbor);
                }
            }
        }
        
        
        if (count != numCourses) {
            return new int[0];
        }
        else return ans;        
    }
}