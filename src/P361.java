
import java.io.BufferedInputStream;
import java.util.Scanner;


// 0 -> +, 1 -> -, 2 -> *, 3 -> :

public class P361 {
	static boolean result = false ;

	private static void validar(int contador,int obj) {
		if ( contador == obj ) {
			result = true ;
		}
	}

	private static void test(int num[], int oper[], int obj, int i, int j,int c) {
		int contador = 0;
		switch(oper[i]) {
		case 0:
			contador = c + num[j+1] ;
			break;
		case 1:
			contador = c - num[j+1] ;
			break;
		case 2:
			contador =  num[j+1] * c ;
			break;
		case 3:
			if (num[j+1] == 0) return ;
			if (c % num[j+1]!=0 ) return ;
			contador = c /num[j+1];
			break;
		}		
		j++; i++;
		if (i == 4 ) {
			validar(contador,obj); 
		}else { 
			for (int a = 0 ; a<4 ; a++ ) {
				oper[i] = a;
				test(num,oper,obj,i,j,contador);
			}
		}
	}

	static void test(int num[],int obj) {
		for (int a = 0 ; a<4 ; a++) {
			int oper[] = {a,-1,-1,-1} ;
			test(num,oper,obj,0,0,num[0]);
		} 
		if (result) System.out.println("SI");
		else System.out.println("NO");
	}

	public static void main(String[] args) {

		try( Scanner sc = new Scanner(new BufferedInputStream(System.in, 1*1024)) ){		

			while(sc.hasNext()) {
				int obj = sc.nextInt() ;
				int num[] = {sc.nextInt() , sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() } ;		
				test(num,obj);
				result = false;
			}	

		}catch(Exception E ) {
			System.exit(1);
		}

	}
}