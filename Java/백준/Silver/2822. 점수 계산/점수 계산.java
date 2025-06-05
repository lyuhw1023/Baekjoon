import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        int[] score = new int[8];       //8개의 점수 담을 배열
        int[] cpScore = new int[8];     //배열 복사
        int[] low = new int[3];         //낮은 점수 3개의 인덱스 담을 배열(속도 빠르게 하기 위해)
        int sum = 0;
        for(int i = 0; i < 8; i++){
            score[i] = Integer.parseInt(br.readLine());
        }
        cpScore = Arrays.copyOf(score, 8);
        Arrays.sort(score);             // 작은 순서부터 정렬

        //작은거 3개 인덱스 low에 저장
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < score.length; j++){
                if(score[i] == cpScore[j]){
                    low[i] = j;
                }
            }
        }

        //합계 계산
        for(int i = 0; i < score.length; i++){
            if(i == low[0] || i == low[1] || i == low[2]){
                continue;
            }
            sum += cpScore[i];
        }

        //결과 출력
        System.out.println(sum);
        for(int i = 0; i < score.length; i++){
            if(i == low[0] || i == low[1] || i == low[2]){
                continue;
            }
            System.out.print((i+1) +" ");
        }
    }
}