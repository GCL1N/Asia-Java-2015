import java.util.Scanner;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�w��ϥ��x���P�y��f�{��");
		System.out.println("�п�J���ͤ���(Ex:1");
		int m =scn.nextInt();
		System.out.println("�ЦA��J���ͤ���(Ex:1");
		int date =scn.nextInt();
		
		if(m==01 && date<=20){
			System.out.println("�]�~�y�]�S�s�s�Ϯy�^");
			System.out.println("�O�@�Ӧ��p�e���H,�b�@�w���ɶ����৹���w�w���ؼ� �����̷Pı����,�ӬO��ڥh�O�� ���w���|�a�� �ʮ���j��,��Ʊ�����,�֨����k,���w�@�ӤH���ơC");
		}else{if(m==1&&date>=21){
			System.out.println("���~�y");
			System.out.println("����ƨg���P�y,����Ƥl�M���`�H���� ��z��,���y���a���z�M�޿� ���ɯ�O,�A�X�R�x��t �a���g��,�O�߱B���P�y �򥻤W�O�����B�ç��Ӫ�,����R�����A�ש��� �O��b�D�q��,�B���w������O�C");
		}else{if(m==2&&date<=19){
			System.out.println("���~�y");
			System.out.println("����ƨg���P�y,����Ƥl�M���`�H���� ��z��,���y���a���z�M�޿� ���ɯ�O,�A�X�R�x��t �a���g��,�O�߱B���P�y �򥻤W�O�����B�ç��Ӫ�,����R�����A�ש��� �O��b�D�q��,�B���w������O�E");
	    }else{if(m==2&&date>=20){
	    	System.out.println("�����y");
			System.out.println("�R�۷Q,�L���B�ͥ�����z�ѥL���Q�k �ͬ����Ǧb�믫�W,�������ʸU�I��;���{��ͬ�,�h���@�w ���ͬ�,�{������n�ķũM�A��,������o�O�H�᪺�� �����y���k�ʹ�k�ʦӨ�,�O�ߥؤ����z�Q���H�E");
		}else{if(m==3&&date<=20){
			System.out.println("�����y");
			System.out.println("�R�۷Q,�L���B�ͥ�����z�ѥL���Q�k �ͬ����Ǧb�믫�W,�������ʸU�I��;���{��ͬ�,�h���@�w ���ͬ�,�{������n�ķũM�A��,������o�O�H�᪺�� �����y���k�ʹ�k�ʦӨ�,�O�ߥؤ����z�Q���H�E");
		}else{if(m==3&&date>=21){
			System.out.println("�զϮy�]�S�s�d�Ϯy�^");
			System.out.println("�����B���w,�өʱj�B�k�ʤ� ���İ�,�I���q�P,���},��O�R�K �֩���ի_�I��,�}�Щʪ��ƪ� ���ۥH���O���ө� �O12�P�y��,���F�����y�~,�䥦�P�y���L�k�ҥ骺�P�y�C");
		}else{if(m==4&&date<=19){
			System.out.println("�զϮy�]�S�s�d�Ϯy�^");
			System.out.println("�����B���w,�өʱj�B�k�ʤ� ���İ�,�I���q�P,���},��O�R�K �֩���ի_�I��,�}�Щʪ��ƪ� ���ۥH���O���ө� �O12�P�y��,���F�����y�~,�䥦�P�y���L�k�ҥ骺�P�y�C");
		}else{if(m==4&&date>=20){
			System.out.println("�����y");
			System.out.println("�x�T,���ۤv���|�dı �I��,�өʬ~��,�N�Ӱ�w,�V���ũM �ܤְ�,�ܤֻ�,�j���R�R�a��ť�����[��O�H �����p��ܧ�,���U�@�B�o�ܺC ���U�]�O�L�Y�઺�C");
		}else{if(m==5&&date<=20){
			System.out.println("�����y");
			System.out.println("�x�T,���ۤv���|�dı �I��,�өʬ~��,�N�Ӱ�w,�V���ũM �ܤְ�,�ܤֻ�,�j���R�R�a��ť�����[��O�H �����p��ܧ�,���U�@�B�o�ܺC ���U�]�O�L�Y�઺�C");
		}else{if(m==5&&date>=21){
			System.out.println("���l�y");
			System.out.println("�㦳�����ө�,�p�ּ֩μ~��,�����ηŬX �ܥO�H�g�b���ө�,�o��,�����]���� ���ܳt�ק�,�B�g�`�ഫ���D ���u�� �����˦ۤv�ʾ����Q�k�M���� �R�ۥ�,����������N�Ѥ����C");
		}else{if(m==6&&date<=21){
			System.out.println("���l�y");
			System.out.println("�㦳�����ө�,�p�ּ֩μ~��,�����ηŬX �ܥO�H�g�b���ө�,�o��,�����]���� ���ܳt�ק�,�B�g�`�ഫ���D ���u�� �����˦ۤv�ʾ����Q�k�M���� �R�ۥ�,����������N�Ѥ����C");
		}else{if(m==6&&date>=22){
			System.out.println("���ɮy");
			System.out.println("�R�a,���� ���e�\�L�H�I�J�ۤv���a�L ���V,�`��ߨƩ�b�ߩ� �߱�����G,�`�ܤ� ���y,���x��X�C");
		}else{if(m==7&&date<=22){
			System.out.println("���ɮy");
			System.out.println("�R�a,���� ���e�\�L�H�I�J�ۤv���a�L ���V,�`��ߨƩ�b�ߩ� �߱�����G,�`�ܤ� ���y,���x��X�C");
		}else{if(m==7&&date>=23){
			System.out.println("��l�y");
			System.out.println("�Q���·t�M�L�� �G�_�O,�۴L�߱j,�|���ä��p�N����,���o��{���ܰ�j ���w�Q���g ���j�k�H���ɦV ���۶ƪ��𮧡C");
		}else{if(m==8&&date<=22){
			System.out.println("��l�y");
			System.out.println("�Q���·t�M�L�� �G�_�O,�۴L�߱j,�|���ä��p�N����,���o��{���ܰ�j ���w�Q���g ���j�k�H���ɦV ���۶ƪ��𮧡C");
		}else{if(m==8&&date>=23){
			System.out.println("�B�k�y");
			System.out.println("�߫�ӿ�,�ӷP���a���g�� ���w�O���D�Ϊ��F�� �㥿�q�P,�e������O�H���I �����D�q��,�n�D�ۤv�M�O�H�@�˧����C");
		}else{if(m==9&&date<=22){
			System.out.println("�B�k�y");
			System.out.println("�߫�ӿ�,�ӷP���a���g�� ���w�O���D�Ϊ��F�� �㥿�q�P,�e������O�H���I �����D�q��,�n�D�ۤv�M�O�H�@�˧����C");
		}else{if(m==9&&date>=23){
			System.out.println("�ѯ��y");
			System.out.println("�����o��,���o�ɱ`���F �����u���g�H,�����ɩT�������� ��L�@�M�w��,���n���Z�L;���L�@�n�M�w��,�������ܥL ���󨥵� �l�D��o�ͬ��C");
		}else{if(m==10&&date<=23){
			System.out.println("�ѯ��y");
			System.out.println("�����o��,���o�ɱ`���F �����u���g�H,�����ɩT�������� ��L�@�M�w��,���n���Z�L;���L�@�n�M�w��,�������ܥL ���󨥵� �l�D��o�ͬ��C");
		}else{if(m==10&&date>=24){
			System.out.println("���Ȯy");
			System.out.println("���۫H,�৹�����֦��ۧ� �ܤֻ��^�Ӫ���,�@���g���o�O�u�ߪ� �O�@�Ӽ������H,�]�O�@�ӵL�����M�I���l �O�@�ӯu���~�{���H ���^����n,�|�O�@�z�̡C");
		}else{if(m==11&&date<=21){
			System.out.println("���Ȯy");
			System.out.println("���۫H,�৹�����֦��ۧ� �ܤֻ��^�Ӫ���,�@���g���o�O�u�ߪ� �O�@�Ӽ������H,�]�O�@�ӵL�����M�I���l �O�@�ӯu���~�{���H ���^����n,�|�O�@�z�̡C");
		}else{if(m==11&&date>=22){
			System.out.println("�g��y�]�S�s�H���y�^");
			System.out.println("�өʶ}��,���[ ��Ҹ��u�O����,�`�`�o�o�O�H�Ӥ����D,���j�|���� �D�`�R��,�B���q�ܤj �_�I�ʤj,�⮩�ʰ�,���q�n�� �����`���,�B�|����H���|�C");
		}else{if(m==12&&date<=20){
			System.out.println("�g��y�]�S�s�H���y�^");
			System.out.println("�өʶ}��,���[ ��Ҹ��u�O����,�`�`�o�o�O�H�Ӥ����D,���j�|���� �D�`�R��,�B���q�ܤj �_�I�ʤj,�⮩�ʰ�,���q�n�� �����`���,�B�|����H���|�C");
		}else{if(m==12&&date>=21){
			System.out.println("�]�~�y�]�S�s�s�Ϯy�^");
			System.out.println("�O�@�Ӧ��p�e���H,�b�@�w���ɶ����৹���w�w���ؼ� �����̷Pı����,�ӬO��ڥh�O�� ���w���|�a�� �ʮ���j��,��Ʊ�����,�֨����k,���w�@�ӤH���ơC");
		}else{
			System.out.println("�Э��s�}�ҵ{���ÿ�J���T�����");
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
	    }
		}
		}
		}
	}

