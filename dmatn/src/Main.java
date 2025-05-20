import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;             // 점수 총합
        int count = 0;           // 입력된 점수 개수

        while (true) {
            System.out.print("점수를 입력하세요 (음수 입력 시 종료): ");
            int score = scanner.nextInt();

            if (score < 0) {
                break;
            }

            sum += score;
            count++; // 점수가 하나 입력될 때마다 개수 증가
        }

        if (count == 0) {
            System.out.println("입력된 점수가 없습니다.");
        } else {
            System.out.println("입력된 점수의 총합은: " + sum);
        }

        scanner.close();
    }
}
