import java.io.BufferedInputStream;
import java.util.Scanner;

public class P222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try ( Scanner sc = new Scanner( new BufferedInputStream( System.in, 1*2048)) ) {
			
			int x, n, res;
			
			while (sc.hasNext()) {
				x = sc.nextInt();
				n = sc.nextInt();
				res = 1;
				
				for (int i = 1; i <= n ; i++) {
					res = ((res * x) + 1) % 1000007;
				}
				System.out.println(res);
			}
			
		} catch (Exception E) {
			
			System.exit(1);
		}
	}

}
