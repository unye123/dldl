//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100) {
            System.out.println("1에서 100사이의 값입니다");
        } else {
            System.out.println("1에서 100사이의 값이 아닙니다");
        }

        scanner.close();
    }
}