import java.util.Scanner;

public class Encryption {

        public static String encrypt(String sonk){
            int array[] = new int[4];
            for (int i = 0; i < 4; i++){
                char ch = sonk.charAt(i);
                array[i] = Character.getNumericValue(ch);
            }
            for (int i = 0; i < 4; i++) {
                int temp = array[i];
                temp += 7;
                temp = temp % 10;
                array[i] = temp;
            }
            int temp = array[0];
            array[0] = array[2];
            array[2] = temp;
            temp = array[1];
            array[1] = array[3];
            array[3] = temp;
            int finalNumb = 0;
            for (int i = 0; i < 4; i++)
                finalNumb = finalNumb * 10 + array[i];
            String answer = Integer.toString(finalNumb);
            if (array[0] == 0)
                answer = "0" + answer;
            return answer;
        }


}
