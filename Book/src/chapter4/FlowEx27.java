package chapter4;

import java.util.Scanner;

// 반복해서 숫자를 입력받다가 0을 입력하면 총 합을 출력해보자

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;  // while문의 조건식으로 사용될 변수
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하시오.(끝내려면 0을 입력)");

        while(flag) {       //flag 값이 true 이므로 조건식은 참이 된다.
            System.out.print(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0) {
                sum += num; //  num이 0이 아니면, sum에 더한다.
            } else {
                flag = false; // flag의 값을 false로 변경.
            }
        }

        System.out.println("합계:"+sum);
    }
}
