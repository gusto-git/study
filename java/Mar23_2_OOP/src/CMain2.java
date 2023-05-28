import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
// 이클립스 전체화면
public class CMain2 {
	public static void main(String[] args) {
		try {
			Robot r = new Robot();
			// 2560 x 1440
			r.mouseMove(2540, 0);
			Thread.sleep(300);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.keyPress(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
