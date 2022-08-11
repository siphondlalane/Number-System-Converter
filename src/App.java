import java.util.Scanner;


public class App {

    
        public int getNum()
        {
            Scanner user_input = new Scanner(System.in);
            int num = user_input.nextInt();
            if (num >= 0 && num <= 1000)
            {
                return num;
            }
            else{
                System.out.println("Invalid number, Enter 0 - 1000");
                 user_input = new Scanner(System.in);
                 num = user_input.nextInt();
            }
            return '\0';
        }
        public void DecimalToHex(int num)//Method to Convert Decimal Number to Hexa Decimal number
        {
            char[] hex = {'0','1','2','3','4','5','6','7'
                ,'8','9','A','B','C','D','E','F'};
            String hexVal = "";
            int rem; 

            while(num > 0)
            {
                rem = num % 16;
                hexVal = hex[rem]+hexVal;
                num = num / 16;
            }
            System.out.println("Hexadecimal value: "+hexVal);
        }
        public void DecimalToBin(int num)//Method to Convert Decimal Base 10 number  to a Binary base 2
        {
            String binAnswer = "";
            int bin[] = new int [100];
            int i=0;
            while(num!=0)
            {
                bin[i]= num % 2;
                num = num / 2;
                i++;
            }
            for(int j = i-1; j>=0; j--)
            { 
                binAnswer = binAnswer + bin[j];
            }
           
            System.out.println("Binary value: "+binAnswer);
        }
        public void binToDecimal(String val)
        {
            int decNum = Integer.parseInt(val,2);
            System.out.println("Decimal value: "+decNum);
        }
        
       
    public static void main(String[] args) 
    {
        App me =new App();//Class Object
        int val;
        
        //String val = user_input.nextLine();
       System.out.println("Number System Converter");
       System.out.println("");
       System.out.println("1 - Decimal to Hexadecimal");
       System.out.println("2 - Decimal to Binary");
       System.out.println("3 - Binary to Decimal");
       System.out.println("");
       
       System.out.print("Option (0 to Exit): ");
       Scanner user_input = new Scanner(System.in);
       int opt = user_input.nextInt();
        while(opt!=-1)
        {
            switch(opt)
            {
                case 0:
                System.exit(0);
                case 1:
                System.out.print("Decimal value(0 - 1000): ");
                     val = me.getNum();
                    me.DecimalToHex(val);
                break;

                case 2:
                System.out.print("Decimal value(0 - 1000): ");
                    val = me.getNum();
                    me.DecimalToHex(val);
                    me.DecimalToBin(val);
                break;
             
                case 3:
                    System.out.print("Binary value: ");
                    Scanner input = new Scanner(System.in);
                    String bin = input.nextLine();
                    me.binToDecimal(bin);
                break;

                default:
                    System.out.println("Invalid Option");
            }

            System.out.println("");
            System.out.println("Number System Converter");
            System.out.println("");
            System.out.println("1 - Decimal to Hexadecimal");
            System.out.println("2 - Decimal to Binary");
            System.out.println("3 - Binary to Decimal");
            System.out.println("");
       
       System.out.print("Option(0 to Exit): ");
        user_input = new Scanner(System.in);
        opt = user_input.nextInt();
    }

        
    }
}
