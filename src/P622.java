import java.io.BufferedInputStream;
import java.util.Scanner;

public class P622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try ( Scanner sc = new Scanner( new BufferedInputStream( System.in, 1*1024)) ) {
			
			int n, contador, examen, prometido, necesario;
			while ( (n = sc.nextInt() )!= 0) {
				contador = 0;
				
				for (int i = 0; i < n ; i++ ) {
					examen = sc.nextInt();
					contador += examen;
				}
				prometido = sc.nextInt();
				necesario = (prometido * (n+1)) - contador;
				
				if (necesario > 10 || necesario < 0) {
					System.out.println("IMPOSIBLE");
				}
				else
					System.out.println(necesario);
			}
			
		}catch (Exception E) {
			System.exit(1);
		}

	}

}