//利用For-Loop計算 13~1399中17之倍數總和。
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		for (int i = 17 ; i < 1399 ; i = i +17 )
		{
			sum += i ;
		}
		
		System.out.print("13~1399中17之倍數總和為  " + sum) ;
	}

}
