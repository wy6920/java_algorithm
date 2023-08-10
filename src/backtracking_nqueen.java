public class backtracking_nqueen {
    //백트래킹 사용
    //결과 : 2
    int[] board;
    int N = 0;
    int cnt = 0;

    void start(){
        int rst = solution(4);
        System.out.println(rst);
    }

    int solution(int param){
        N = param;
        board = new int[param];
        backtracking(0);
        return cnt;
    }

    void backtracking(int idx) {
        if(idx == N){
            cnt++;
            return;
        }

        for(int i = 0 ; i < N ; i++){
            board[idx] = i;
            if(isPossible(idx)){
                backtracking(idx+1);    //idx++로 할 경우 되돌아왔을때의 값이 변경되어 있음
            }
        }
    }

    boolean isPossible(int depth){
        for(int i = 0 ; i < depth ; i++ ){
            if(board[i] == board[depth]){ //같은 열
                return false;
            }
            else if(Math.abs(depth - i) == Math.abs(board[depth] - board[i])){ //기울기 계산 (y증가량 / x증가량)
                return false;
            }
        }
        return true;
    }
}
