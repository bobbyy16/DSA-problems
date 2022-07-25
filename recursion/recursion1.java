package recursion;

/**
 * recursion1
 */
public class recursion1 {

    public static void main(String[] args) {
        recursion(1);
    }

    static void recursion(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }else {
            System.out.println(n);
            recursion(n + 1);
        }
    }
}