import java.io.BufferedInputStream;
import java.util.Scanner;

public class P304 {


	public static void main ( String [] args ) {


		try ( Scanner sc = new Scanner( new BufferedInputStream( System.in, 1*1024)) ) {


			int contador = sc.nextInt();
			int dividendo, divisor, cociente, resto;


			for (int i = 0; i < contador ; i++ ) {

				dividendo = sc.nextInt();
				divisor = sc.nextInt();

				if ( divisor == 0) System.out.println("DIV0");

				else if ( dividendo < 0 && divisor > 0 ) {

					dividendo = Math.abs(dividendo);

					cociente = 1;


					while (dividendo > (divisor*cociente)) {
						cociente+=1;
					}

					resto = (cociente*divisor) - dividendo  ;
					cociente = cociente * (-1);



					System.out.print(cociente + " ");
					System.out.print(resto + "\n");

				}

				else if (dividendo < 0 && divisor < 0) {
					dividendo = Math.abs(dividendo);
					divisor = Math.abs(divisor);
					cociente = 1;


					while (dividendo > (divisor*cociente)) {
						cociente+=1;
					}

					resto = (cociente*divisor) - dividendo  ;



					System.out.print(cociente + " ");
					System.out.print(resto + "\n");
				}

				else {
					cociente = dividendo / divisor;
					resto = dividendo % divisor;

					System.out.print(cociente + " ");
					System.out.print(resto + "\n");

				}




			}

		}catch (Exception e) {
			System.exit(1);
		}
	}

}