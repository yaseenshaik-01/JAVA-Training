import java.util.Scanner;

public class printwhileloop
{

    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a<=10) 
        {
            System.out.println(a);
           a++;
        }
    }
}
