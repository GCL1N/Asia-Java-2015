//Array�}�C+�üƽm��_3
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

	   
            
            
		System.out.println("�H�U�N�H������10��100�H�����Ʀr�A�ЧP�_�ӼƬO�_�����ơC");
		System.out.println("�����T�D�ιC�������A�Ы�ҫ�A�^���C");
		System.out.print("���UENTER�}�l�C");
		
		try
		{
			 System.in.read();
		}
		catch(Exception e){}
		
		int rit= 0,wro =0;
		for(int j = 0; j < 10 ; j++){
			if(wro >= 3){
				System.out.println("�A��S ~~ ���W�L�T�D�S~~");
				return;
			}else{
				System.out.println(data[j]+"�O�_������?(�O/�_)");
				char ans = scn.next().charAt(0);
				if(data[j]%2 == 0){
					switch (ans){			
					case '�O':
						System.out.println("����F!!" + data[j] + " �O����~~");
						rit ++;
						break;
					case '�_':
						System.out.println("�����o!!" + data[j] + " �O���Ƴ�!!");
						wro ++ ;
						break;
					default:
						System.out.println("�п�J'�O'��'�_'!!!");
						break;
					}
				}else{
					switch (ans){			
					case '�O':
						System.out.println("�����o!!" + data[j] + " ���O���Ƴ�!!");
						wro ++;
						break;
					case '�_':
						System.out.println("����F!!" + data[j] + " ���O����~~");
						rit ++;
						break;
					default:
						System.out.println("�п�J'�O'��'�_'!!!");
						break;
					}
				}
			}
		}
		System.out.println("����A������C�A�`�@����  " + rit +" �D�A����  "+ wro + " �D�C");
	}
}
