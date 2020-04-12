package myReviews_AllenTrader;

public class PatternTriangle {
    public static void main(String[] args) {

        for(int outLoop = 1; outLoop <= 6; outLoop++ ){

            for(int innerLoop = 1; innerLoop <= 7 - outLoop; innerLoop++){
                System.out.print(innerLoop + " ");
            }
            System.out.println();
        }



    }
}



//  1  2  3  4  5  6
//  1  2  3  4  5
//  1  2  3  4
//  1  2  3
//  1  2
//  1