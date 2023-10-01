import java.util.Scanner;

public class P305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cateto1;
		int cateto2;
		double resultado;
		
		do {
			
			cateto1 = sc.nextInt();
			cateto2 = sc.nextInt();
			
			if (cateto1 != 0 && cateto2 != 0) {
				resultado = 0.5 * cateto1 * cateto2;
				
				System.out.format("%.1f\n", resultado);
			}
			
		} while ( cateto1 != 0 && cateto2 != 0 );
		
		sc.close();
		
		
		

	}

}