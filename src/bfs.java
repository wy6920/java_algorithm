import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    //BFS 너비우선탐색 - 큐 함수 사용
    //결과 : 1 2 3 8 6 5 4 7
    static StringBuilder sb = new StringBuilder();
    int[][] node = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    boolean[] visited;

    public bfs(){
        visited = new boolean[node.length];
    }

    void start(){
        process(1);
        System.out.println(sb.toString());
    }

    void process(int v) {
        Queue<Integer> que = new LinkedList<>();

        que.add(v);
        visited[v] = true;

        while(que.size() > 0){
            int idx = que.poll();
            sb.append(idx + " ");

            for(int item : node[idx]){
                if(!visited[item]) {
                    visited[item] = true;
                    que.add(item);
                }
            }
        }
    }
}
