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
