import java.util.Scanner;
public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("安安，請輸入車子頃角");
		int n1=scn.nextInt();
		System.out.println("那再輸入軸距吧。");
		int n2 =scn.nextInt();
		System.out.println("最後輸入輪胎尺寸吧!");
		int n3=scn.nextInt();
			if(n1>=43&&n2>=130&&n3==12){
				System.out.println("是符合的車種~恭喜。");
			    }
			else{
				System.out.println("不是符合的車種~再看看其他的吧!");
		    }
	}
}
	


