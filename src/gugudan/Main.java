package gugudan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner 구현
		Scanner scanner = new Scanner(System.in);
		
		//숫자 입력받기
		System.out.println("원하는 구구단 값을 ,로 나누어 입력해주세요.");
		
		String inputValue = scanner.nextLine();
		System.out.println("입력한 값은 " + inputValue);
		
		//입력된 두 값을 나누기, ','로 나눈다.
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		//필요 배열 수
		int total = first * second;
		
		
		//계산
		int[] result = new int[total];
		result = Calculate.cal(first, second);
		
		//출력
		PrintCalculate.print(result);
		
	}
}
