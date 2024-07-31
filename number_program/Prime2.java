import java.util.Scanner;

public class Prime2 
{
    
    public static boolean isprime( int num ) 
    {

        //count number of factors
        int count = 2;

        for (int i = 2; i <= num/2; i++)
         {
            if(num % i == 0)
            {
                count ++ ;

            }
        }
            return count == 2 ;
    
}
             public static void main(String[] args) 
             {
             Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(isprime( num ))
            {
                System.out.println("prime");
            }
            else    {
                System.out.println("not prime");
            }

        }
    }