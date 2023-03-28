import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static int a;
	static int b;

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());*/
		Scanner sc = new Scanner(System.in);
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		

	}

}
