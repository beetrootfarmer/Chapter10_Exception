//package ch10_3_example;
//
//public class CalculatofromDragon {
//
//	// 업무적으로  x+y 값은 1000을 넘으면 에러  ������ ����!
//	// 업무적으로  x+y 값은 음수이면 에러 ���� �����̸� ����!
//	public static int add(int x, int y) throws BizThousandOverException
//	, BizNegativeNumberException {
//		int result = x + y;
//		if (result > 1_000) {
//			throw new BizThousandOverException();
//		}
//		if (result < 0) {
//			throw new BizNegativeNumberException();
//		}
//		return result;
//	}
//
//	// 업무적으로  x-y 값은 음수이면 에러 ���� �����̸� ����!
//	public static int sub(int x, int y) throws BizNegativeNumberException {
//		int result = x - y;
//		if (result < 0) {
//			throw new BizNegativeNumberException();
//		}
//		return result;
//	}
//
//	public static int multi(int x, int y) {
//		int result = x * y;
//		return result;
//	}
//
//	// 업무적으로 y값이 0 이면 에러! �̸� ����! 
//	public static int div(int x, int y) throws BizDividByZeroException {
//		if(y == 0) {
//			throw new BizDividByZeroException();
//		}
//			
//		int result = x / y;
//		return result;
//	}
//
//}
//
