package basic;

public class HelloTest {
	
	public static void main(String[] args) {
		System.out.println("Hello Java"); // ~~. : .안에 있다
		System.out.print("안녕하세요\n");
		System.out.print("Hello Java!!\n");
		System.out.println(25 + 36); //61
		System.out.println("25 + 36"); //25 + 36
		System.out.println("25" + "36"); //2536  문자열에서의 +는 덧셈이 아니라 결합
		System.out.println("25 + 26 = 61");
		System.out.println("25 + 36 = " + (25 + 36));
		System.out.println("25 / 36 = " +(25 / 36)); // 정수 / 정수 => 정수
		System.out.println("25 / 36 = " +(25.0 / 36)); // 실수 / 정수 => 실수
		System.out.println("25 / 36 = " +((float)25 / 36)); // 형변환(Casting) ->바꾸고싶은데 앞에 변수형을 써준다
		System.out.println("25 / 36 = " +String.format("%.3f",(double)25 / 36)); // 소수이하 n번째 자리까지 나오고 싶으면
	
	}
}
