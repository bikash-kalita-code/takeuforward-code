import java.util.Scanner;

public class Problem18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int base = 64;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= n-i+1; j--) {
				System.out.printf("%c ", j+base);
			}
			System.out.println();
		}
		scanner.close();
	}
}
