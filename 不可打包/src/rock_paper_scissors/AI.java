package rock_paper_scissors;

import java.util.Random;

public class AI {
	static int winNUM=0;
	static int drawNUM=0;
	static int lostNUM=0; 

	//1��2����3ʯͷ  -1�� 0ƽ 1Ӯ
	static Random random =new Random();
public static int ai(int num) {
	int rand=random.nextInt(1200)+1;
	switch (rand%3+1) {//1��2����3ʯͷai���ϴ���ҳ���
	case 1:
		switch (num) {
		case 1:
			drawNUM++;
			
			break;
		case 2:
			winNUM++;
		
			break;
		case 3:
			lostNUM++;
			
			break;
		
		}
		
		break;

	case 2://1��2����3ʯͷ
		switch (num) {
		case 1:
			lostNUM++;
			
			break;
		case 2:
			drawNUM++;
			
			break;
		case 3:
			winNUM++;
			
			break;
		
		}
		break;
		
	case 3://1��2����3ʯͷ
		switch (num) {
		case 1:
			winNUM++;
			
			break;
		case 2:
			lostNUM++;
			
			break;
		case 3:
			drawNUM++;
			
			break;
		
		}
		break;
	}

	return rand%3+1;
	
	
}
}
