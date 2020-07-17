package weondal;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// 연산의 달인
		// 1. 더하기
		// 2. 빼기
		// 3. 곱하기
		// 4. 나누기
		// 0. 종료
		// 1 -> 더하기 문제가 10문제 정도 나오고
		// 정답수와 틀린수를 출력 해주고 다시 위의 메뉴 출력
		// 그외 연산도 위와 같은 방식으로
		// 문자가 입력되면 예외처리까지 해보세요~
		// 메인 메소드에는 최소한의 코드만 있고
		// 다 클래스에 매소드로 구현 해보세요~
		// 클래스는 도저히 만들기 힘드면 메인 메소드에 다 서놓고
		// 나중에 짤라내기 하는게 편할 수 있다.
		Scanner sc = new Scanner(System.in);
		MyClass mc = new MyClass();
		for (;;) {
			try {
				System.out.println("김보권의 연산의 달인!");
				System.out.println("어떤 기능을 사용하시겠습니까?");
				System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 0. 종료");
				int choice = sc.nextInt();
				if (choice == 1) {
					mc.addition();
				} else if (choice == 2) {
					mc.subtraction();
				} else if (choice == 3) {
					mc.multiplication();
				} else if (choice == 4) {
					mc.division();
				} else if (choice == 0) {
					System.out.println("김보권의 연산의 달인을 종료합니다!");
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못 입력 하였습니다.");
			}
		}
	}

}
