//Array陣列+亂數練習_3
import java.util.Arrays;
import java.util.Scanner;

import java.util.Random;
public class array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
	    int data[] = new int[10];
	   for(int i=0; i < data.length; i ++){
	     int ind = ran.nextInt();
	     int tmp = data[ind];
	     data[ind] = data[i];
	     data[i] = tmp;
	   }

	   
            
            
		System.out.println("以下將隨機產生10個100以內的數字，請判斷該數是否為偶數。");
		System.out.println("答錯三題及遊戲結束，請思考後再回答。");
		System.out.print("按下ENTER開始。");
		
		try
		{
			 System.in.read();
		}
		catch(Exception e){}
		
		int rit= 0,wro =0;
		for(int j = 0; j < 10 ; j++){
			if(wro >= 3){
				System.out.println("你輸惹 ~~ 錯超過三題惹~~");
				return;
			}else{
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
		}
		System.out.println("唉呦，不錯喔。你總共答對  " + rit +" 題，答錯  "+ wro + " 題。");
	}
}
