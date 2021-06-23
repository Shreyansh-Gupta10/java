import java.util.Scanner;

public class ConditionalStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which operation is to be performed => Add, Sub, Mul");
        String option = sc.nextLine();
        System.out.println("Enter 1st num:");
        int num1 = sc.nextInt();
        System.out.println("Enter second num:");
        int num2 = sc.nextInt();
        int result = 0;
        switch(option){
            case "Add": result = num1+num2;
                      System.out.println("Addition is:"+ result);
                      break;
            case "Sub": result = num1-num2;
                      System.out.println("Suntraction is: "+result);
                      break;
            case "Mul": result = num1*num2;
                      System.out.println("Multiplication is :"+ result);
                      break;
            default: System.out.println("Invalid choice !!");
                      
        }
        // System.out.println("1: Addition \n2: Subtraction \n3: Multiplication ");
        // int choice = sc.nextInt();
        // System.out.println("Enter First number:");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second number:");
        // int num2 = sc.nextInt();
        // if(choice == 1){
        //     int result = num1 + num2;
        //     System.out.println("Addition result is: "+ result);
        // }
        // else if(choice == 2){
        //    int result = num1 - num2;
        //     System.out.println("Subtraction result is :"+ result);
        // }
        // else if(choice == 3){
        //     int result = num1 * num2;
        //     System.out.println("Multiplication result is:"+ result);
        // }
        // else{
        //     System.out.println("Invalid choice");
        // }
    }
}