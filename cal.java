// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       int a;
       int num1,num2,ans;
       Scanner sc= new Scanner(System.in);
       System.out.println("1: Addition");
       System.out.println("2: Substraction");
       System.out.println("3: Multiplication");
       System.out.println("4: Division");
       a=sc.nextInt();
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        if(a==1) {
            System.out.println("Enter your first number");
            num1=sc.nextInt();
            System.out.println("Enyer your second number");
            num2=sc.nextInt();
            ans=num1+num2;
            System.out.println("Sum is:"+ans);

        }
        if(a==2) {
            System.out.println("Enter your first number");
            num1=sc.nextInt();
            System.out.println("Enyer your second number");
            num2=sc.nextInt();
            if(num1>num2) {
                ans = num1-num2;
                System.out.println("Difference is: "+ans);
            }
            else
                System.out.print("Susbstraction not possible");

        }

        if(a==3) {
            System.out.println("Enter your first number");
            num1=sc.nextInt();
            System.out.println("Enyer your second number");
            num2=sc.nextInt();
            ans=num1*num2;
            System.out.println("Multiplacation result is:"+ans);

        }
        if(a==4) {
            System.out.println("Enter your first number");
            num1=sc.nextInt();
            System.out.println("Enter your second number");
            num2=sc.nextInt();
            ans=num1/num2;
            System.out.println("Division result is:"+ans);

        }

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
           else
               System.out.println("Try Again");
        }
    }
