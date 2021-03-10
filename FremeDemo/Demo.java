package FremeDemo;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;

public class Demo {
	
	Frame frame = new Frame("ぞぞぞ");
	Button button = new Button("せせせ");
	
	public void createFrame()
	{
		frame.add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.createFrame();
	}
}