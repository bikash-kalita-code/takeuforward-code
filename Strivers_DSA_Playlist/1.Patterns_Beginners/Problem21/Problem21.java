import java.util.Scanner;

public class Problem21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=1; i<=n; i++) {
			if(i==1 || i == n) {
				for(int j=1; j<=n; j++) System.out.print("*");
			} else {
				System.out.print("*");
				for(int j=2; j<n; j++) System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}
}
