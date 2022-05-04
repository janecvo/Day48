public class Casting {
        public static void main(String[] args) {
            double deci = 112.35;
            System.out.println("Double:  " + deci);
            
            int num  = (int)deci;
            System.out.println("Int: " + num);

            String str = "49";
            System.out.println("The string value is: " + str);

            int num2 = Integer.parseInt(str);
            System.out.println("The integer value is: " + num2 );

        }
}
