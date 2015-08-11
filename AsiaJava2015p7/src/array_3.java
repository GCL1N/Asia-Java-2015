//Array陣列+亂數練習_3
import java.util.Scanner;
import java.util.Random;
public class array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int[] data = new int[10];
		for(int i = 0 ; i < 10 ; i++){
			data[i] = ran.nextInt(100);
		}
		int rit= 1,wro =1;

			for(int j = 0; j < 10 ; j++){
				System.out.println(data[j]+"是否為偶數?(是/否)");
				char ans = scn.next().charAt(0);
				if(data[j]%2 == 0){
					switch (ans){			
					case '是':
						System.out.println("答對了!!" + data[j] + " 是偶數~~");
						rit ++;
						break;
					case '否':
						System.out.println("答錯囉!!" + data[j] + " 是偶數喔!!");
						wro ++ ;
						break;
					default:
						System.out.println("請輸入'是'或'否'!!!");
						break;
					}
				}else{
					switch (ans){			
					case '是':
						System.out.println("答錯囉!!" + data[j] + " 不是偶數喔!!");
						wro ++;
						break;
					case '否':
						System.out.println("答對了!!" + data[j] + " 不是偶數~~");
						rit ++;
						break;
					default:
						System.out.println("請輸入'是'或'否'!!!");
						break;
					}
				}
			}
		if(wro <= 3){
			System.out.println("你贏惹~~");
		}else{
			System.out.println("你輸惹 ~~   " + wro+ "題錯惹");
		}
	}
}