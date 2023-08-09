import java.util.Stack;

public class dfs_stack {
    //DFS 깊이우선탐색 - 스택 사용
    //결과 : 1 2 7 6 8 3 4 5
    static StringBuilder sb = new StringBuilder();
    int[][] node = {{}, {2, 3}, {1, 7}, {1, 4, 5}, {3}, {3}, {7}, {2, 6, 8}, {1,7}};
    boolean[] visited;
    Stack<Integer> stack = new Stack<Integer>();

    public dfs_stack(){
        visited = new boolean[node.length];
    }

    void start(){
        process(1);
        System.out.println(sb.toString());
    }

    void process(int v) {
        stack.push(v);
        visited[v] = true;
        sb.append(v + " ");
        while(!stack.isEmpty()){
            int parent = stack.peek();
            boolean bCheck = false;
            for(int child : node[parent]){
                if(!visited[child]){
                    bCheck = true;
                    stack.push(child);
                    visited[child] = true;
                    sb.append(child + " ");
                    break;
                }
            }
            if(!bCheck){
                stack.pop();
            }
        }
    }
}
