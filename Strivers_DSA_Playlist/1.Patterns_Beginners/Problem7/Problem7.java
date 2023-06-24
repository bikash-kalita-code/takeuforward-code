import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i = 1; i <= n; i++) {
			int space = n-i;
			int stars = 2*i - 1;
			for(int j = 1; j <= space; j++) System.out.print(" ");
			for(int j = 1; j <= stars; j++) System.out.print("*");
			System.out.println();
		}

		scanner.close();
	}
}
