//class���O�m��
public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ezreal = new Human("A123456789","��A�纸");
		Human van = new  Human("B123456789","��");
		Human diana = new Human("C123456789","�L�w�R");
		ezreal.setHeight(175);
		van.setWeight(45);
		System.out.println("��A���U�L�w�R�p�� 200*456�����G�O	"+ diana.compute(200,456,'*'));
		System.out.println("��������������������������������������������������");
		System.out.println("���I�pP�ġ@�С@��A�纸��������	" +ezreal.getHeight());
		System.out.println("�Z�J�M���� �@�С@�ƪ��魫�� 	" + van.getWeight());
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

