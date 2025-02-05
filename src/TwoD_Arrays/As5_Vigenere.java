package TwoD_Arrays;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);
    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];


        for (int row = 0; row < square.length ; row++) {
            square[row] = alphabet;
            for (int col = 1; col < square.length ; col++) {
                square[row][0] = alphabet[row];

            }
        }


        return square;

    }//createVSquare

    public static void printSquare(char[][] square) {

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + " ");

            }
            System.out.println();
        }
    }//end printSquare

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

}//end class

