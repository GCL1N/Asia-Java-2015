//class類別練習
public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ezreal = new Human("A123456789","伊澤瑞爾");
		Human van = new  Human("B123456789","汎");
		Human diana = new Human("C123456789","黛安娜");
		ezreal.setHeight(175);
		van.setWeight(45);
		System.out.println("伊澤拜託黛安娜計算 200*456的結果是	"+ diana.compute(200,456,'*'));
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("探險小P孩　－　伊澤瑞爾的身高為	" +ezreal.getHeight());
		System.out.println("坦克清除者 　－　汎的體重為 	" + van.getWeight());
	}
}
class Human{
		private float height;
		private float weight;
		private String name;
		private String id;
		
		public  Human(String id1 , String name1){
			name = name1;
			id = id1;
		}
		
		public void setHeight(float h){
			height = h;
		}
		public float getHeight(){
			return height;
		}
		public void setWeight(float w){
			weight = w;
		}
		public float getWeight(){
			return weight;
		}
		public float compute(float v1,float v2, char op){
			float result = 0.0f;
			switch(op){
			case'+':
				result = v1 + v2;
				break;
			case'-':
				result = v1 - v2;
				break;
			case'*':
				result = v1 * v2;
				break;
			case'/':
				result = v1 / v2;
				break;
			}
			return result;
		}
}	

