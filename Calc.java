//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calc {
    public static void main(String[] args) {
        int kor = 85;
        int eng = 92;
        int mat = 78;
        int sci = 95;
        int subjectCount = 4;

        int totalScore = kor + eng + mat + sci;
        int integerAverage = totalScore / subjectCount;

        System.out.println("=== 형변환 없는 평균 계산 ===");
        System.out.println("총점: " + totalScore);
        System.out.println("정수 나눗셈 평균: " + integerAverage);

        double floatAverage = (double) totalScore / subjectCount;

        System.out.println("\n=== 형변환을 사용한 평균 계산 ===");
        System.out.println("실수 나눗셈 평균: " + floatAverage);
        System.out.printf("실수 나눗셈 평균 (소수점 둘째 자리): %.2f\n", floatAverage);

        System.out.println("\n=== 자료형 논리 비교 ===");
        System.out.println("정수 평균과 실수 평균이 같은지: " + (integerAverage == floatAverage));

        String passStatus = floatAverage >= 80 ? "합격" : "불합격";
        System.out.println("평균 80점 이상 합격 여부: " + passStatus);
    }
}