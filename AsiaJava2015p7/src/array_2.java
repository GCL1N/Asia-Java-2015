//Array�}�C�m��_1
import java.util.Scanner;
public class array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float[] data = new float[10];
		int v1 = 0, v2 = 0 , v3 = 0 ;//v1 �έp�L�� ,v2�έp��n ,v3�έp�L��
		float w, h ,avg = 0.0f;
		for(int i = 0; i < 10 ; i++){
			System.out.print("�п�J��  "+ (i+1) + " ��P�Ǫ������魫�C");
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
		System.out.println("����BMI�Ȭ�  " + avg);
		System.out.println("�L�� �A���`�A�L������Ҥ��O��  " + ((float)v1/10.0) +".	\t"+ ((float)v2/10.0)  +".	\t"+ ((float)v3/10.0));
		System.out.println("�п�J�z�n�d�ߪ��P�ǽs��");
		int n = scn.nextInt();
		System.out.println("��  " + n + " ��P�Ǫ�BMI�Ȭ�  " + data[n-1]);
		
	}

}
