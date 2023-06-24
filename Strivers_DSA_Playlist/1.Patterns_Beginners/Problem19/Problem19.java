import java.util.Scanner;

public class Problem19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=1; i<=n; i++) {
			int spaces = 2*(i-1);

			for(int j=1; j <= n-i+1; j++) System.out.print("*");
			for(int j=1; j <= spaces; j++) System.out.print(" ");
			for(int j=1; j <= n-i+1; j++) System.out.print("*");
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			int spaces = 2*(i-1);

			for(int j=1; j <= n-i+1; j++) System.out.print("*");
			for(int j=1; j <= spaces; j++) System.out.print(" ");
			for(int j=1; j <= n-i+1; j++) System.out.print("*");
			System.out.println();
		}

		scanner.close();
	}
}
