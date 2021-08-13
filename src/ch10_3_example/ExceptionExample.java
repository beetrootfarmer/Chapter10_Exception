package ch10_3_example;

 /**계산기만들기**/

class Calculator2 {
	
	public static int add(int x, int y)  { 		// 클래스.메소드로 호출하려면 메소드는 public static void의 형이 되어야한다.
		int result = x + y;
		return result;
	}public static int sub(int x, int y) { 		
		int result = x - y;
		return result;
	}public static int multi(int x, int y) { 		
		int result = x * y;
		return result;
	}public static int div(int x, int y) { 
		int result = x / y;
		return result;
	}
}

class Calculator {
	int x;
	int y;
	
	void add(int x ,int  y) {
		System.out.println(x+y);
	}
	void sub(int x, int y) {
		System.out.println(x-y);
		
	}
	void multi(int x, int y) {
		System.out.println(x*y);
	}
	void div(int x, int y) {
		System.out.println(x/y);
	}
	
}
public class ExceptionExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1,2);
		cal.sub(5,3);
		cal.multi(8,8);
		cal.div(1,1);
		
		
		Calculator2.add(333,444);
		Calculator2.sub(333,444);
		Calculator2.multi(333,444);
		Calculator2.div(17,4);
	}
}
