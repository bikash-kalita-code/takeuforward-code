import java.util.Scanner;

public class Problem17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int base = 64;
		for(int i = 1; i <= n; i++) {
			int spaces = n - i;
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.printf("%c", base+j);
			}
			for(int j = i-1; j >= 1; j--) {
				System.out.printf("%c", base+j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
