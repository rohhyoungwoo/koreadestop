package ex04_노형우;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//로직구성
		//입력 클래스 import
		//Student 객체 생성 (이름과 점수)
		//세 과목의 점수 입력 메시지 출력
		//입력 메소드 사용하여 세 과목 점수를 받는다
		//총점과 평균 구하는 메소드를 사용한다
		
		Scanner sc = new Scanner(System.in);
		

		Student score = new Student("노형우", 0, 0, 0);
		int java = 0;
		int dbms = 0;
		int html = 0;
		System.out.println("java 점수를 입력하세요 : ");
		java =sc.nextInt();
		System.out.println("dbms 점수를 입력하세요 : ");
		dbms = sc.nextInt();
		System.out.println("html 점수를 입력하세요 : ");
		html = sc.nextInt();
		score.getTotalScore(java, dbms, html);
		score.getAverageScore(score.getTotalScore(java, dbms, html));
		System.out.println("총점과 평균 : " + score.getTotalScore(java, dbms, html) + "," + score.getAverageScore(score.getTotalScore(java, dbms, html)) );
	}
}
