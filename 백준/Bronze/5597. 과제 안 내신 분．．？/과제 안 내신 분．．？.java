import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] student = new boolean[31];

		for (int i = 1; i < 29; i++) {
			N = Integer.parseInt(br.readLine());
			student[N] = true;

		}
		for (int i = 1; i <= 30; i++) {
			if (!student[i])
				System.out.println(i);

		}

	}

}