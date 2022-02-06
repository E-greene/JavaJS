package chapter4;

public class FlowEx23 {
    public static void main(String[] args){
        int i = 5;

        while(--i!=0){
            System.out.println(i + " - I can do it.");
        }

        System.out.println("======================");
        // i-- 는 후위형이라 조건식이 평가된 후에 i의 값이 감소함다.
        int j = 5;

        while(j--!=0){
            System.out.println(j + " - I can do it.");
        }
        System.out.println("======================");

        int k = 5;

        while(k!=0){
            k--;
            System.out.println(k + " - I can do it.");
        }
    }
}
