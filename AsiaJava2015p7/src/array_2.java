//Array陣列練習_1
import java.util.Scanner;
public class array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float[] data = new float[10];
		int v1 = 0, v2 = 0 , v3 = 0 ;//v1 統計過輕 ,v2統計剛好 ,v3統計過重
		float w, h ,avg = 0.0f;
		for(int i = 0; i < 10 ; i++){
			System.out.print("請輸入第  "+ (i+1) + " 位同學的身高體重。");
			h = scn.nextFloat();
			w = scn.nextFloat();
			data[i] = (float)(w / Math.pow((h/100),2));
			avg += data[i];
			if(data[i] < 18.5){
				v1++ ;
			}else{
				if(data[i] >= 18.5 && data[i] < 24){
					v2++ ;
				}else{
					v3++ ;
				}
			}
		}
		avg /= 10 ;
		System.out.println("平均BMI值為  " + avg);
		System.out.println("過輕 ，正常，過重的比例分別為  " + ((float)v1/10.0) +".	\t"+ ((float)v2/10.0)  +".	\t"+ ((float)v3/10.0));
		System.out.println("請輸入您要查詢的同學編號");
		int n = scn.nextInt();
		System.out.println("第  " + n + " 位同學的BMI值為  " + data[n-1]);
		
	}

}
