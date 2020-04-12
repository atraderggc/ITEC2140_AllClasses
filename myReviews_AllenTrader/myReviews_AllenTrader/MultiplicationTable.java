package myReviews_AllenTrader;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("        Multiplication Table");
        System.out.println("---------------------------------------------");
        for(int i = 1; i <= 9; i++){
            System.out.print(i + "|");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%4d", i * j);
                //printf is for formatting the output. starting with %WIDTH_TYPE --> %4d for integer
                //%10f for double or float
            }
            System.out.println();
        }

    }
}
