import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);

        System.out.println("Number down : ");
      int n;
      double result=0.0;
         n = bob.nextInt();
         for (double i=1;i<=n;i++){
             result+=(1/i);
             System.out.println(result);

         }
    }}
