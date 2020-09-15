import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        System.out.print("Please enter a 4 digit number: ");
        String sonk = jb.nextLine();
        String encryptedNumber = Encryption.encrypt(sonk);
        System.out.println("The encrypted number is:" + encryptedNumber);
    }
}
