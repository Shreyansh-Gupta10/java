import java.io.*;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        // int input1 = sc.nextInt();
        // String s = sc.nextLine();
        // char c = sc.next().charAt(3);
        // System.out.println(input1);
        // System.out.println(s);
        // System.out.println(c);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String s = reader.readLine();
    System.out.println(s);
        
    }
    
}
