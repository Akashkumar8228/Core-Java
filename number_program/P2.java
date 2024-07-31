import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ramu=s.nextInt();
        int raghu=s.nextInt();
        int raju=s.nextInt();
        if(ramu<0 || raghu<0 || raju<0)
        {
                System.out.println("age is invalid");
        }
       else if(ramu<raghu&&ramu<raju)
        {
            System.err.println(ramu);
        }
        else if(raghu<raju)
        {
            System.out.println(raghu);
        }
        else
        {
            System.out.println(raju);
        }
    }
}
