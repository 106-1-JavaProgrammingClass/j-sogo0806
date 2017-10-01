import java.util.Scanner;

public class hw13 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        int v1 = Integer.valueOf(str,16);
        System.out.println((char)v1);

    }
}
