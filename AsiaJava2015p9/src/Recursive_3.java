import java.util.*;
public class Recursive_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test;
		System.out.print("��J�@�ӥ���ƭ�(���t0):");
		Scanner scanner = new Scanner(System.in);
		test = scanner.next();
		int i=Integer.parseInt(test);
		int j=0;
		System.out.print(+digits(i,j)+"���");
		}
		public static int digits(int m,int n)
		{

		if(m != 0 )
		{
		n++;
		return digits(m/10, n);
		}
		else
		{
		return n;
		}

		}
		
	}


