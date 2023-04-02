import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}
		int searchNum = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == searchNum) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}

}
