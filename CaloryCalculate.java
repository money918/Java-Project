import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
public class CaloryCalculate{
public static void main(String[]args)throws IOException {
	Scanner input=new Scanner(System.in);
	System.out.print("이름을 입력하세요 : "); //이름 및 날짜는 텍스트파일에 저장할 때의 정보를 위해 입력
	String peopleName=input.next();
	Date date=new Date();
	double kc=0;
	
//성별,나이를 입력받아 1일 권장 칼로리량 출력
	try{
		int active;//활동량 입력을 위한 변수 선언
		System.out.print("성별(M/F) 입력하세요 : ");
		String gender=input.next();//문자(성별) 입력
		
		
		switch(gender.toUpperCase()){
		case "M"://성별이 남성일 경우의 조건문
			
		System.out.print ("신장(m) 입력하세요 : ");
		double height=input.nextDouble();//신장 입력
		
		System.out.println("활동량[숫자] 입력하세요 : 1-거의 없음 2-보통 3-심한 운동 ");
		active=input.nextInt();//정수(활동량) 입
		switch(active){
		case 1:
			kc=height*height*22*30;
			System.out.println("당신의 하루 권장 칼로리 : "+kc+"Kcal");
			break;
		case 2:
			kc=height*height*22*35;
			System.out.println("당신의 하루 권장 칼로리 : "+kc+"Kcal");
			break;
		case 3:
			kc=height*height*22*40;
			System.out.println("당신의 하루 권장 칼로리 : "+kc+"Kcal");
			break;
		default:
			System.out.println("활동량을 잘못 입력하셨습니다");
			break;
			}
		break;

		case "F"://성별이 여성일경우의 조건문
		
		System.out.print("신장(단위 m) 입력하세요 : ");
		height=input.nextDouble();//신장 입력
		System.out.println("활동량[숫자] 입력하세요 : 1-거의 없음 2-보통 3-심한 운동 ");
		active=input.nextInt();//정수(활동량) 입력
		switch(active){
		case 1:
			kc=height*height*21*30;
			System.out.println("당신의 하루 권장 칼로리 : "+kc+"Kcal");
			break;
		case 2:
			kc=height*height*21*35;
			System.out.println("당신의 하루 권장 칼로리 : "+kc+"Kcal");
			break;
		case 3:
			kc=height*height*21*40;
			System.out.println("당신의 하루 권장 칼로리 : "+kc+"Kcal");
			break;
		default:
			System.out.println("활동량을 잘못 입력하셨습니다");
			break;
			}
		break;
		default:
			System.out.println("성별을 잘못 입력하셨습니다.");
			System.exit(1);
			break;
			}
	}
	catch(InputMismatchException ex1){
		System.out.println("오류, 올바른 입력을 해주세요");
			System.exit(1);
	}
	


//여기서부터 먹은 음식을 입력 받은 후 섭취한 총 칼로리 계산
		int n,a,b;
		int total = 0;
//먹은음식입력
		System.out.println("");
		System.out.println("[한식]");
		System.out.println("  1.쌀밥  2.된장찌개  3.참치김치찌개  4.순두부찌개  5.부대찌개  6.해물탕  7.콩나물국  8.북어국  9.갈비찜  10.불고기");
		System.out.println("  11.감자조림  12.장조림  13.낙지볶음  14.멸치볶음  15.잡채  16.김치전  17.파전  18.시금치나물  19.도라지나물  20.배추김치");
		System.out.println("  21.열무김치  22.깍두기  23.갈치구이(1토막) 24.갈비탕  25.설렁탕  26.삼계탕  27.떡국  28.칼국수  29.물냉면  30.비빔냉면");
		System.out.println("  31.비빔밥  32.만두국  33.라면  34.떡볶이  35.잔치국수  36.비빔국수  37.쇠고기전골  38.콩비지찌개  39.김치볶음밥");
		System.out.println("[양식 일식 중식]");
		System.out.println("  40.안심스테이크  41.야채수프  42.크림수프  43.오므라이스  44.카레라이스  45.포크커플릿  46.스파게티  47.리자나  48.피자(한조각) 49.참치샌드위치  50.햄치즈샌드위치");
		System.out.println("  51.자장면  52.볶음밥  53.우동  54.짬뽕  55.군만두  56.깐풍기  57.탕수육  58.해파리냉채  59.일본식우동  60.돌냄비우동");
		System.out.println("  61.김밥(1줄) 62.유부초밥(10개) 63.참치초밥  64.회덮밥  65.튀김덮밥  66.새우야채튀김  67.메밀국수  68.알탕 69.돈까스 70.생선까스");
		System.out.println("  71.시리얼  72.야채샐러드  73.참치회덮밥  74.군만두(3개) 75.물만두(5개) 76.자장밥  77.울면  78.팔보채  79.단무지(3조각) 80.햄버그스테이크");
		System.out.println("[패스트푸드]");
		System.out.println("  81.3분카레  82.감자튀김  83.너겟  84.맛살  85.빅맥  86.새우탕 사발면  87.생생우동  88.짜짜로니  89.참치통조림  90.치즈버거");
		System.out.println("  91.치킨스틱  92.콘샐러드  93.핫도그  94.신라면  95.안성탕면  96.육개장사발면  97.김치사발면  98.밥버거  " );
//배열의 첫번째 열은 음식 종류 두번째 열은 양 세번째 열은 칼로리저장
		System.out.println("");
		System.out.println("먹은 음식의 개수를 입력하시오:");
		n=input.nextInt();
		int[][] food= new int[n][3];

		System.out.println("먹은 음식을 입력하시오	:");
		for (int i=0;i<n;i++){
			food[i][0]=input.nextInt();
			if (food[i][0]>98||food[i][0]<1){
				System.out.println("다시 입력하세요.(1~98)");
				food[i][0]=input.nextInt();
			}
		}
		System.out.println("각각 먹은 양(인분)을 입력하세요:");
		for (int i=0;i<n;i++){
			food[i][1]=input.nextInt();
			Calory kcal=new Calory(food[i][0],food[i][1]);
			food[i][2]=(int) kcal.getCalory();
			}

		for (int i=0;i<n;i++){
			total+=food[i][2];
		}
		System.out.println("총 섭취한 칼로리의 양:"+total+"Kcal");







//화면에 운동 종류 출력 
		System.out.print("운동표(Kcal/h) : ");	
		String[] Exer={"등산", "줄넘기", "조깅", "수영(자유형)", "수영(평형)", "파도타기", "에어로빅", "테니스", "스키", "농구", "볼링", "소프트볼", "배구", "탁구", "야구", "사이클", "수상스키", "피구","계단에서 뛰어오르기", "계단 오르내리기", "해당사항없음"};

		for(int i=0; i<Exer.length; i++){
			System.out.print(i+1+"-"+Exer[i]+" ");
			if((i+1)%10==0){
				System.out.println();
				System.out.print("\t       " );
				}
			}
		boolean Do=false;
		double sum=0;
//운동한 종목별 시간단 칼로리 계산
		try{
			while(!Do){
				System.out.println(" ");
				System.out.print("운동한 종목(Number) : ");
				int Number=input.nextInt();
				System.out.print("운동한 시간(Hour) : ");
				double Hour=input.nextDouble();
				Calory2 calory=new Calory2(Number, Hour);
				System.out.println("선택하신 운동으로 소비한 칼로리 :"+calory.toString()+"Kcal");
				System.out.println(" ");
				System.out.print("추가 입력을 더하시겠습니까? (Yes or No) ");
				String Get=input.next();
				sum+=calory.getCalory();
				if(Get.equalsIgnoreCase("YES")){
					Do=false;}
				else if(Get.equalsIgnoreCase("NO")){
					Do=true;
					System.out.println("");
					System.out.println("운동으로 소비한 총 칼로리 : " +sum+"Kcal");
					}
				else{
					System.out.println("Yes 혹은 No를 입력해주세요");
					System.exit(0);
					}
				}
			}
		catch(InputMismatchException ex){
			System.out.println("오류, 올바른 입력을 해주세요");
			}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("오류, 올바른 운동 종목 숫자를 입력해주세요");
		}
//실행결과 텍스트파일로 저장
		java.io.PrintWriter output=new java.io.PrintWriter(peopleName+".txt"); 
		output.println("먹은 날짜 : "+date.toString());
		output.println("당신의 하루 권장 칼로리 : "+kc+"kcal");
		output.println("먹은 음식의 개수 : "+n+"개");
		output.print("먹은 음식 종류 : ");
		for (int i=0;i<n;i++ ){
			output.print(getFoodName(food[i][0])+" ");
		}
			output.println(" ");
			output.println("총 섭취 칼로리 : "+total+"kcal");
			output.println("운동으로 소비한 총 칼로리: "+sum+"kcal");
			output.close();	
			
		System.out.println(peopleName+"님의 하루 섭취 칼로리 : "+kc+"Kcal,  섭취한 총 칼로리 : "+total+"Kcal,  운동으로 총 소비한 칼로리 : "+sum+"Kcal");	
}





//파일에 저장할때 음식이름을 갖고오는 메소드
public static String getFoodName(int number){
String foodname = null;	

	switch (number)
	{
	case 1: foodname="쌀밥"; break;
	case 2: foodname="된장찌개";break;
	case 3: foodname="참치김치찌개";break;
	case 4: foodname="순두부찌개";break;
	case 5: foodname="부대찌개";break;
	case 6: foodname="해물탕";break;
	case 7: foodname="콩나물국";break;
	case 8: foodname="북어국";break;
	case 9: foodname="갈비찜";break;
	case 10: foodname="불고기";break;
	case 11: foodname="감자조림";break;
	case 12: foodname="장조림";break;
	case 13: foodname="낙지볶음";break;
	case 14: foodname="멸치볶음";break;
	case 15: foodname="잡채";break;
	case 16: foodname="김치전";break;
	case 17: foodname="파전";break;
	case 18: foodname="시금치나물";break;
	case 19: foodname="도라지나물";break;
	case 20: foodname="배추김치";break;
	case 21: foodname="열무김치";break;
	case 22: foodname="깍두기";break;
	case 23: foodname="갈치구이(1토막)";break;
	case 24: foodname="갈비탕";break;
	case 25: foodname="설렁탕";break;
	case 26: foodname="삼계탕";break;
	case 27: foodname="떡국";break;
	case 28: foodname="칼국수";break;
	case 29: foodname="물냉면";break;
	case 30: foodname="비빔냉면";break;
	case 31: foodname="비빔밥";break;
	case 32: foodname="만두국";break;
	case 33: foodname="라면";break;
	case 34: foodname="떡볶이";break;
	case 35: foodname="잔치국수";break;
	case 36: foodname="비빔국수";break;
	case 37: foodname="쇠고기찌개";break;
	case 38: foodname="콩비지찌개";break;
	case 39: foodname="김치볶음밥";break;
	case 40:foodname="안심스테이크"; break;
	case 41:foodname="야채수프"; break;
	case 42:foodname="크림수프"; break;
	case 43:foodname="오므라이스"; break;
	case 44:foodname="카레라이스"; break;
	case 45:foodname="포크커틀릿"; break;
	case 46:foodname="스파게티"; break;
	case 47:foodname="리자나"; break;
	case 48:foodname="피자"; break;
	case 49:foodname="참치샌드위치"; break;
	case 50:foodname="햄치즈샌드위치"; break;
	case 51:foodname="자장면"; break;
	case 52:foodname="볶음밥"; break;
	case 53:foodname="우동"; break;
	case 54:foodname="짬뽕"; break;
	case 55:foodname="군만두"; break;
	case 56:foodname="깐풍기"; break;
	case 57:foodname="탕수육"; break;
	case 58:foodname="해파리냉채"; break;
	case 59:foodname="일본식우동"; break;
	case 60:foodname="돌냄비우동"; break;
	case 61:foodname="김밥"; break;
	case 62:foodname="유부초밥"; break;
	case 63:foodname="참치초밥"; break;
	case 64:foodname="회덮밥"; break;
	case 65:foodname="튀김덮밥"; break;
	case 66:foodname="새우야채튀김"; break;
	case 67:foodname="메밀국수"; break;
	case 68:foodname="알탕"; break;
	case 69:foodname="돈까스"; break;
	case 70:foodname="생선까스"; break;
	case 71:foodname="시리얼"; break;
	case 72:foodname="야채샐러드"; break;
	case 73:foodname="참치회덮밥"; break;
	case 74:foodname="군만두"; break;
	case 75:foodname="물만두"; break;
	case 76:foodname="자장밥"; break;
	case 77:foodname="울면"; break;
	case 78:foodname="팔보채"; break;
	case 79:foodname="단무지"; break;
	case 80:foodname="햄버그스테이크"; break;
	case 81:foodname="3분카레"; break;
	case 82:foodname="감자튀김"; break;
	case 83:foodname="너겟"; break;
	case 84:foodname="맛살"; break;
	case 85:foodname="빅맥"; break;
	case 86:foodname="새우탕 사발면"; break;
	case 87:foodname="생생우동"; break;
	case 88:foodname="짜짜로니"; break;
	case 89:foodname="참치통조림"; break;
	case 90:foodname="치즈버거"; break;
	case 91:foodname="치킨스틱"; break;
	case 92:foodname="콘샐러드"; break;
	case 93:foodname="핫도그"; break;
	case 94:foodname="신라면"; break;
	case 95:foodname="안성탕면"; break;
	case 96:foodname="육개장사발면"; break;
	case 97:foodname="김치사발면"; break;
	case 98:foodname="밥버거"; break;
	}return foodname;
	}
	}
	
	
	
	
	
	
	//음식별 칼로리계산 class
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
	
	
	//운동 소비 칼로리 계산 class
class Calory2{
	protected int number;
	protected double hour;
		
	public Calory2(int number, double hour){
		this.number=number;
		this.hour=hour;
		}
	public double getCalory(){ //운동별 시간당 칼로리
		double[] Cal={196, 224, 196, 518, 273, 176, 126, 176, 186, 200, 90, 90, 200, 200, 180, 111, 200, 102, 188, 141, 0};
		return Cal[number-1]*hour;
		}
	@Override
	public String toString(){
		return " "+getCalory();
			}
	}
