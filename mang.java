import java.util.Scanner;
public class mang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n, tong = 0;
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < a.length; i++){
            System.out.print("Enter the element "+(i+1)+": ");
            a[i] = sc.nextInt();
            tong+=a[i];
        }
        System.out.println("The sum of the elements is: "+tong);
    }
}
