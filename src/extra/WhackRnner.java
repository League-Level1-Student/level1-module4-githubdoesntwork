package extra;

public class WhackRnner {
public static void main(String[] args) {
	Whack wack = new Whack();
	wack.drawButtons();
	while(!(wack.moles==10||wack.failMoles==5)) {
		if(wack.a) {
			wack.drawButtons();
		}
		System.out.println();
	}
	System.exit(0);
}
}
