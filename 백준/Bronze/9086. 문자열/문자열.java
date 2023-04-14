import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		T = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			
			String test1 = br.readLine();
			
			sb.append(test1.charAt(0));
			sb.append(test1.charAt(test1.length() - 1) + "\n");

		}
		System.out.println(sb);
	}
}