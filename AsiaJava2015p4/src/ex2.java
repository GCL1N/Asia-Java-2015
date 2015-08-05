import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入店家(ex:五十嵐,喫茶小舖,新井茶‧‧‧)");
		char[] shop = scn.next().toCharArray();
		System.out.println("請輸入飲料(ex:綠茶,紅茶,青茶,咖啡‧‧‧)");
		char[] drink = scn.next().toCharArray();
		System.out.println("請輸入價錢");
		int price = scn.nextInt();
		  if(shop[0] != '五' && shop[1] != '十' && shop[2] != '嵐' ){
			  if(drink[0] == '綠' || drink[0] == '咖'&& drink[1] == '茶'  || drink[1] == '啡' ){
				  if( price <= 45 ){System.out.println("這就對啦!建傑就愛這一味!");
				  }else{ System.out.println("捂丟喔~ 這不是他愛的飲料,太貴囉~");
				   }
			  }else{ System.out.println("捂丟喔~ 這不是他愛的飲料");
			   }
		  }else{ System.out.println("捂丟喔~ 他不愛這間"); 
		   }
	}
}


