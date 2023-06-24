import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char base = 64;
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.printf("%c", base+j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
