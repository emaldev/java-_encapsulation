import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner pint = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Enter your name :");
        System.out.println("---------------------------");
        String userName = pint.nextLine();
        System.out.println("user name is :" + userName);

    }
}