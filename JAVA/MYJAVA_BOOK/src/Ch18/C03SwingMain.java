package Ch18;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{	
	
	C03GUI(String title){
		//Frame 
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Panel
		JPanel panel = new JPanel();
//		Color col = new Color(71,144,0);
//		panel.setBackground(col);
		
		//Frame(Panel)
		add(panel);
	}
}

public class C03SwingMain {

	public static void main(String[] args) {
		new C03GUI("세번째 프레임입니다");
	}

}
