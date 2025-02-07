package TwoD_Arrays;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);


    }//end run

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];


        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = alphabet[(row + col) % 26];


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
    }//end linearSearch

    public static char getChar(char[][] arr, int row, int col) {
        return arr[row][col];
    }//getChar


    public static char[] decrypt(String cipherText, char[][] arr) {
        char[] keyWord = {'S', 'C', 'O', 'N', 'A'};
        char[] textArr = cipherText.toCharArray();
        char[] n = new char[textArr.length];

        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < keyWord.length; j++) {
                int index1 = linearSearch(arr[0], textArr[i]);
                int index2 = linearSearch(arr[][0])
            }
        }
        return n;
    }

}//end class

