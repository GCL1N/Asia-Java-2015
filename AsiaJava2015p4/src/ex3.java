import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形的邊長a");
		float s1 = scn.nextFloat();
		System.out.println("請輸入三角形的邊長b");
		float s2 = scn.nextFloat();
		System.out.println("請輸入三角形的邊長c");
		float s3 = scn.nextFloat();
		  if(s1 <= s2 && s2<= s3 && s1 <= s3){
			  System.out.println("★☆這是個合法的三邊長★☆");
		  }else{
			  System.out.println("★☆這是個不合法的三邊長★☆");
		   }
	}
}
