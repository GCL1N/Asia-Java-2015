import java.util.Scanner;

public class ex150911_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤J¼Æ¦r : ");
		String str = scn.next();
		decomp(str);		
	}
	public static  void decomp(String a){
		char cha []= a.toCharArray();
		for(int i = 0 ; i < cha.length ; i++){
			System.out.printf(cha[i]+" ");
		}
	}
}
