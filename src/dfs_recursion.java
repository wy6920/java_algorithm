public class dfs_recursion {
    //DFS 깊이우선탐색 - 재귀함수 사용
    //결과 : 1 2 7 6 8 3 4 5
    static StringBuilder sb = new StringBuilder();
    int[][] node = {{}, {2, 3}, {1, 7}, {1, 4, 5}, {3}, {3}, {7}, {2, 6, 8}, {1,7}};
    boolean[] visited;

    public dfs_recursion(){
        visited = new boolean[node.length];
    }

    void start(){
        process(1);
        System.out.println(sb.toString());
    }

    void process(int v) {
        visited[v] = true;

        sb.append(v + " ");
        for(int child : node[v]){
            if(visited[child] == false){
                process(child);
            }
        }
    }
}
