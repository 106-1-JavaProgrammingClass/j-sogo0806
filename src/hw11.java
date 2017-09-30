import java.util.Scanner;

public class hw11 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        double v1 = sca.nextDouble();
        int v2 = sca.nextInt();
        System.out.println((float)Math.round(Math.pow(10,v2)*v1)/Math.pow(10,v2));

    }
}
