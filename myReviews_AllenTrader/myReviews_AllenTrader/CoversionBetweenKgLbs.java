package myReviews_AllenTrader;

public class CoversionBetweenKgLbs {
    public static void main(String[] args) {

        int kg = 1;
        int pounds = 20;
            System.out.printf("%-14s%14s    |    %-14s%14s\n","Kilograms","Pounds","Pounds","Kilograms");

        while(kg <= 200){

            System.out.printf("%-14d%14.1f    |    %-14d%14.2f\n",kg,kg * 2.2, pounds, pounds / 2.2);
            kg++;
            pounds += 5;
        }

    }

}

//kg  pounds      | pounds  kg
//1   2.2         | 20      9.09
//2   4.4         | 25      ....