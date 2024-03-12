import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();
        if(a%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
    
}
