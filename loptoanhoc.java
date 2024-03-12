import java.util.Scanner;
public class loptoanhoc {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a negative number:");
    double a = sc.nextDouble();
    double b = Math.abs(a);
    System.out.println(b);
    }
}
