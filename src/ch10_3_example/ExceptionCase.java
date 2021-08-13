package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받아서 나누고 입력받은 숫자와 나누기 결과를 출력하시오 
//		예 ) 3 ,4 3/4 나누기 실행하고 
		
		Scanner scn = new Scanner(System.in); 
	
		
		try {
			System.out.print("첫 번째 수를 입력하세요.");
			int x = scn.nextInt(); //String 으로 	받을 때는 .nextLine Int로 받을때는 .nextInt
			System.out.print("두 번째 수를 입력하세요.");
			int y = scn.nextInt();
			
			if (y == 0) {
				throw new DivideZeroexception();
			}
			
			System.out.printf("%d / %d = %d\n " + x, y, x/y) ;
		
		} catch (DivideZeroexception e) {
			System.out.println("y의 값에 0이 올 수 없습니다.");
		} catch (Exception e) { 
			System.out.println("실행에 오류가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println("프로그램 종료");

	
	}

}

class DivideZeroexception extends Exception {
	@Override
	public String toString() {
	return "두번째 수에 0이 올 수 없습니다.";
	}
}
