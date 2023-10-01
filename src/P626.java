import java.io.BufferedInputStream;
import java.util.Scanner;

public class P626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try ( Scanner sc = new Scanner( new BufferedInputStream( System.in, 1*1024)) ) {
			
			String line = sc.nextLine();
			int	anio;
			String linea;
			
			int n = Integer.parseInt(line);
			for (int i =0; i < n; i++) {
			
				
				linea = sc.nextLine();
				String [] array = linea.split("/");
				anio = Integer.parseInt(array[2]);
				int modulo = anio % 4;
				int fin; 
				
				switch (modulo) {
				case 0:
					if (array[1].equals("01") || (array[1].equals("02") && (Integer.parseInt(array[0]) < 29)))
						fin = anio;
					else 
						fin = anio + 4;
						
					break;
				default:
					fin = anio + ( 4 -( modulo));
					break;
				}
				System.out.format("29/02/%04d\n", fin);
			}
			
		}catch (Exception E) {
			System.exit(1);
		}
	}

}