import java.util.Scanner;

public class Problem15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int base = 64;
		for(int i=n; i >= 1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%c", base+j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
