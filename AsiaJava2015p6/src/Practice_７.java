//Âù¼h for-loop ½d¨Ò½m²ß_7
import java.util.Scanner;
public class Practice_¢¶ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int v1 = (int)Math.ceil(n/2);
		int v2 = n - v1 ;
			
		for(int i = 0 ; i <= v1 ; i++ ){
			for(int j = 0 ; j < v1 - i ; j++){
				System.out.print("¡@");
			}
			for(int k = 0 ; k <=2 * i ; k++){
				System.out.print("¡¯");
			}
			System.out.println();
		}
			for(int f = 1 ; f <= v2 ; f++ ){
				for(int e = 0 ; e < f ; e++){
					System.out.print("¡@");
				}
				for(int k = 0 ; k <(v2-f)*2+1 ; k++){
					System.out.print("¡¯");
				}
				System.out.println();
			}
	}
}
