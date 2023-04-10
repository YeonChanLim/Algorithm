import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
	    int[] arr = new int[N];
	    
	    for (int i = 0; i < N; i++) {
	    	arr[i] = i+1;
		}
	    
	    for (int j = 0; j < M; j++) {
	    	
	    	st = new StringTokenizer(br.readLine());
	    	
	    	int x = Integer.parseInt(st.nextToken());
	    	int y = Integer.parseInt(st.nextToken());
	    	
	    	x--;
	    	y--;
	    	
	    	while(true){
	    		if (x < y) {
	    			int temp = arr[x];
	    			arr[x] = arr[y];
	    			arr[y] = temp;
	    		} else{
	    			break;
	    		}
	    		x++;
	    		y--;
	    	}
	    	
			
		}
	    for (int i = 0; i < N; i++) {
	    	System.out.println(arr[i]);
			
		}
	}

}