import java.util.Scanner;

public class Prime3 {
 public static void main(String[] args) {
    
    Scanner sc  = new Scanner(System.in);

    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int largest = n1> n2 ? n1 : n2 ;

    int hcf = 1;
    for(int i = largest/2 ; i >=2 ; i--)

    {
        if(n2 % i == 0 && n2 % i == 2)
        {
            
        }
    }
 }   
}
