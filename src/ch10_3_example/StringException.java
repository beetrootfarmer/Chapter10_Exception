package ch10_3_example;

public class StringException extends Exception {
	@Override			
	public String toString() {
    return "숫자를 입력하세요.";
		
	}

}
