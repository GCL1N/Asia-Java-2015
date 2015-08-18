import java.util.*;
public class method_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ch = (String) scn.next();
		meth(ch);
	}
		
	public static void meth(String a){
		int sum = 0;
		char b [] = a.toCharArray();
		for( int i  = 0 ; i <b.length; i++){
			int num  = a.charAt(i);
			if(num > 47 && num <58 ){
				sum+= b[i]-'0';
			}
		}
		System.out.print(sum);
	}

}
