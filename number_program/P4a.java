import java.util.Scanner;

public class P4a {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String day = s.next().toLowerCase(); 
        switch(day){
            case "monday" :
            
            case "wednesday":{
                System.out.println("Basket Ball");
                break;
            }
            case "tuesday":
            case "Friday":{
                System.out.println("Tennis");
                break;
            }
            case "thursday":{
                System.out.println("Cricket");
                break;
            }
            case "satuday":
            {
                System.out.println("Exercise");
                break;
            }
            case "sunday":
            {

                System.out.println("Holyday");
            }
            default:
            {
                System.out.println("Invalid option");
            }
        }
    }
}
