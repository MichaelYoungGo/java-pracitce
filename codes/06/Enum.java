public class EnumTest {
	public void judge(SeasonEnum s){
		switch (s){
			case SPRING:
				System.out.println("春暖花开，正好踏青");
			case SUMMER:
				System.out.println("夏日炎炎，适合游泳");
			case FALL:                                
				System.out.println("秋高气爽，进补及时");
			case WINNER:                                                               	     System.out.println("冬日雪飘，围炉赏雪");
		}
	}
	
}
