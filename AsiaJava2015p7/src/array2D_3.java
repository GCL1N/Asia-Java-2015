import java.util.Scanner;

public class array2D_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入班級人數: ");
		int n = scn.nextInt();
		float data [][] = new float [n][5];
		String name[] = new String[n];
		for(int i=0 ; i<n ; i++){
			System.out.print("請輸入第  "+(i+1)+ " 位同學的名子:  ");
			name[i] = scn.next();
			System.out.print("請輸入第  "+(i+1)+ " 位同學的4科成績:  ");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = scn.nextFloat();
			data[i][4] = (data[i][0] + data[i][1]+ data[i][2] + data[i][3]) / 4;
		}
		float avg[] = new float[5];
		float sum [] = new float[5];
		for(int j = 0 ; j<5 ;j++){
			for(int i=0 ; i<n ;i++){
				avg[j]=(sum[j]+=data[i][j])/n;
			}	
		}
		int fail[] = new int[5];
		for(int j = 0 ; j<5 ;j++){
			for(int i=0 ; i<n ;i++){
				if(data[i][j] < 60){
					fail[j]++;
				}
			}	
		}
		float a [] = new float[5];
		float max = a [0];
		for(int j = 0 ; j<5 ;j++){
			for(int i=0 ; i<n ;i++){
				a[j]=Math.max(max,data[i][j]);
			}
		}
//		float b [] = new float[5];
//		for(int j = 0 ; j<5 ;j++){
//			for(int i=0 ; i<n ;i++){
//				b[j]=Math.min(a[j],data[i][j]);
//			}
//		}
		System.out.println("資料如下");
		System.out.println("　"+"\t"+"英文"+"\t"+"數學"+"\t"+"自然"+"\t"+"社會"+"\t"+"平均");
	
		for(int i=0 ; i<n ; i++){
			System.out.println(name[i]+"\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]+"\t"+data[i][4]);
		}
		System.out.println("\n"+"各科平均"+"\t"+avg[0]+"\t"+avg[1]+"\t"+avg[2]+"\t"+avg[3]+"\t"+avg[4]);
		System.out.println("不及格人數"+"\t"+fail[0]+"\t"+fail[1]+"\t"+fail[2]+"\t"+fail[3]+"\t");
		System.out.println("最高為"+"\t"+a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]);
//		System.out.println("最低為"+"\t"+b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t"+b[4]);
	}
}


