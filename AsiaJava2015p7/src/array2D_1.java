import java.util.*;

public class array2D_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float data [][] = new float [4][5];
		String name[] = new String[4];
		for(int i=0 ; i<4 ; i++){
			System.out.print("�п�J��  "+(i+1)+ " ��P�Ǫ��W�l:  ");
			name[i] = scn.next();
			System.out.print("�п�J��  "+(i+1)+ " ��P�Ǫ�4�즨�Z:  ");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = scn.nextFloat();
			data[i][4] = (data[i][0] + data[i][1]+ data[i][2] + data[i][3]) / 4;
		}	
		System.out.println("��Ʀp�U");
		System.out.println("�W�l"+"\t"+"�^��"+"\t"+"�ƾ�"+"\t"+"�۵M"+"\t"+"���|"+"\t"+"����");
		for(int i=0 ; i<4 ; i++){
			System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]+"\t"+data[i][4]);
		}
			
	}

}
