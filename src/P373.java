import java.io.BufferedInputStream;
import java.util.Scanner;

public class P373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try ( Scanner sc = new Scanner( new BufferedInputStream( System.in, 1*1024)) ) {
			
			int n = sc.nextInt();
			long dim, salida;
			
			
			
			for (int i = 0; i < n; i++) {
				dim = sc.nextLong();
				
				salida = dim*dim*2 + (dim-2)*((2*dim)+(2*(dim-2))); 
				System.out.println(salida);
			}
			
			
			
			
		} catch (Exception e) {
			System.exit(1);
		}

	}

}