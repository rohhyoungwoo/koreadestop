package ifTest;

import java.util.Scanner;

public class IfTest04 {
	public static void main(String[] args) {
		// 삼향연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
		// => if ~ else if ~ else문으로 변경

		// 1. 입력 클래스 import
		// 2. 변수 선언 int 2개
		// 3. 입력 메시지 출력
		// 4. 입력 메소드
		// 5. 조건문(if ~ else if ~ else문)
		// 5-1) if (변수1 > 변수2 {
		// 5-2) 변수1이 변수2보다 큽니다 출력
		// 5-3) }else if(변수1 == 변수2){
		// 5-4) 변수1과 변수2가 같습니다 출력
		// 5-5) }else{
		// 5-6) 변수2가 변수1도바 큽니다 출력
		// }

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("두 수 입력(띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 > num2) {
//			System.out.println(num1 + "이 " + num2 + "보다 큽니다");
			System.out.printf("%d가 %d보다 %d 더 큽니다", num1, num2, (num1 - num2));
		} else if (num1 == num2) {
			System.out.println(num1 + "과 " + num2 + "가 같습니다");
		} else {
			System.out.printf("%d가 %d보다 %d 더 큽니다", num2, num1, (num2 - num1));
		}

	}
}
