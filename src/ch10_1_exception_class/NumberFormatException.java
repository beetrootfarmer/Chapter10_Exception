package ch10_1_exception_class;

public class NumberFormatException {
	public static void main(String[] args) {
		String data = "100" ;
		String data2 = "100" ;
		
		int value1 = Integer.parseInt(data);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.printf("%d + %d = %d\n",
				value1, value2, result);

	}

}
