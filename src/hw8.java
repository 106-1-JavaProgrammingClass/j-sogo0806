import java.util.Scanner;

public class hw8 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        float vel = sca.nextFloat();
        System.out.println(Math.round(vel/600*10f)/10f);
    }
}
