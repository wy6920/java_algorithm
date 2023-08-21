import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class two_pointer {
    static StringBuilder sb = new StringBuilder();

    void start(){
        int[] elements = {7,9,1,1,4};
        process(elements);
        System.out.println(sb.toString());
    }

    void process(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int length = elements.length;
        int s = 0, e = 0;
        int sum = 0;
        int pointer = 0;
        while(s < length) {
            if(s < e){
                sum += elements[pointer++];
            }
            else{
                set.add(sum);
                pointer = ++s;
                sum = 0;
            }
        }
        sb.append("\n");
    }
}
