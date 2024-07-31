import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read num
        int num = sc.nextInt();
        //count factor
        int count = 2; // 1 and num itself is a factor
        for (int i = 2 ; i <= num / 2; i++ )  {
            if (num % i == 0)
                count++;
             }
        if(count == 2)
        {
            System.out.println("is prime");

        }   
        else {

            System.out.println("not prime");
        } 

    }
}
