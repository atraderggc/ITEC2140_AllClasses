package myReviews_AllenTrader;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for(int i = 1; i < 5; i++){
            int j = 0;
            while(j < i){
                System.out.print(j + " ");
                j++;
            }
        }
    }
}
