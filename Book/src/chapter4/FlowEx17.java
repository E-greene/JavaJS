package chapter4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.print("* 을 출력할 라인의 수를 입력하세요>: ");
        String tmp = sc.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
        num = Integer.parseInt(tmp);  // 입력받은 문자열(tmp)을 숫자로 변환 nextInt() 한방에 될듯?

        for (int i = 0; i < num; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}