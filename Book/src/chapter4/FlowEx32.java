package chapter4;
// continue, break 사용해서 메뉴를 보여주고 선택하는 예제
// while문 안에 break문이 수행되면 그 뒤 while문이 실행되지 않고 벗어난다.
// while문 안에 continue문이 수행되면 블럭의 끝으로 이동한다. break 와는 다르게 반복문을 벗어나지 않는다.

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴 (1~3)를 선택하세요. (종료:0)>");

            String tmp = scanner.nextLine();   //화면에서 입력받은 내용을 tmp에 저장
            menu = Integer.parseInt(tmp);   //입력받은 문자열 (tmp)을 숫자로 변환

            if(menu==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(!(1 <= menu && menu <= 3)){
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
                continue;
            }

            System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
        }
    }
}
