class Solution {
    public void solve(List<Boolean>res,HashMap<Integer,Set<Integer>>map,int queries[][])
    {
        for(int temp[]:queries)
        {
            int s=temp[0];
            int end=temp[1];

            if(map.get(end).contains(s))
            res.add(true);
            else
            res.add(false);
            
        }
    }
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) 
    {
        List<Boolean>res=new ArrayList<>();
       

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        HashMap<Integer,Set<Integer>>map=new HashMap<>();

        for(int i=0;i<=numCourses;i++)
        {
            adj.add(new ArrayList<>());
            map.put(i,new HashSet<>());
        }
        int indegree[]=new int[numCourses];
        for(int i[]:prerequisites)
        {
            int s=i[0];
            int end=i[1];
            adj.get(s).add(end);
            indegree[end]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        while(q.isEmpty()==false)
        {
            int node=q.poll();
            for(int neigh:adj.get(node))
            {
                map.get(neigh).add(node);
                map.get(neigh).addAll(map.get(node));
                if(--indegree[neigh]==0)
                {
                   q.add(neigh);
                }

            }

        }
        solve(res,map,queries);
        return res;
    }
}