package chapter5;

//총합과 평균 구하기

class ArrayEx5 {
    public static void main(String[] args){
        int sum = 0;    //총점
        float average = 0f;     //평균

        int[] score = {100, 88, 100, 90, 100};

        for(int i=0; i<score.length; i++){
           sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }

}
