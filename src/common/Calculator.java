package common;

public class Calculator {
	public static void main(String[] args) {
		
	}

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
