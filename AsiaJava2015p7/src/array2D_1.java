import java.util.*;

public class array2D_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float data [][] = new float [4][5];
		String name[] = new String[4];
		for(int i=0 ; i<4 ; i++){
			System.out.print("請輸入第  "+(i+1)+ " 位同學的名子:  ");
			name[i] = scn.next();
			System.out.print("請輸入第  "+(i+1)+ " 位同學的4科成績:  ");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = scn.nextFloat();
			data[i][4] = (data[i][0] + data[i][1]+ data[i][2] + data[i][3]) / 4;
		}	
		System.out.println("資料如下");
		System.out.println("名子"+"\t"+"英文"+"\t"+"數學"+"\t"+"自然"+"\t"+"社會"+"\t"+"平均");
		for(int i=0 ; i<4 ; i++){
			System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]+"\t"+data[i][4]);
		}
			
	}

}
