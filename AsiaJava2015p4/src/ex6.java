//輸入一合法三角形之三邊長，判定此三角形為 鈍角，銳角或是直角。
import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入 此合法三角形之A邊長");
		int a = scn.nextInt();
		System.out.println("請輸入 此合法三角形之B邊長");
		int b = scn.nextInt();
		System.out.println("請輸入 此合法三角形之C邊長");
		int c = scn.nextInt();
		  if((a * a) + (b * b) < (c*c)){
			  System.out.println("經過精密計算，此三角形為 鈍角三角形");
		  }else{if((a * a) + (b * b) > (c*c)){
			  System.out.println("經過精密計算，此三角形為 銳角三角形");
		      }else{if((a * a) + (b * b) == (c*c)){
		    	  System.out.println("經過精密計算，此三角形為 直角三角形");
		          }
		       }   
		  }
    }
}