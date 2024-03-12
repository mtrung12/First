import java.util.Scanner;
public class ngoaile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{ 
            System.out.print("Enter an integer: ");
            int x = sc.nextInt();
        }catch(Exception e){ 
            System.out.println("Invalid Input! Please enter an integer.");
        }finally{
            System.out.println("Thank you!");
        }
    }
}