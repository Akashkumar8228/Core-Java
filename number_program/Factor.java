import java.util.Scanner;
class  Factor {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.print(1+" ");
        int count = 2;
        for (int i = 2; i <= num / 2; i++) {

            if(num % i == 0) // if divisible by i
            {
                count++;
                System.out.print(i +",");
            }
            
        } // end of loop
        
        System.out.println(num);
        System.out.println("count = "+count);
    }
}
