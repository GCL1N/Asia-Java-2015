//Array�}�C+�üƽm��_3
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
		if(wro <= 3){
			System.out.println("�AĹ�S~~");
		}else{
			System.out.println("�A��S ~~   " + wro+ "�D���S");
		}
	}
}