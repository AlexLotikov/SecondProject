import javax.swing.JFrame;

public class Graphics {			//патч 1

	public static void graphics(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 500);
		frame.setTitle("This is title from...");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
								
	}
}
