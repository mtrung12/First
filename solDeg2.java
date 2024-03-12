import java.util.Scanner;
public class solDeg2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1, x2;
        double delta;
        System.out.println("Enter a, b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==0){
            if(b==0){
                if(c==0)System.out.println("Infinite Solutions");
                else System.out.println("No Solution");
            }
            else{
                x1=-c/b;
                System.out.print("Solution: x = " + x1);
            }
        }
        else {
            delta=b*b-4*a*c;
            if(delta<0) System.out.println("No Solution");
            else if(delta==0){
                x1=-b/(2*a);
                System.out.println("Solution: x1 = x2 = " + x1);
            } 
            else{
                x1=(-b+Math.sqrt(delta))/(2*a);
                x2=(-b+Math.sqrt(delta))/(2*a);
                System.out.println("There are two soluions: \nx1 = " +x1 + "\nx2 = " +x2);
            }
        }
    }
    
}
