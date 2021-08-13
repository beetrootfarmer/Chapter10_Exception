package ch10_3_example;

class Calculator3 {

	// [Excepetion] 업무적으로 x, y값은 1000을 넘으면 에러 !
	// [Excepetion] 업무적으로 x, y값은 음수이면 에러 !
	public static int add(int x, int y) throws BizThousandOverException, BizNegativeNumberException { // 클래스.메소드로 호출하려면
																										// 메소드는 public
																										// static void의
																										// 형이 되어야한다.
		int result = x + y;
		if (result > 1000) {
			throw new BizThousandOverException();
		}
		if (result < 1000) {
			throw new BizNegativeNumberException();
		}
		return result;

		// [Excepetion] 업무적으로 x, y값은 음수이면 에러 !
	}

	public static int sub(int x, int y) throws BizNegativeNumberException {
		int result = x - y;
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
		return result;
	}

	public static int multi(int x, int y) {
		int result = x * y;
		return result;
		// [Excepetion] 업무적으로 x, y값은 음수이면 에러 !
	}

	public static int div(int x, int y) throws BizDivideByZeroException {
		int result = x / y;
		if (y == 0) {
			throw new BizDivideByZeroException();
		}
		return result;
	}
}

class MyClass {
	void method() {
		MyClass my = new MyClass();

	}
}

public class BizThousandOverException extends Exception {
	@Override
	public String toString() {
		return "결과값이 1000을 넘습니다. 확인요망!";
	}
	@Override
	public String getMessage() {
		return "입력 에러";
	}
	

	public static void main(String[] args) {
	}
}

/**
 * [오류] - 구문오류 : 문법오류 ... 치명적이지 않음 , 컴파일 시 수정가능 ex) char ch = 3.14; 야근각 - 논리오류 :
 * 개발자 코딩 오류 ... 치명적임 , 문법적인 문제 제외 , 수식계 ex) ("원의 넓이 = pr * pr * pr * 3. 14") -
 * 예외 : 입력값, 입출력 관련, 물리적 장치 사용 ... ex) 외부 환경의 변화에 따른 실행 오류. 특정 상황에서 예외적으로 밣생하는
 * 오류.
 *
 * [예외를 처리한다?] - 무엇을 처리? - 어디서 처리?
 * 
 * 예시 ) 파일 입출력 시 API 이용 : API 함수에서 예외를 (보고없이) 알아서 처리한다면...?
 *
 * write() { 권한 파일존재 파일용량... }
 **/
//	 [ 오류발생 클래스에서 예외 객체 던지기 throw]
//class Library {
//		public static void  write() trows InterruptedException {
//				Thread.sleep(1000); {
//
//	}
//}
//
////	[ try catch로 받기 ]
//class Program
//		public static void main(String[] args) {
//	
//	try {	
//	 Library.write(); // write 메소드를 받는
//	} catch(InterruptedException e) {
//			e.printStackTrace(); // 예외처리~
//	}
//	
//	System.out.println("프로그램 종료");
//	 
//		
//		int a = 10;
//		int b = 0;
//		
//		
//		System.out.println(a/b); // 분모를 0으로 나눌 수 없어서 에러난다..왜지???? 불능이야?부정이야?
//		
//		System.out.println("프로그램 종료 완료~");
//	}
//
//}
