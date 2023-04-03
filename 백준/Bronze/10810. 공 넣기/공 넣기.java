import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int N, M, I, J, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			I = Integer.parseInt(st.nextToken());
			J = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			for (int j = I - 1; j < J; j++) {
				arr[j] = K;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
//			bw.write(Integer.toString(arr[i]));
//			bw.flush();
		}
//		bw.close();
	}

}