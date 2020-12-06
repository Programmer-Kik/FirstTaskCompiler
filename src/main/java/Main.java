import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = in.nextLine();
        System.out.print("Введите кол-во символов, которые нужно пропустить: ");
        int skip = in.nextInt();

        Automat automat = new Automat();

        automat.isDigit(line, skip).Print();
    }
}
