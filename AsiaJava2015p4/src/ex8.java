//块计璸衡眖赣计秨﹍100ず案计ぇ羆㎝
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int nm = scn.nextInt();
		int sum = 0;
		if(nm % 2 == 0 )
		{
			for( int i = nm ; i <= 100 ; i = i + 2 )
			{
				sum += i;
			}
			
		}
		else
		{
			for (int i = nm + 1 ; i <= 100 ; i = i +2 )
			{
				sum += i ;
			}
		}
		
		System.out.println(sum);
		
	}

}
