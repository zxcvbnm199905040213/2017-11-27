import java.util.Scanner;
public class ch2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        double a1=((c*60)+d)-((a*60)+b);

        if(a1<=120){

            int a2=(int)(a1/30);
            System.out.println(a2*30);

        }else if(a1>120 && a1<=240){

            int a2=(int)((a1-120)/30);
            System.out.println((a2*40)+120);

        }else if(a1>240){

            int a2=(int)((a1-240)/30);
            System.out.println((a2*60)+280);
        }
    }
}
