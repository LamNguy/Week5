import java.util.Scanner;

public class Main {
    public static void main (String []  args  )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date");  String s = scanner.nextLine();
        System.out.println("Enter Origin") ;  String s1 = scanner.nextLine();
        System.out.println("Enter  Price") ; double s2 =  scanner.nextDouble() ;
        System.out.println("Enter quantity"); double s3 = scanner.nextDouble() ;
        Fruit a = new Apple(s,s1,s2,s3);



        if ( a instanceof  CCP) System.out.println("YES");
        else System.out.println("No");

        ( a).show();


    }

}
