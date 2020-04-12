package myReviews_AllenTrader;

public class PatternDiff {
    public static void main(String[] args) {
         int number = 0; //number to print
        for(int row = 0; row <= 5; row++){

            //leading blank but we will use *
            for(int col = 1; col <= 5 - row; col++){
                System.out.printf("%4s"," ");
            }
            for(int col = 0; col <= row; col++){
               number =  (int)Math.pow(2,col);
                System.out.printf("%4d",number);
            }
            System.out.println();

        }

    }
}





/**
 *                  1
 *              1   2
 *           1  2   4
 *        1  2  4   8
 *      1.2  4  8  16
 *     1..4  8 16  32
 *    1.. 8 16 32  64
 *   1.. 16 32 64 128
 */
