//利用 loop 計算 13+14+15+....+1399之值
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		for(int i = 13 ; i <= 1399 ; i++)
		{
			sum += i ;
		}

		System.out.print("13+14+15+....+1399之值為  " +sum );
	}

}
