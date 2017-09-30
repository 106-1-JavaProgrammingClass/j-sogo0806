import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int vel = sca.nextInt();
        System.out.println((double) (Math.round(vel*1.6*10f)/10f));
    }
}
