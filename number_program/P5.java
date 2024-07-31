import java.util.Scanner;

class P5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double total_price = sc.nextDouble();
        double price_after_discount = total_price;
        //lets apply discount
        if(age >= 30 && age <= 19)
        {
            //apply 5% discount
            price_after_discount = total_price-(total_price * 0.05);
            //s2: apply another 5% if after disc > 5000
            if(price_after_discount > 5000)
            {
                price_after_discount = price_after_discount - (price_after_discount * 0.05);
            }//end of inner if
        }//end of outer if
        else if(age >= 20 && age <= 29)
        {
            price_after_discount = total_price - (total_price * 0.06);
            //s2: check new price is greater than 4000
            if(price_after_discount > 4000)
            {
                price_after_discount = price_after_discount - (price_after_discount * 0.06);
            }//end of inner if

        } //end of outer if
        else if(age>29){
            // s1: apply flat 15% discount
            price_after_discount = total_price - (total_price * 0.15);
        }
        // display the output
        // 1. total price
        System.out.println(total_price);
        // 2. total price after discount
        System.out.println(price_after_discount);
        // 3. discounted amount
        System.out.println(total_price - price_after_discount);
    }
}