import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		
		H += X/60;
		M += X%60;

		if (M >= 60) {
			H += 1;
			M -= 60;
		}

		if (H >= 24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
	}

}