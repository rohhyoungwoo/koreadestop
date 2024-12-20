package task01;

public class BasicTv {

//		2. BasicTv 클래스를 작성하세요
//		필드 :
//		boolean power : TV 전원 상태 (기본값: false)
//		int channel : TV 채널 (기본값: 1)
//		String color : TV의 색상
//		int size : TV의 크기
//		int price : TV의 가격

		//필드 생성
		boolean power;
		int channel;
		String color;
		int size;
		int price;
		
		
		
		
//		메서드:
//		void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//		      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//		void channelUp() : 채널을 1씩 증가시키는 메서드
//		      채널 최대값 999
//		void channelDown() : 채널을 1씩 감소시키는 메서드
//		      채널 최소값 1
	//
		//메서드 생성
		void powerOnOff() {
			power = !power;
			System.out.println("전원 상태" + ((power) ? "TV 전원이 켜졌습니다" : "TV 전원이 꺼졌습니다"));
		}
		void channelUp() {
			if(power) {
//				System.out.println("현재 채널 : " + channel);
				if(channel <= 999) {
					channel++;
					System.out.printf("현재 채널: [%d] ",channel);
				}else {
					System.out.println("채널을 표시 할 수 없습니다(최대999)");
				}
			}else
				System.out.println("TV 전원을 먼저 켜주세요");
		}
		
		void channelDown() {
			if(power) {
//				System.out.println("현재 채널 : " + channel);
				if(channel >= 1) {
					channel--;
					System.out.printf("현재 채널: [%d] ",channel);
				}else if(channel <= 0){
					System.out.println("채널을 표시 할 수 없습니다(최소1)");
				}
			}else
				System.out.println("TV 전원을 먼저 켜주세요");
		}
		
		
		
		
		
		public BasicTv(String color, int size, int price) {

			this.color = color;
			this.size = size;
			this.price = price;
		}
			
		
		
		
		
		
		
//		3. BasicTv 클래스와 함께 동작하는 TvController 프로그램을 작성하세요
//		   프로그램은 사용자로부터 명령을 입력받아 TV를 제어한다
	//
//		   BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//		   프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
	//
//		=== TV 컨트롤 메뉴 ===
//		1. 전원 On/Off
//		2. 채널 올리기
//		3. 채널 내리기
//		4. 종료
//		메뉴 번호 입력 : 
	//
//		사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//		1 : powerOnOff() 메서드 호출
//		   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//		2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//		   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//		3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//		그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
	}

