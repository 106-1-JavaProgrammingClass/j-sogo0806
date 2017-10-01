import java.util.Scanner;

public class hw12 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        char v1 = sca.next().charAt(0);
        int v2 = (int)v1;
        System.out.println(Integer.toHexString(v2));
    }
}
