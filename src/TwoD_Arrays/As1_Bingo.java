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
                System.out.print(bingo[row]);
                for (int col = 0; col < bingoCard.length; col++) {
                    System.out.print("  " + bingoCard[row][col]);
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Press Enter to get a number");

            while (true){

                Library.input.nextLine();
                int drawNum = Library.myRandom(1,75);
                System.out.println("The number drawn is: " + drawNum);
                System.out.println();
                System.out.println("Press ENTER to get another number");


                boolean foundNum = false;

                for (int row = 0; row <bingoCard.length ; row++) {
                    for (int col = 0; col <bingoCard.length ; col++) {
                        if(drawNum == bingoCard[row][col] && !(bingoCard[row][col] < 0)){
                            bingoCard[row][col] *= -1;
                            foundNum = true;
                        }
                    }
                }//for

                if(!foundNum){
                    System.out.println();
                    System.out.println("Not found");
                    System.out.println();
                }

                for (int row = 0; row < bingoCard.length; row++) {
                    System.out.print(bingo[row]);
                    for (int col = 0; col < bingoCard.length; col++) {
                        System.out.print("  " + bingoCard[row][col]);
                    }
                    System.out.println();
                }//for

                boolean win = false;
                for (int i = 0; i < bingoCard.length; i++) {
                    if(checkCol(bingoCard,i ) != -1){
                        System.out.println("BINGO! You Win!");
                        win = true;
                        break;
                    }
                }

                for (int i = 0; i < bingoCard.length; i++) {
                    if(checkRow(bingoCard[i]) != -1){
                        System.out.println("BINGO! You Win!");
                        win = true;
                        break;
                    }
                }
                if(checkDiag(bingoCard) != -1){
                    System.out.println("BINGO! You Win!");
                    win = true;
                    break;
                }
                if(win){
                    break;
                }

            }//while

        }//run

        public static int[] generateArray(int length, int min, int max){

            int[] newArr = new int[length];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = Library.myRandom(min,max);
            }

            return newArr;
        }//generateArray

        public static int checkRow(int[] row){
            int counter =0;
            for (int i = 0; i < row.length; i++) {
                if(row[i] < 0){
                    counter ++;
                }
            }
            if(counter >4){
                return 1;
            }
            return -1;
        }

        public static int checkCol(int[][] grid, int colNum){
            int counter =0;
            for (int i = 0; i < grid.length; i++) {
                if(grid[i][colNum] <0){
                    counter ++;
                }
            }
            if(counter >4){
                return 1;
            }
            return -1;
        }

        public static int checkDiag (int[][] arr){
            //Diagonal Down Right
            if((arr[0][0] < 0)  && (arr[1][1] <0)  && (arr[2][2] <0) && (arr[3][3] <0) && (arr[4][4] <0)){
                return 1;
            }

            //diagonal Up Right
            if((arr[0][4] <0) && (arr[1][3] <0) && (arr[2][2] <0) && (arr[3][1] <0) && (arr[4][0] <0)){
                return 1;
            }
            return -1;
        }

}
