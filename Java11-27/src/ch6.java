import java.util.Scanner;

public class ch6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        int v4 = scn.nextInt();
        if (v1 == v2 && v1 == v3 && v1 == v4){
            System.out.println("Win");
        }else if (v1==v2 && v1==v3){
            System.out.println("R");
        }else if (v1==v3 && v1==v4){
            System.out.println("R");
        }else if (v2==v3 && v2==v4){
            System.out.println("R");
        }else if (v1 != v2 && v1 != v3 && v1 != v4 && v3 != v2 && v4 != v2 && v3 != v4 ){
            System.out.println("R");
        }else if (v1 == v2){
            System.out.println(v3+v4);
        }else if (v3 == v2){
            System.out.println(v1+v4);
        }else if (v3 == v4){
            System.out.println(v1+v2);
        }else if (v1 == v4){
            System.out.println(v3+v2);
        }else if (v1 == v3){
            System.out.println(v2+v4);
        }else if (v2 == v4){
            System.out.println(v1+v3);
        }else{
            System.out.println(Math.max(Math.max(v1,v2),v3)*2);
        }
    }
}