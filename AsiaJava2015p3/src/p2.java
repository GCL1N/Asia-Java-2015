import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn =new Scanner(System.in);
System.out.println("�п�JA��");
int a =scn.nextInt();
System.out.println("�ЦA��JB��");
int b =scn.nextInt();
System.out.println("�п�J�z�n�����p�� (+,-,*,/)");
String str=scn.next();
float c=a+b;
float d=a-b;
float e=a*b;
float f=(float)a/(float)b;
if(str.equals("+")){
System.out.println(a+"+"+b+"="+c);
}else{if(str.equals("-")){
System.out.println(a+"-"+b+"="+d);
}else{if(str.equals("*")){
System.out.println(a+"*"+b+"="+e);
}else{System.out.println(a+"/"+b+"="+f);

	  }
     }
    }
   }
  }

