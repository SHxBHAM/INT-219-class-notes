import java.util.ArrayList;

public class check {
    public static void main(String[] args) {
        ArrayList<Integer> checker = new ArrayList<>();
        String[] nayi  = {"shubham","mishra"};
        for(int i = 0;i<nayi.length;i++){
            int x = nayi[i].indexOf('x');
            System.out.println(x);
        } 
    }
}
