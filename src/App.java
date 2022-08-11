import java.util.Scanner;


public class App {

    
       
        public String DecimalToHex(int num)//Method to Convert Decimal Number to Hexa Decimal number
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
            return hexVal;
        }
        public String DecimalToBin(int num)//Method to Convert Decimal Base 10 number  to a Binary base 2
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
           
            return binAnswer;
        }
        public int binToDecimal(String val)
        {
            int decNum = Integer.parseInt(val,2);
            return decNum;
        }
        
       
    public static void main(String[] args) 
    {
        App me =new App();//Class Object

        Scanner user_input = new Scanner(System.in);
        //String val = user_input.nextLine();
       System.out.println("Number System Converter");
       System.out.println("");
       System.out.println("1 - Decimal to Hexadecimal");
       System.out.println("2 - Decimal to Binary");
       System.out.println("3 - Binary to Decimal");
       System.out.println("");
       
       System.out.println("Option");
       

        
    }
}
