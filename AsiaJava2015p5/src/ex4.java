//利用 For-Loop計算13~1399之奇數總和。
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		for(int i = 13 ; i <= 1399 ; i = i + 2 )
		{
			sum += i ;
		}
		
		System.out.print("13~1399之奇數總合為    " + sum) ;
		

	}

}
