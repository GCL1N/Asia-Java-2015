import java.util.*;
public class Recursive_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�п�Jx:");
		int i = scn.nextInt();
		System.out.print("�п�Jy:");
		int j = scn.nextInt();
		System.out.print("�п�Jz:");
		int q = scn.nextInt();
		
		
		System.out.println("������:"+gcd1(gcd(i,j),q));
		System.out.print("�̤j������:"+lcm1(lcm(i,j),q));
	}
		
		
	public static int gcd(int m, int n){
		if(n != 0 ){
			return gcd(n, m % n);
		}else{
			return m;
		}
	}
	public static int gcd1(int m, int n){
		if(n != 0 ){
			return gcd(n, m % n);
		}else{
			return m;
		}
	}
	public static int lcm(int m, int n){//�̤p������
		return m * n / gcd(m, n);
	}
	public static int lcm1(int m, int n){//�̤p������
		return m * n / gcd(m, n);
	}	
}
		
		
		
//		public static int gcd(int m, int n)//�D������
//		{
//		if(n != 0 )
//		{
//		return gcd(n, m % n);
//		
//		}
//		else
//		{
//		return m;
//		}
//		}
//		public static int lcm(int m, int n)//�̤p������
//		{
//		return m * n / gcd(m, n);
//		
//		}
//		
//		public static void main(String[] args)
//		{
//		System.out.println("GCD of (10, 4) = " + gcd(4,6));
//		System.out.println("LCM of (10, 4) = " + lcm(4,6));
//		}