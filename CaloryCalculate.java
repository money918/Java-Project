import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
public class CaloryCalculate{
public static void main(String[]args)throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.print("�̸��� �Է��ϼ��� : "); //�̸� �� ��¥�� �ؽ�Ʈ���Ͽ� ������ ���� ������ ���� �Է�
	String peopleName=input.next();
	Date date=new Date();
	double kc=0;
	
//����,���̸� �Է¹޾� 1�� ���� Į�θ��� ���
	try{
		int active;//Ȱ���� �Է��� ���� ���� ����
		System.out.print("����(M/F) �Է��ϼ��� : ");
		String gender=input.next();//����(����) �Է�
		
		
		switch(gender.toUpperCase()){
		case "M"://������ ������ ����� ���ǹ�
			
		System.out.print ("����(m) �Է��ϼ��� : ");
		double height=input.nextDouble();//���� �Է�
		
		System.out.println("Ȱ����[����] �Է��ϼ��� : 1-���� ���� 2-���� 3-���� � ");
		active=input.nextInt();//����(Ȱ����) ��
		switch(active){
		case 1:
			kc=height*height*22*30;
			System.out.println("����� �Ϸ� ���� Į�θ� : "+kc+"Kcal");
			break;
		case 2:
			kc=height*height*22*35;
			System.out.println("����� �Ϸ� ���� Į�θ� : "+kc+"Kcal");
			break;
		case 3:
			kc=height*height*22*40;
			System.out.println("����� �Ϸ� ���� Į�θ� : "+kc+"Kcal");
			break;
		default:
			System.out.println("Ȱ������ �߸� �Է��ϼ̽��ϴ�");
			break;
			}
		break;

		case "F"://������ �����ϰ���� ���ǹ�
		
		System.out.print("����(���� m) �Է��ϼ��� : ");
		height=input.nextDouble();//���� �Է�
		System.out.println("Ȱ����[����] �Է��ϼ��� : 1-���� ���� 2-���� 3-���� � ");
		active=input.nextInt();//����(Ȱ����) �Է�
		switch(active){
		case 1:
			kc=height*height*21*30;
			System.out.println("����� �Ϸ� ���� Į�θ� : "+kc+"Kcal");
			break;
		case 2:
			kc=height*height*21*35;
			System.out.println("����� �Ϸ� ���� Į�θ� : "+kc+"Kcal");
			break;
		case 3:
			kc=height*height*21*40;
			System.out.println("����� �Ϸ� ���� Į�θ� : "+kc+"Kcal");
			break;
		default:
			System.out.println("Ȱ������ �߸� �Է��ϼ̽��ϴ�");
			break;
			}
		break;
		default:
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			System.exit(1);
			break;
			}
	}
	catch(InputMismatchException ex1){
		System.out.println("����, �ùٸ� �Է��� ���ּ���");
			System.exit(1);
	}
	


//���⼭���� ���� ������ �Է� ���� �� ������ �� Į�θ� ���
		int n,a,b;
		int total = 0;
//���������Է�
		System.out.println("");
		System.out.println("[�ѽ�]");
		System.out.println("  1.�ҹ�  2.�����  3.��ġ��ġ�  4.���κ��  5.�δ��  6.�ع���  7.�ᳪ����  8.�Ͼ  9.������  10.�Ұ��");
		System.out.println("  11.��������  12.������  13.��������  14.��ġ����  15.��ä  16.��ġ��  17.����  18.�ñ�ġ����  19.����������  20.���߱�ġ");
		System.out.println("  21.������ġ  22.��α�  23.��ġ����(1�丷) 24.������  25.������  26.�����  27.����  28.Į����  29.���ø�  30.����ø�");
		System.out.println("  31.�����  32.���α�  33.���  34.������  35.��ġ����  36.�������  37.��������  38.������  39.��ġ������");
		System.out.println("[��� �Ͻ� �߽�]");
		System.out.println("  40.�Ƚɽ�����ũ  41.��ä����  42.ũ������  43.���Ƕ��̽�  44.ī�����̽�  45.��ũĿ�ø�  46.���İ�Ƽ  47.���ڳ�  48.����(������) 49.��ġ������ġ  50.��ġ�������ġ");
		System.out.println("  51.�����  52.������  53.�쵿  54.«��  55.������  56.��ǳ��  57.������  58.���ĸ���ä  59.�Ϻ��Ŀ쵿  60.������쵿");
		System.out.println("  61.���(1��) 62.�����ʹ�(10��) 63.��ġ�ʹ�  64.ȸ����  65.Ƣ�赤��  66.�����äƢ��  67.�޹б���  68.���� 69.��� 70.�����");
		System.out.println("  71.�ø���  72.��ä������  73.��ġȸ����  74.������(3��) 75.������(5��) 76.�����  77.���  78.�Ⱥ�ä  79.�ܹ���(3����) 80.�ܹ��׽�����ũ");
		System.out.println("[�н�ƮǪ��]");
		System.out.println("  81.3��ī��  82.����Ƣ��  83.�ʰ�  84.����  85.���  86.������ ��߸�  87.�����쵿  88.¥¥�δ�  89.��ġ������  90.ġ�����");
		System.out.println("  91.ġŲ��ƽ  92.�ܻ�����  93.�ֵ���  94.�Ŷ��  95.�ȼ�����  96.�������߸�  97.��ġ��߸�  98.�����  " );
//�迭�� ù��° ���� ���� ���� �ι�° ���� �� ����° ���� Į�θ�����
		System.out.println("");
		System.out.println("���� ������ ������ �Է��Ͻÿ�:");
		n=input.nextInt();
		int[][] food= new int[n][3];

		System.out.println("���� ������ �Է��Ͻÿ�	:");
		for (int i=0;i<n;i++){
			food[i][0]=input.nextInt();
			if (food[i][0]>98||food[i][0]<1){
				System.out.println("�ٽ� �Է��ϼ���.(1~98)");
				food[i][0]=input.nextInt();
			}
		}
		System.out.println("���� ���� ��(�κ�)�� �Է��ϼ���:");
		for (int i=0;i<n;i++){
			food[i][1]=input.nextInt();
			Calory kcal=new Calory(food[i][0],food[i][1]);
			food[i][2]=(int) kcal.getCalory();
			}

		for (int i=0;i<n;i++){
			total+=food[i][2];
		}
		System.out.println("�� ������ Į�θ��� ��:"+total+"Kcal");







//ȭ�鿡 � ���� ��� 
		System.out.print("�ǥ(Kcal/h) : ");	
		String[] Exer={"���", "�ٳѱ�", "����", "����(������)", "����(����)", "�ĵ�Ÿ��", "����κ�", "�״Ͻ�", "��Ű", "��", "����", "����Ʈ��", "�豸", "Ź��", "�߱�", "����Ŭ", "����Ű", "�Ǳ�","��ܿ��� �پ������", "��� ����������", "�ش���׾���"};

		for(int i=0; i<Exer.length; i++){
			System.out.print(i+1+"-"+Exer[i]+" ");
			if((i+1)%10==0){
				System.out.println();
				System.out.print("\t       " );
				}
			}
		boolean Do=false;
		double sum=0;
//��� ���� �ð��� Į�θ� ���
		try{
			while(!Do){
				System.out.println(" ");
				System.out.print("��� ����(Number) : ");
				int Number=input.nextInt();
				System.out.print("��� �ð�(Hour) : ");
				double Hour=input.nextDouble();
				Calory2 calory=new Calory2(Number, Hour);
				System.out.println("�����Ͻ� ����� �Һ��� Į�θ� :"+calory.toString()+"Kcal");
				System.out.println(" ");
				System.out.print("�߰� �Է��� ���Ͻðڽ��ϱ�? (Yes or No) ");
				String Get=input.next();
				sum+=calory.getCalory();
				if(Get.equalsIgnoreCase("YES")){
					Do=false;}
				else if(Get.equalsIgnoreCase("NO")){
					Do=true;
					System.out.println("");
					System.out.println("����� �Һ��� �� Į�θ� : " +sum+"Kcal");
					}
				else{
					System.out.println("Yes Ȥ�� No�� �Է����ּ���");
					System.exit(0);
					}
				}
			}
		catch(InputMismatchException ex){
			System.out.println("����, �ùٸ� �Է��� ���ּ���");
			}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("����, �ùٸ� � ���� ���ڸ� �Է����ּ���");
		}
//������ �ؽ�Ʈ���Ϸ� ����
		java.io.PrintWriter output=new java.io.PrintWriter(peopleName+".txt"); 
		output.println("���� ��¥ : "+date.toString());
		output.println("����� �Ϸ� ���� Į�θ� : "+kc+"kcal");
		output.println("���� ������ ���� : "+n+"��");
		output.print("���� ���� ���� : ");
		for (int i=0;i<n;i++ ){
			output.print(getFoodName(food[i][0])+" ");
		}
			output.println(" ");
			output.println("�� ���� Į�θ� : "+total+"kcal");
			output.println("����� �Һ��� �� Į�θ�: "+sum+"kcal");
			output.close();	
			
		System.out.println(peopleName+"���� �Ϸ� ���� Į�θ� : "+kc+"Kcal,  ������ �� Į�θ� : "+total+"Kcal,  ����� �� �Һ��� Į�θ� : "+sum+"Kcal");	
}





//���Ͽ� �����Ҷ� �����̸��� ������� �޼ҵ�
public static String getFoodName(int number){
String foodname = null;	

	switch (number)
	{
	case 1: foodname="�ҹ�"; break;
	case 2: foodname="�����";break;
	case 3: foodname="��ġ��ġ�";break;
	case 4: foodname="���κ��";break;
	case 5: foodname="�δ��";break;
	case 6: foodname="�ع���";break;
	case 7: foodname="�ᳪ����";break;
	case 8: foodname="�Ͼ";break;
	case 9: foodname="������";break;
	case 10: foodname="�Ұ��";break;
	case 11: foodname="��������";break;
	case 12: foodname="������";break;
	case 13: foodname="��������";break;
	case 14: foodname="��ġ����";break;
	case 15: foodname="��ä";break;
	case 16: foodname="��ġ��";break;
	case 17: foodname="����";break;
	case 18: foodname="�ñ�ġ����";break;
	case 19: foodname="����������";break;
	case 20: foodname="���߱�ġ";break;
	case 21: foodname="������ġ";break;
	case 22: foodname="��α�";break;
	case 23: foodname="��ġ����(1�丷)";break;
	case 24: foodname="������";break;
	case 25: foodname="������";break;
	case 26: foodname="�����";break;
	case 27: foodname="����";break;
	case 28: foodname="Į����";break;
	case 29: foodname="���ø�";break;
	case 30: foodname="����ø�";break;
	case 31: foodname="�����";break;
	case 32: foodname="���α�";break;
	case 33: foodname="���";break;
	case 34: foodname="������";break;
	case 35: foodname="��ġ����";break;
	case 36: foodname="�������";break;
	case 37: foodname="�����";break;
	case 38: foodname="������";break;
	case 39: foodname="��ġ������";break;
	case 40:foodname="�Ƚɽ�����ũ"; break;
	case 41:foodname="��ä����"; break;
	case 42:foodname="ũ������"; break;
	case 43:foodname="���Ƕ��̽�"; break;
	case 44:foodname="ī�����̽�"; break;
	case 45:foodname="��ũĿƲ��"; break;
	case 46:foodname="���İ�Ƽ"; break;
	case 47:foodname="���ڳ�"; break;
	case 48:foodname="����"; break;
	case 49:foodname="��ġ������ġ"; break;
	case 50:foodname="��ġ�������ġ"; break;
	case 51:foodname="�����"; break;
	case 52:foodname="������"; break;
	case 53:foodname="�쵿"; break;
	case 54:foodname="«��"; break;
	case 55:foodname="������"; break;
	case 56:foodname="��ǳ��"; break;
	case 57:foodname="������"; break;
	case 58:foodname="���ĸ���ä"; break;
	case 59:foodname="�Ϻ��Ŀ쵿"; break;
	case 60:foodname="������쵿"; break;
	case 61:foodname="���"; break;
	case 62:foodname="�����ʹ�"; break;
	case 63:foodname="��ġ�ʹ�"; break;
	case 64:foodname="ȸ����"; break;
	case 65:foodname="Ƣ�赤��"; break;
	case 66:foodname="�����äƢ��"; break;
	case 67:foodname="�޹б���"; break;
	case 68:foodname="����"; break;
	case 69:foodname="���"; break;
	case 70:foodname="�����"; break;
	case 71:foodname="�ø���"; break;
	case 72:foodname="��ä������"; break;
	case 73:foodname="��ġȸ����"; break;
	case 74:foodname="������"; break;
	case 75:foodname="������"; break;
	case 76:foodname="�����"; break;
	case 77:foodname="���"; break;
	case 78:foodname="�Ⱥ�ä"; break;
	case 79:foodname="�ܹ���"; break;
	case 80:foodname="�ܹ��׽�����ũ"; break;
	case 81:foodname="3��ī��"; break;
	case 82:foodname="����Ƣ��"; break;
	case 83:foodname="�ʰ�"; break;
	case 84:foodname="����"; break;
	case 85:foodname="���"; break;
	case 86:foodname="������ ��߸�"; break;
	case 87:foodname="�����쵿"; break;
	case 88:foodname="¥¥�δ�"; break;
	case 89:foodname="��ġ������"; break;
	case 90:foodname="ġ�����"; break;
	case 91:foodname="ġŲ��ƽ"; break;
	case 92:foodname="�ܻ�����"; break;
	case 93:foodname="�ֵ���"; break;
	case 94:foodname="�Ŷ��"; break;
	case 95:foodname="�ȼ�����"; break;
	case 96:foodname="�������߸�"; break;
	case 97:foodname="��ġ��߸�"; break;
	case 98:foodname="�����"; break;
	}return foodname;
	}
	}
	
	
	
	
	
	
	//���ĺ� Į�θ���� class
class Calory{
	int number;
	int quantity;
	int cal;
	public Calory(int number,int quantity){
		this.number=number;
		this.quantity=quantity;
	}
	public int getCalory(){	
	switch (number)
	{
	case 1: cal=300;break;
	case 2: cal=128;break;
	case 3: cal=209;break;
	case 4: cal=115;break;
	case 5: cal=340;break;
	case 6: cal=82;break;
	case 7: cal=15;break;
	case 8: cal=57;break;
	case 9: cal=220;break;
	case 10: cal=163;break;
	case 11: cal=71;break;
	case 12: cal=100;break;
	case 13: cal=106;break;
	case 14: cal=480;break;
	case 15: cal=206;break;
	case 16: cal=196;break;
	case 17: cal=195;break;
	case 18: cal=79;break;
	case 19: cal=110;break;
	case 20: cal=33;break;
	case 21: cal=21;break;
	case 22: cal=31;break;
	case 23: cal=174;break;
	case 24: cal=630;break;
	case 25: cal=212;break;
	case 26: cal=630;break;
	case 27: cal=568;break;
	case 28: cal=545;break;
	case 29: cal=520;break;
	case 30: cal=578;break;
	case 31: cal=500;break;
	case 32: cal=477;break;
	case 33: cal=250;break;
	case 34: cal=482;break;
	case 35: cal=462;break;
	case 36: cal=498;break;
	case 37: cal=148;break;
	case 38: cal=204;break;
	case 39: cal=495;break;
	case 40:cal=663;  break;
	case 41:cal=170; break;
	case 42:cal=164; break;
	case 43:cal=662; break;
	case 44:cal=502;break;
	case 45:cal=553;break;
	case 46:cal=473; break;
	case 47:cal=548;break;
	case 48:cal=250;break;
	case 49:cal=564; break;
	case 50:cal=396;break;
	case 51:cal=670;break;
	case 52:cal=617;break;
	case 53:cal=610;break;
	case 54:cal=437;break;
	case 55:cal=630; break;
	case 56:cal=567;break;
	case 57:cal=616;break;
	case 58:cal=189; break;
	case 59:cal=332; break;
	case 60:cal=557;break;
	case 61:cal=500;break;
	case 62:cal=800;break;
	case 63:cal=76; break;
	case 64:cal=512; break;
	case 65:cal=739; break;
	case 66:cal=739; break;
	case 67:cal=520; break;
	case 68:cal=450;break;
	case 69:cal=439; break;
	case 70:cal=300; break;
	case 71:cal=160; break;
	case 72:cal=120; break;
	case 73:cal=480;break;
	case 74:cal=160;break;
	case 75:cal=110;break;
	case 76:cal=500; break;
	case 77:cal=430; break;
	case 78:cal=500;break;
	case 79:cal=3; break;
	case 80:cal=652;break;
	case 81:cal=175; break;
	case 82:cal=220; break;
	case 83:cal=240; break;
	case 84:cal=16; break;
	case 85:cal=500; break;
	case 86:cal=455; break;
	case 87:cal=375; break;
	case 88:cal=375;break;
	case 89:cal=450;break;
	case 90:cal=310; break;
	case 91:cal=310; break;
	case 92:cal=134;break;
	case 93:cal=280; break;
	case 94:cal=525;break;
	case 95:cal=550;break;
	case 96:cal=450; break;
	case 97:cal=450;break;
	case 98:cal=210;break;
	
	}
	return quantity*cal;
	}
	}
	
	
	//� �Һ� Į�θ� ��� class
class Calory2{
	protected int number;
	protected double hour;
		
	public Calory2(int number, double hour){
		this.number=number;
		this.hour=hour;
		}
	public double getCalory(){ //��� �ð��� Į�θ�
		double[] Cal={196, 224, 196, 518, 273, 176, 126, 176, 186, 200, 90, 90, 200, 200, 180, 111, 200, 102, 188, 141, 0};
		return Cal[number-1]*hour;
		}
	@Override
	public String toString(){
		return " "+getCalory();
			}
	}
