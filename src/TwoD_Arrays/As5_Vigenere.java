package TwoD_Arrays;

public class As5_Vigenere {
    public static void run() {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);


        System.out.println("Please enter a keyword for decrypting");
        String key = Library.input.nextLine();

        System.out.println("Please enter an encrypted message");
        String encrypted = Library.input.nextLine();



        printSquare(vigenere);

        System.out.println("The Decrypted message is:");
        System.out.println(decrypt(encrypted, vigenere, key));

//        System.out.println(decrypt("OGOGTSEYNTVCKA",vigenere));
//        System.out.println(decrypt("XWBGIEGGJILJHJOVKARNKKCAADCFEAQU",vigenere));
//        System.out.println(decrypt("LJOGCGWDEIWKGBNWJOADKQARFWNZBW",vigenere));

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


    public static char[] decrypt(String codedMessage, char[][] arr, String key) {

        char[] keyword = key.toCharArray();
        char[] cipherText = codedMessage.toCharArray();
        char[] decipheredMessage = new char[cipherText.length];

        for (int i = 0; i < cipherText.length; i++) {
            int keyIndex = linearSearch(arr[0], keyword[i % keyword.length]);
            int colNum = linearSearch(arr[keyIndex], cipherText[i]);
            decipheredMessage[i] = arr[0][colNum];

        }

        return decipheredMessage;
    }
}//end class
