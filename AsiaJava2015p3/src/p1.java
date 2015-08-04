import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
System.out.println("請輸入A值");
int a=scn.nextInt();
System.out.println("請再輸入B值");
int b =scn.nextInt();
if (a>b){System.out.println("比較後為  "+a+">"+b);
	}else{if(a<b){System.out.println("比較後為  "+a+"<"+b);
	}else{System.out.println("比較後為     "+a+" = "+b);}
	}

	}
}
