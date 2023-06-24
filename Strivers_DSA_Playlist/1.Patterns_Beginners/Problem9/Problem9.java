import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
	                int spaces = n - i;
        	        int stars = i;
                	for(int j=1; j <= spaces; j++) {
                        	System.out.print(" ");
                	}
                	for(int j=1; j <= stars; j++) {
                        	System.out.print("* ");
                	}
               	 System.out.println();
        	}

        for(int i = 1; i <= n; i++) {
                int spaces = i - 1;
                int stars = n - i + 1;
                for(int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                }
                for(int j = 1; j <= stars; j++) {
                        System.out.print("* ");
                }
                System.out.println();
        }
	}
}
