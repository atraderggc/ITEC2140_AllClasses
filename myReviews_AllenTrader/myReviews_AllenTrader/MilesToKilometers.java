package myReviews_AllenTrader;
/**
 * MilesToKilometers.java
 * This program will display a table of Miles and Kilometers
 * 1 mile is 1.609 kilometers
 */
public class MilesToKilometers {
    public static void main(String[] args) {
        //use the while loop
        System.out.println("Miles\t\tKilometers");
        System.out.println("----------------------");

     //   int miles = 1;
        /**
        while( miles <= 20){
            System.out.println(miles + "\t\t" + miles * 1.609);
            miles++;
        }
        **/
        //for loop

        for(int miles = 1; miles <= 20; miles++){
            System.out.println(miles +"\t\t" + miles * 1.609);
        }
    }
}
