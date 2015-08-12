import java.util.*;
public class array_4 {
	public static void main(String[] args){
	    Random random = new Random();
	    int result[] = new int[]{1,2,3,4,5,6,7,8,9,10};
	   for(int i=0; i < result.length; i ++){ // 這個迴圈也可以只跑到result.length/2
	     int index = random.nextInt(10);
	     //交換 i 跟index的原素
	     int tmp = result[index];
	     result[index] = result[i];
	     result[i] = tmp;
	   }

	   //印出結果
	   for(int i=0; i < result.length; i ++)
	     System.out.println("result["+(i+1)+"]=" + result[i]);
	}
}