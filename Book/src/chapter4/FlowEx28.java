package chapter4;
// do-while문 : 블럭 먼저 수행 후 조건식 평가
// 자주 쓰이진 않음. 반복적으로 사용자의 입력을 받아서 처리할 때 유용

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;    // 1~100 사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            }else if(input < answer){
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        }while(input != answer);

        System.out.println("정답입니다.");
    }
}
