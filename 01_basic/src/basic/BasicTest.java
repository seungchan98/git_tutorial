package basic;

public class BasicTest {
	public static void main(String[] args) {
		System.out.println('A' + 3);
		System.out.println( (char)('A' + 3) );
		System.out.println( (char)('A' + 32) );
		System.out.println(2+5);
		System.out.println('2'-48 + '5'-48);
		System.out.println("2" + "5");
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5")); // 문자열을 숫자로 변환, 정수형(Integer), 실수형(Double)
		char a= 'A';
		System.out.println(a);
	}

}
