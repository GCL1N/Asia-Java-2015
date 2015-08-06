//利用Switch-Case 讓使用者輸入身分證字號之英文，並顯示其代表之縣市。
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身分證字號之英文   ");
		char id = scn.next().charAt(0); 
		switch(id)
		{
		case 'A' :
			System.out.println(id + "  代表的縣市為   台北市 " );
			break ;
		case 'B' :
			System.out.println(id + "  代表的縣市為   台中市 " );
			break ;
		case 'C' :
			System.out.println(id + "  代表的縣市為   基隆市 " );
			break ;
		case 'D' :
			System.out.println(id + "  代表的縣市為   台南市 " );
			break ;
		case 'E' :
			System.out.println(id + "  代表的縣市為   高雄市 " );
			break ;
		case 'F' :
			System.out.println(id + "  代表的縣市為   台北縣 " );
			break ;
		case 'G' :
			System.out.println(id + "  代表的縣市為   宜蘭縣 " );
			break ;
		case 'H' :
			System.out.println(id + "  代表的縣市為   桃園縣 " );
			break ;
		case 'J' :
			System.out.println(id + "  代表的縣市為   新竹縣 " );
			break ;
		case 'K' :
			System.out.println(id + "  代表的縣市為   苗栗縣 " );
			break ;
		case 'L' :
			System.out.println(id + "  代表的縣市為   台中縣 " );
			break ;
		case 'M' :
			System.out.println(id + "  代表的縣市為   南投縣 " );
			break ;
		case 'N' :
			System.out.println(id + "  代表的縣市為   彰化縣 " );
			break ;
		case 'P' :
			System.out.println(id + "  代表的縣市為   雲林縣 " );
			break ;
		case 'Q' :
			System.out.println(id + "  代表的縣市為   嘉義縣 " );
			break ;
		case 'R' :
			System.out.println(id + "  代表的縣市為   台南縣 " );
			break ;
		case 'S' :
			System.out.println(id + "  代表的縣市為   高雄縣 " );
			break ;
		case 'T' :
			System.out.println(id + "  代表的縣市為   屏東縣 " );
			break ;
		case 'U' :
			System.out.println(id + "  代表的縣市為   花蓮縣 " );
			break ;
		case 'V' :
			System.out.println(id + "  代表的縣市為   台東縣 " );
			break ;
		case 'X' :
			System.out.println(id + "  代表的縣市為   澎湖縣 " );
			break ;
		case 'Y' :
			System.out.println(id + "  代表的縣市為   陽明山 " );
			break ;
		case 'W' :
			System.out.println(id + "  代表的縣市為   金門 " );
			break ;
		case 'Z' :
			System.out.println(id + "  代表的縣市為   馬祖 " );
			break ;
		case 'I' :
			System.out.println(id + "  代表的縣市為   嘉義市 " );
			break ;
		case 'O' :
			System.out.println(id + "  代表的縣市為   新竹市 " );
			break ;
		default:
			System.out.println("請再確認一次，輸入之英文是否正確。 " );
			break ;
		}
	}

}
