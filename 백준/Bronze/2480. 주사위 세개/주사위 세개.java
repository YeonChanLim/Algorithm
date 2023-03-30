import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		sc.close();

		if (x != y && y != z && x != z) {
			int max;
			// 만약 a > b 라면
			if (x > y) {
				// c > a > b 라면
				if (z > x) {
					max = z;
				} 
				// a > (b, c)
				else {
					max = x;
				}
			}
			// b > a 라면	
			else {
				// c > b > a 라면
				if (z > y) {
					max = z;
				}
				// b > (a, c)
				else {
					max = y;
				}
			}
			System.out.println(max * 100);
		}
		// 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
		else {
			// 3개의 변수가 모두 같은 경우
			if (x == y && x == z) {
				System.out.println(10000 + x * 1000);
			}
			else {
				// a가 b혹은 c랑만 같은 경우
				if(x == y || x == z) {
					System.out.println(1000 + x * 100);
				}
				// b가 c랑 같은 경우
				else {
					System.out.println(1000 + y * 100);
				}
			}
		}
	}
}