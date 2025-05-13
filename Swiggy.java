import java.util.*;

public class Swiggy
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        long system_phone_number = 9876543210L;
        System.out.print("Enter your phone number : ");
        long user_phone_number = sc.nextLong();
        if(user_phone_number == system_phone_number){
            System.out.println("\t\tProccessing........");
            Thread.sleep(3000);
            int sys_OTP = (int) (Math.random() * 9999 + 9999);
            System.out.println("\t\tGenerate OTP : "+sys_OTP);
            System.out.print("\t\tEnter OTP : ");
            int user_OTP = sc.nextInt();
            if(sys_OTP == user_OTP){
                Thread.sleep(2000);
                System.out.println("\t\tLogin Successfully");
                System.out.println("----------------------------------------------------------------");
                System.out.println("Select any hotel");
                System.out.println("1. Buhari\n2. A2B\n3. S.S Hyderabad");
                System.out.println("-----------------");
                System.out.print("Enter hotel number  : ");
                int hotel_selection = sc.nextInt();
                switch(hotel_selection){
                    case 1:
                    {
                        // buhari
                        System.out.println("\t\t\tWelcome to Buhari");
                        System.out.println("\t\tSelect your favorite food");
                        System.out.println("\t\t1.Mutton Biryani\n\t\t2.Chicken Biryani\n\t\t3.Prawn Biryani");
                        System.out.print("Enter your choice : ");
                        int food_selection = sc.nextInt();
                        switch (food_selection)
                        {
                            case 1:
                            {
                                //MB
                                double price = 380;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            case 2:
                            {
                                //CB
                                double price = 250;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){ 
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            case 3:
                            {
                                //PB
                                double price = 320;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){ 
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            default:
                            {
                                System.out.println("invalid food selection");
                                break;
                            }
                        }
                        break;
                    }
                    case 2 :
                    {
                        //A2B
                        System.out.println("\t\t\tWelcome to A2B");
                        System.out.println("\t\tSelect your favorite food");
                        System.out.println("\t\t1.Mushroom Biryani\n\t\t2.Gobi Fried Rice\n\t\t3.BabyCorn Fry");
                        System.out.print("Enetr your choice : ");
                        int food_selection = sc.nextInt();
                        switch (food_selection)
                        {
                            case 1:
                            {
                                //MB
                                double price = 220;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            case 2:
                            {
                                 //GFR
                                double price = 230;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2)
                                    {
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            case 3:
                            {
                                //BCF
                                double price = 180;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            default:
                            {
                                System.out.println("invalid food selection");
                                break;
                            }
                        }
                        break;
                    }
                    case 3 :
                    {
                        //SS Hyderabad
                        System.out.println("\t\t\tWelcome to SS Hyderabad");
                        System.out.println("\t\tSelect your favorite food");
                        System.out.println("\t\t1.Mutton Biryani\n\t\t2.Hyderabed Special Biryani\n\t\t3.Mutton Chukka");
                        System.out.print("Enter your choice : ");
                        int food_selection = sc.nextInt();
                        switch (food_selection)
                        {
                            case 1:
                            {
                                //MB
                                double price = 350;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            case 2:
                            {
                                 //HSB
                                double price = 400;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2)
                                    {
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            case 3:
                            {
                                //MC
                                double price = 290;
                                System.out.print("Enter the quantity : ");
                                int quantity = sc.nextInt();
                                double total_bill = price * quantity;
                                System.out.println("\t\tThe total bill : "+total_bill);
                                System.out.print("\t\tTo confirm your order press 1 for yes and press 2 for no :");
                                int confirmation = sc.nextInt();
                                if(confirmation == 1){
                                    System.out.println("\t\tYour order is confirm");
                                    System.out.println("redirecting to payment mode");
                                    Thread.sleep(2000);
                                    System.out.println("-----------------------------------------------------");
                                    System.out.println("\t\tSelect payment mode");
                                    System.out.println("\t\t1.G-pay\n\t\t2.Phone Pay");
                                    System.out.print("\t\tChoose the method : ");
                                    int payment_method = sc.nextInt();
                                    if(payment_method == 1){
                                        int mpin = 1234;
                                        System.out.print("\t\tEnter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                    else if(payment_method == 2){
                                        int mpin = 1234;
                                        System.out.print("Enter your mpin : ");
                                        int user_mpin = sc.nextInt();
                                        if(mpin == user_mpin){
                                            System.out.print("\t\tEnter amount : ");
                                            int user_amount = sc.nextInt();
                                            if(total_bill == user_amount)
                                            {
                                                System.out.println("\t\tYour order is Placed");
                                                System.out.println("\t\tYour order delivered on time");
                                                System.out.println("\t\tThank for visiting");
                                            }
                                            else
                                            {
                                                System.out.println("\t\tYour order is Failed");
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("\t\tYour MPIN is invalid");
                                        }
                                    }
                                }
                                else if(confirmation == 2){
                                    System.out.println("\t\tyour order will be cancel...visit again");
                                }
                                break;
                            }
                            default:
                            {
                                System.out.println("invalid food selection");
                                break;
                            }
                        }
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid hotel selection");
                        break;
                    }
                }

            }
            else{
                System.out.println("\t\t\tInvalid OTP");
            }
        }
        else{
            System.out.println("\t\t\tLogin Failed");
        }
    }
}
