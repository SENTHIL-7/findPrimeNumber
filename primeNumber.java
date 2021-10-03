import java.util.Scanner;
public class primeNumber {
	
	public static void main(String [] args) {
		
		int m,i=0,flag=0;
		System.out.println("Enter the number : ");
			Scanner in = new Scanner(System.in);
			int N = in.nextInt();
			m=N/2;
			if (N==0 || N==1) {
				System.out.println(N + " is not a prime number");
			}
			else {
				for(i=2;i<=m;i++) {
					if(N%i==0) {
						System.out.println(N + " is not a prime number");
						
						flag =1;
					}
				}
			}
			if(flag==0) {
				System.out.println(N + " is a prime number");
			}
	}

}
