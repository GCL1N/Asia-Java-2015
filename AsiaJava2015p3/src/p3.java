import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("該不會是亞洲男神俊宏吧!?來吧，讓我來看看他適不適合你。");
		System.out.println("請輸入她的身高");
		int tall=scn.nextInt();
		System.out.println("請再輸入她的體重");
		int weight=scn.nextInt();
		   if(tall>=165&&weight<=45){System.out.println("根本女神降臨阿!!快追吧!!");
		   }else{System.out.println("算了吧，你不是很挑嘴的嗎?換下一位吧。");
		    }
	}

}
