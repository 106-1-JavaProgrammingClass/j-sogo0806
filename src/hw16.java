import java.util.Scanner;

public class hw16 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        int v2 = sca.nextInt();
        System.out.println(v1 + v2);
        System.out.println(v1 - v2);
        System.out.println(v1 * v2);

        char v1 = sca.next().charAt(0);
        System.out.println((int)v1);
    }
}

}
