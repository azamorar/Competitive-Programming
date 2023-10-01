import java.io.BufferedInputStream;
import java.util.Scanner;

public class P435 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try ( Scanner sc = new Scanner( new BufferedInputStream( System.in, 1*1024)) ) {

			int [] numeros = new int [10];
			int aux;
			boolean normal = false;
			int n;

			while (sc.hasNextLine()) {
				String num = sc.nextLine();

				for (int i = 0; i < num.length(); i++) {
					n = Character.getNumericValue(num.charAt(i));
					numeros [n] = numeros[n]+1;

				}


				aux = numeros[0];

				for (int i = 1; i < 10 && !normal; i++) {
					if (numeros[i]!=aux) {
						normal = true;
					}
				}

				System.out.println((normal) ? "no subnormal": "subnormal");
				
				for (int k = 0; k<10 ; k++){
					numeros[k] = 0;
				}
				normal = false;
			}






		}catch ( Exception e) {
			System.exit(1);
		}



	}

}