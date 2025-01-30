package TwoD_Arrays;

import java.util.Arrays;

public class As1_Bingo {

        public static void run(){

            char[] bingo = {'B','I','N','G','O'};
            int[][] bingoCard = new int[5][5];

            bingoCard[0] = generateArray(5,1,15);
            bingoCard[1] = generateArray(5,16,30);
            bingoCard[2] = generateArray(5,31,45);
            bingoCard[3] = generateArray(5,46,60);
            bingoCard[4] = generateArray(5,61,75);


            for (int row = 0; row < bingoCard.length; row++) {
                for (int col = 0; col < bingoCard.length; col++) {
                    System.out.print(bingo[row] + "  " + bingoCard[row]);
                }
                System.out.println();
            }
            
        }//run

        public static int[] generateArray(int length, int min, int max){

            int[] newArr = new int[length];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = Library.myRandom(min,max);
            }

            return newArr;
        }//generateArray

}
