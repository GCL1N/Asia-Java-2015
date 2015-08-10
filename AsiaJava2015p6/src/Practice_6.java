//Âù¼h for-loop ½d¨Ò½m²ß_6
import java.util.Scanner;
public class Practice_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
			for(int i = 0 ; i < n ; i++ ){
				for(int j = 0 ; j < n - i - 1 ; j++){
					System.out.print("¡@");
				}
				for(int k = 0 ; k <= 2*i ; k++){
					System.out.print("¡¯");
				}
				System.out.println();
			}
	}
}
