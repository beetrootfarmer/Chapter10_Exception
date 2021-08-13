package common;

public class BizNegativeNumberException extends Exception {
	@Override
	public String toString() {
		return "결과값이 음수입니다. 확인요망!";
	}
	
}
