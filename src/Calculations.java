import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = Integer.valueOf( scanner.nextLine());
    
        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int add = num1 + num2;
        System.out.println(num1 + "+" +  num2  +"=" + add);
        int sub = num1 - num2;
        System.out.println(num1 + "-" +  num2  +"=" + sub);
        int mult = num1 * num2;
        System.out.println(num1 + "*" +  num2  +"=" + mult);
        double div = (double)num1 /num2;
        System.out.println(num1 + "/" +  num2  +"=" + div);
        int mod = num1%num2;
        System.out.println(num1 + "%" +  num2  +"=" + mod);
}
}

