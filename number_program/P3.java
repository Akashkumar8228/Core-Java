import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double minTemp=70;
        double maxTemp=80.0;
        double currentTemp=sc.nextDouble();  // in celsius
        currentTemp = currentTemp * (9.0 / 5) + 32;

        System.out.println(currentTemp);
        if(currentTemp>=minTemp && currentTemp<=maxTemp)
        {
            System.out.println("between temp");

        }
        else{
            System.out.println("invalid temp");
        }
    }
}
