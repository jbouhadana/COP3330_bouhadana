import java.util.Scanner;

public class Decryption {
    public static String decrypt(String sonk) {
        int array[] = new int[4];
        for (int i = 0; i < 4; i++) {
            char ch = sonk.charAt(i);
            array[i] = Character.getNumericValue(ch);
        }
        int temp = array[0];
        array[0] = array[2];
        array[2] = temp;
        temp = array[1];
        array[1] = array[3];
        array[3] = temp;
        for (int i = 0; i < 4; i++) {
            int yessir = array[i];
            switch (yessir) {
                case 0:
                    array[i] = 3;
                    break;
                case 1:
                    array[i] = 4;
                    break;
                case 2:
                    array[i] = 5;
                    break;
                case 3:
                    array[i] = 6;
                    break;
                case 4:
                    array[i] = 7;
                    break;
                case 5:
                    array[i] = 8;
                    break;
                case 6:
                    array[i] = 9;
                    break;
                case 7:
                    array[i] = 0;
                    break;
                case 8:
                    array[i] = 1;
                    break;
                case 9:
                    array[i] = 2;
                    break;
            }
        }
        int finalNumb = 0;
        for (int i = 0; i < 4; i++)
            finalNumb = finalNumb * 10 + array[i];
        String answer = Integer.toString(finalNumb);
        if (array[0] == 0)
            answer = "0" + answer;
        return answer;
    }

}

