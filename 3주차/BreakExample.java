// "exit"이 입력되면 while 문을 벗어나도록 break 문을 활용하는 프로그램 작성

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			
			//문자열 비교시 equals() 사용
			if (text.equals("exit")) { 
				break;
			}
		}
	
		System.out.println("종료합니다!");
		
		scanner.close();
	}

}
