import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
    }
    static void swap(int c, int d){
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c + " " + d);
    }
}



