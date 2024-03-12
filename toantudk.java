import java.util.Scanner;
public class toantudk {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //giong c
        System.out.println("Enter a:");
        int a= sc.nextInt();
        String res = (a%2==0)? "Even":"Odd";
        System.out.println(res);
    }
    
    
}
