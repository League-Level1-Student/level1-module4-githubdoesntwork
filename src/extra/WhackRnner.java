package extra;

public class WhackRnner {
public static void main(String[] args) {
	Whack wack = new Whack();
	wack.drawButtons(0);
	for(int i = 1; i>0;) {
	if(wack.a==true) {
		wack.drawButtons(0);
	}
	if(wack.moles==10) {
		break;
	}
	}
}
}
