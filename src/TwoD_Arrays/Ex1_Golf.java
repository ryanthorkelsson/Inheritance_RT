package TwoD_Arrays;

public class Ex1_Golf {


    public static void run(){
        String[] names = { "Joe", "Marina", "Bill","Stu"};
        int[][] scorecard = new int[4][18];


        scorecard[0][0] = 4;
        scorecard[1][0] = 5;
        scorecard[2][0] = 6;
        scorecard[3][0] = 7;

        scorecard[0][1] = 5;
        scorecard[1][1] = 5;
        scorecard[2][1] = 8;
        scorecard[3][1] = 9;


        for(int row = 0 ; row < scorecard.length ; row++){
            int total =0;
            for(int col =0; col<scorecard[row].length;col ++){
                    System.out.print(scorecard[row][col] + "   " );
                    total += scorecard[row][col];
            }//2nd for
            System.out.println("   " + names[row] + "  Total:  " + total);
        }//for

        for (int col = 0; col < 18; col++) {
            int colTotal =0;
            for (int row = 0; row < scorecard.length; row++) {
                colTotal += scorecard[row][col];
            }
            System.out.print(colTotal + "  ");
        }

    }//run
}//TwoD_Arrays
