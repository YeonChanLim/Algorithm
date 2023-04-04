import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		for (int i = 0; i <arr.length ; i++) {
			arr[i] = i + 1;
		}
		for (int j = 0; j < M; j++) {
			st = new StringTokenizer(br.readLine());
			
			int I  = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int temp = 0;
			temp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = temp;
			
		}
		for (int K = 0; K < arr.length; K++) {
			System.out.println(arr[K]);
			
		}
		br.close();
	}

}
