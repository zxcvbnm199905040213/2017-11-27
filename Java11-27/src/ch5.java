import java.util.Scanner;

public class ch5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while( sc.hasNext() ){
            int a = sc.nextInt();

            if( (a % 4 == 0 && a % 100 != 0) || a % 400 == 0 )
                System.out.println("Bissextile Year");
            else
                System.out.println("Common Year");
        }

    }
}