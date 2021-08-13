package ch10_3_example;

public class ExceptExample {
	public static void main(String[] args) {

		
		try {
			System.out.println(Calculator3.div(4, 0));
			System.out.println(Calculator3.add(10000, -3)); // surround with try/multi catch / 던진 예외객체를 받아 넣기~!~!//
		
		} catch (BizNegativeNumberException e) { // e는 예외객체의 참조변수 이름 !
			e.printStackTrace();
//			System.out.println("결과값이 음수입니다. 확인요망!");
		
		} catch (BizThousandOverException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());

//			System.out.println("결과값이 1000을 넘습니다. 확인요망!");
		} catch(BizDivideByZeroException e) {
			System.out.println(e.toString());
		}
		
		// 무조건 마지막에 모두 들리는 곳! 예외가 없이 출력이 되어도 finally는 출력된다.
		finally {
			System.out.println("입력값을 확인하세요~~");
		}

		System.out.println("프로그램 정상 종료");
//			System.out.println(Calculator3.sub(1, 3));
//			System.out.println(Calculator3.multi(1, 3));
//			System.out.println(Calculator3.div(1, 3));

	}

}
