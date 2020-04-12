package myReviews_AllenTrader;

public class HexDigit2Dec {
    //0 1 2 3 4 5 6 7 8 9 A B C D E F --> 16 NUMBERS BUT STARTS FROM 0
    //67 IN Hexadecimal  -->  7 * 16^0 = 7   6 * 16^1 = 96   7 + 96 = 103 in decimal number
    // 1A in hexadecimal   A 10 * 16^0  = 10 + ( 1* 16^1) = 10 + 16 = 26

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = input.nextLine();

        //check if the hexa String value (hexString) has exactly one character.
        //0 0 * 16^0 = 0  1 * 16^0 = 1
       if(hexString.length() != 1){
           System.out.println("You must enter one character. ");
       }

       //display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
       if('A' <= ch && ch <= 'F'){
          int value =  ch - 'A' + 10;  //'F' 'F' - 'A' + 10  70 - 65 + 10 = 15
           System.out.println("The decimal value for hex digit " + ch  +  " is " + value);
       }
       else if(Character.isDigit(ch)){
            System.out.println("The decimal value for hex digi " + ch + " is " + ch);
        }
     else{
           System.out.println(ch + " is an invalid input.");
       }
    }
}
