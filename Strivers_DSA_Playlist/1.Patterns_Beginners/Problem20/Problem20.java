import java.util.Scanner;

public class Problem20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i = 1; i <= n; i++) {
			int spaces = 2*(n - i);
			for(int j=1; j <=i ; j++) System.out.print("*");
			for(int j=1; j <=spaces ; j++) System.out.print(" ");
			for(int j=1; j <=i ; j++) System.out.print("*");
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--) {
			int spaces = 2*(n - i);
			for(int j=1; j <=i ; j++) System.out.print("*");
                        for(int j=1; j <=spaces ; j++) System.out.print(" ");
                        for(int j=1; j <=i ; j++) System.out.print("*");
                        System.out.println();
		}

		scanner.close();
	}
}
