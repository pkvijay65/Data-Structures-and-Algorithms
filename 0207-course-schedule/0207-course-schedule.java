class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> [] adjList = new ArrayList[numCourses + 1];
        
        for (int i = 0; i <= numCourses; i++) {
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
        
        while (!que.isEmpty()) {
            int temp = que.remove();
            
            for (int i = 0; i < adjList[temp].size(); i++) {
                int neighbor = adjList[temp].get(i);
                
                inDegree[neighbor]--;
                
                if (inDegree[neighbor] == 0) {
                    que.add(neighbor);
                }
            }
        }
        
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}