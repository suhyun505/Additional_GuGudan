package gugudan;

public class Calculate {
	
	//받은 값 계산
	public static int[] cal(int first, int second) {
		
		int[] result = new int[(first-1)*second];
		
		for(int i=0; i<(first-1); i++) {
			for(int j=0; j<second; j++) {
				result[j+(i*second)] = (i+2)*(j+1);
			}
		}
		
		
		return result;
				
	}

}
