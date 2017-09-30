import java.util.Scanner;

public class hw7 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        float vel = sca.nextFloat();
        System.out.println(Math.round(vel*0.26418*10f)/10f);
    }
}
