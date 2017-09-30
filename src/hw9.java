import java.util.Scanner;

public class hw9 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        String  str = sca.nextLine();
        char chOld = sca.next().charAt(0);
        char chNew = sca.next().charAt(0);
        System.out.println(str.replace(chOld,chNew));
    }
}
