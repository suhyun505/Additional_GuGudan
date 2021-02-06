package gugudan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//숫자 입력받기
		System.out.println("원하는 단을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("입력한 값은 " + number);
		
		//계산
		int[] result = new int[number*9];
		result = Calculate.cal(number);
		
		//출력
		PrintCalculate.print(result);
		
	}
}
