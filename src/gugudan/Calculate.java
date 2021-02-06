package gugudan;

public class Calculate {
	
	//받은 값 계산
	public static int[] cal(int input) {
		int[] result = new int[9*(input-1)];
		
		for(int i=2; i<(input+1); i++) {
			for(int j=0; j<9; j++) {
				result[j+(i-2)*9] = i*(j+1);
			}
		}
		
		return result;
				
	}

}
