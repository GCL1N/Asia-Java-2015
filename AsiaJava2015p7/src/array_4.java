import java.util.*;
public class array_4 {
	public static void main(String[] args){
	    Random random = new Random();
	    int result[] = new int[]{1,2,3,4,5,6,7,8,9,10};
	   for(int i=0; i < result.length; i ++){ // �o�Ӱj��]�i�H�u�]��result.length/2
	     int index = random.nextInt(10);
	     //�洫 i ��index�����
	     int tmp = result[index];
	     result[index] = result[i];
	     result[i] = tmp;
	   }

	   //�L�X���G
	   for(int i=0; i < result.length; i ++)
	     System.out.println("result["+(i+1)+"]=" + result[i]);
	}
}