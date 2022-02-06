package chapter4;
// 숫자 중에 3의배수(3,6,9)가 포함되어 있으면, 포함된 개수만큼 박수치는 369게임을 1~100까지 출력하는 예제

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            System.out.printf("i=%d", i);

            int tmp = i;

            do{
                // tmp%10이 3의 배수인지 확인(0 제외)
                if(tmp%10%3 == 0 && tmp%10 != 0){
                    System.out.print("짝");
                }
            }while((tmp/=10)!=0);
            // tmp /= 10은 tmp = tmp / 10과 동일

            System.out.println();
        }
    }
}
