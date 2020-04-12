package myReviews_AllenTrader;
/**
 * class: KilogramToPounds.java
 * this program will display a table of conversion from kg to pounds
 * 1 kilogram is 2.2 pounds.
 */
public class KilogramToPounds {
    public static void main(String[] args) {

        System.out.printf("%-10s%10s\n","KG","POUNDS");
        System.out.println("---------------------");
        int kg = 1;
       // double lb = kg * 2.2;
        while(kg <= 199){
            System.out.printf("%-10d%10.1f\n",kg,kg * 2.2);
            kg += 2;
        }

    }
}


//kilograms    pounds
//   1         2.2
//   3         6.6


//  199        ...