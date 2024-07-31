    import java.util.Scanner;

public class P2a {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        if(a > b && a > c && a > d)
            {
                System.out.println(a);
            }
       else if(b > c && b > d)
        {
            System.err.println(b);
        }
        else if(c > d)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
    }
}

