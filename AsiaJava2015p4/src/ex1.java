import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���");
		char[] date = scn.next().toCharArray();
		int ok = 0 ;
		for(int i=3; i<date.length ;i++ ){
			if(date[i] == (char)('7')){
				ok = 1  ;
			}
		}
		if(ok == 1){
			System.out.println("�ѣ��A���J��R�E���~");
		}else{
			System.out.println("�E��,�E��,�E��,�E��,�E��,�E��,�E��!!!");
		}

	}

}
