import java.util.*;
public class array2D_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入ROW與COL數目");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = 1 ;
		int data[][] = new int [n][m];
		for(int j=0 ; j<m ; j++){
			if(j%2 == 0){
				for(int i=0 ; i<n ; i++ ){
					data[i][j] = k ;
					k++ ;
				}
			}else{
				for(int i=n-1 ; i>=0 ;i--){
					data[i][j] = k;
					k++ ;
				}
			}
		}
		for(int i =0 ; i<n ; i++){
			for(int j = 0 ; j<m ; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
