// unfinished
import java.util.*;
public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�������������w����{������������");
		Weapon wb = new Weapon("�k�H�ϥ@�C","878787");
		Weapon mb = new Weapon("�k�H���Z�C","787878");
		String ans = "y";
		int wbn = 0;
		int mbn = 0;
		while(ans.equals("Y")||ans.equals("y")){		
			System.out.println("���������п�J�ݭn���ӫ~��������");
			System.out.println("1.���k�H�ϥ@�C	����G878,787��");
			System.out.println("2.���k�H���Z�C	����G787,878��");
			int stuff = scn.nextInt();
			switch(stuff){
			case 1:
				System.out.print("�аݻݭn���ƶq��?");
				int numWb = scn.nextInt();
				wb.setNum(numWb);
				wbn++;
				break;			
			case 2:
				System.out.print("�аݻݭn���ƶq��?");
				int numMb = scn.nextInt();
				wb.setNum(numMb);
				mbn++;
				break;
			default:
				System.out.println("��p,�L���ӫ~��!�ЦA�T�{�C");
				break;
			}
			System.out.print("�а��ٻݭn��L�ӫ~��?(Y/N)");
			ans = scn.next();
		}
		System.out.println("�Ы��UENTER�C�L�o��");
		try{
			System.in.read();
		}catch(Exception e){}
		System.out.println("			�o��(�Ȭw��u��)				");
		System.out.println();
		System.out.println("�x�������p�Ϭh�׸�500��");
		System.out.println("�q��:04-23323456 #6101");
		System.out.println("�ǯu:04-23233876");
		System.out.println("==============================================");
		System.out.println("�~���W��		���	�ƶq		�p�p");
		System.out.println("----------------------------------------------");
		if(wbn == 1){
			System.out.println("�k�H�ϥ@�C		878,787	"+wb.getNum()+"		"+wb.compute(878787,wb.getNum()));
		}
	}
}
class Weapon{
	private int num;	
	private String name;
	private String price;
	public  Weapon(String name1 , String price1){
		name = name1;
		price = price1;
	}
	public void setNum (int v1){
		num = v1;
	}
	public int getNum(){
		return num;
	}
	public float compute(float v1 , float v2){
		float result = v1 * v2;
		return result;
		
		
	}
}