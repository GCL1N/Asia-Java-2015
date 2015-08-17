import java.util.*;
public class Recursive_2 {

	public static void main(String args[]){
		int mon[] = new int[2];
		mon[0]=(int)(Math.random()*1000+1);
		mon[1]=(int)(Math.random()*1000+1);
		int x=1000,y=0;
		y=x-mon[0];
		System.out.println("總價 = "+mon[0]);
		sum(y);
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("原數值"+mon[1]);
		sum1(mon[1]);
	}
	public static void sum(int m){
		int arr1=0,arr5=0,arr10=0,arr50=0,arr100=0,arr500=0;
		int f=0;
		if(m!=0){
			arr500=m/500;
			f=m%500;
			if(f!=0){
				arr100=f/100;
				f=f%100;
				if(f!=0){
					arr50=f/50;
					f=f%50;
					if(f!=0){
						arr10=f/10;
						f=f%10;
						if(f!=0){
							arr5=f/5;
							f=f%5;
							if(f!=0){
								arr1=f/1;
								f=f%1;
							}
						}
					}
				}
			}
		}
		System.out.println("找"+m+"元");
		System.out.println(arr500+"張500");
		System.out.println(arr100+"張100");
		System.out.println(arr50+"張50");
		System.out.println(arr10+"張10");
		System.out.println(arr5+"張5");
		System.out.println(arr1+"張1");
	}
	public static void sum1(int m){
		int arr1=0,arr10=0,arr100=0,arr1000=0;
		int f=0;
		if(m!=0){
			arr1000=m/1000;
			f=m%1000;
			if(f!=0){
				arr100=f/100;
				f=f%100;
				if(f!=0){
				arr10=f/10;
				f=f%10;
					if(f!=0){
						arr1=f/1;
						f=f%1;
					}
				}
			}
		}
		if(arr1000!=0){
			System.out.print(arr1000+"仟");
		}
		if(arr100!=0){
			System.out.print(arr100+"佰");
		}
		if(arr10!=0){
			System.out.print(arr10+"拾");
		}
		if(arr1!=0){
			System.out.print(arr1+"元");
		}
	}
}
