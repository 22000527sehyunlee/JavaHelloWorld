import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.ptintln("Hello World!!!\n");
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.println("["+name+"]님 환영합니다~~~~~");
	}

}
