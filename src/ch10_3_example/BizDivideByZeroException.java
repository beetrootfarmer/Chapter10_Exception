package ch10_3_example;

public class BizDivideByZeroException extends Exception {
	@Override			
	public String toString() {
    return "0으로 나눌 수 없습니다.";
}


}
