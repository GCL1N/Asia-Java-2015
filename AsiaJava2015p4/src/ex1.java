import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤é´Á");
		char[] date = scn.next().toCharArray();
		int ok = 0 ;
		for(int i=3; i<date.length ;i++ ){
			if(date[i] == (char)('7')){
				ok = 1  ;
			}
		}
		if(ok == 1){
			System.out.println("¦Ñ£°¡A¤µ¥J¤é·R©Eµæ³á~");
		}else{
			System.out.println("©E¦×,©E¦×,©E¦×,©E¦×,©E¦×,©E¦×,©E¦×!!!");
		}

	}

}
