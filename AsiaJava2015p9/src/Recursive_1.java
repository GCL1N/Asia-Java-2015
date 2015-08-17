import java.util.*;
public class Recursive_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("N = ?");
		int n = scn.nextInt();
		System.out.println(n + "!="+fac(n));
	}

	public static int fac(int v1){
		if(v1 == 1){
			return 1;
		}else{
			return v1 *fac(v1-1);
		}
	}
}
