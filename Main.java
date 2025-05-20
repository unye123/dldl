public class SumEvenNumbers  {
    public static void main(String[] args) {
        // 합계를 저장할 변수 초기화
        int sum = 0;

        // 모든 수를 검사하고 짝수만 더하는 방법
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println
                    ( "1부터 1000까지의 짝수의 합: " + sum );
    }
}
