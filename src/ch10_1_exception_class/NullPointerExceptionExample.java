package ch10_1_exception_class;

class Person{}

public class NullPointerExceptionExample {
	int x;
	int y;
	boolean b;
	Person p;
	
	public static void main(String[] args) {
		
		String data = null; // == String data; // 객체값이 초기화되지 않은 상태에서 호출하면 Exception 발생하기 때문에 
		String data2 = "  ";  // data2.length = 2; //String은 "" 공백으로 초기화 해준다.
		
		try {
			System.out.println(data.toString());
			
//			Exception 객체가 Exception을 상속받는 객체 위에 위치하면 밑의 객체에 도달하지 못함. 그래서 Exception 객체는 맨 마지막에 적어줘야한다. 
//		} catch (Exception e){
//			e.printStackTrace();
//			System.out.println("예외발생 코드 실행");
			
		}catch (NullPointerException e) {
			System.out.println("예외발생!");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("예외발생 코드 실행");
		}
		System.out.println("프로그램 종료");

}
}	
	
//class NullPointerException extends Exception{
//	@Override
//	public String toString() {
//		return "문자가 입력되지 않았습니다.";
//	}
//}

