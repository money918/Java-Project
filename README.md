# Java-Project
기능 모듈화 :

① 성별, 나이, 활동량을 입력 받은 후 1일 권장 칼로리 출력

② 음식 종류를 제시한 후 사용자가 하루 동안 섭취한 음식 입력,섭취한 총 칼로리 출력                                                               

③ 1일 운동으로 소비한 칼로리 계산 및 출력




성별 입력
---
        System.out.print("성별(M/F) 입력하세요 : ");
		String gender=input.next();//문자(성별) 입력
        switch(gender.toUpperCase());
>.toUpperCase() 사용하여 성별 대소문자 구분없이 입력받는다.    

활동량 입력
---
		System.out.println("활동량[숫자] 입력하세요 : 1-거의 없음 2-보통 3-심한 운동 ");
		active=input.nextInt();//정수(활동량) 입력
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
>활동량별로 소모칼로리가 다르기 때문에 활동량 정도를 숫자로 입력을 받는다.
>
>이 점에서 활동량 정도를 세 개의 숫자로 입력받는 것은 활동량을 나타내는 것이 부족해서 고쳐야할 부분이다.
>
>지정된 숫자 1, 2, 3 외에 입력할 시 "활동량을 잘못 입력하였다고 메세지를 준다"

잘못된 입력
---
	catch(InputMismatchException ex1){
		System.out.println("오류, 올바른 입력을 해주세요");
			System.exit(1);
>잘못된 신장, 나이, 성별을 입력했을시 오류메시지를 출력

섭취한 칼로리 계산
---
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
>섭취한 음식와 양을 선택하여 하루동안 총 섭취한 칼로리의 양을 계산한다.
>
>음심별 칼로리를 일일이 입력하여 작성하였으며, 음식의 종류가 제한적이다.

소비한 칼로리 계산
---

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
>하루동안 운동과 시간을 입력받아서 운동으로 소비한 칼로리를 계산한다.
>
>올바른 입력외에 오류 발생시에는 catch(InputMismatchException ex) 사용하여, 오류 메세지를 보낸다.
>

Java 예외처리문
---
ArrayIndexOutOfBoundsException 
- 배열을 사용시 존재하지 않는 index값을 호출하면 발생한다.
NumberFormatException
- 숫자로 변경 할 수 없는 문자열을 변경하려고 하는 경우 발생한다.
Exception
- 위 두개가 형태가 아닌 경우의 모든 에러를 의미한다.
[출처] [JAVA] 예외처리 - try~catch, throws|작성자 꿈의인생

---
