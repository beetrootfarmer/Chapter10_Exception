package ch10_3_example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionCase2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// n1혹은 n2가 String 으로 입력된다면 예외 
		// double 형으로 온전한 결과를 만들
			//wrap class로 해결하기
//		Double d = new Double(0.0);
//		d.NaN(){}
		
		
		

		try {
			System.out.print("a/b...a?>");
			double n1  = sc.nextInt();
//			double n3 = double.parseDouble(n1);
			
			System.out.print("a/b...b?>"
					);
			double n2 = sc.nextInt();
			
			if(Double.isInfinite(n1/n2)) {
				throw new ArithmeticException();
			}
			if (n2 == 0) {
				throw new DivideZeroexception();
			} 
			
			
			System.out.printf("%f / %f = %f\n" , n1, n2, n1/n2);
		
		
			
		} catch (DivideZeroexception e) {
			System.out.println("n2의 값에 0이 올 수 없습니다.");
		} catch (InputMismatchException e) { //클래스마다 소속이 달라서 import가 필요하고 필요없는 클래스가 있다. 
			System.out.println("숫자를 입력하세요.");
		} catch ( Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}

}

//땡 
//		if  ( n1 instanceof String) {
//			throw new InputMismatchException();
//		} else if ( n2 instanceof String) 
//			throw new InputMismatchException();
//	} 