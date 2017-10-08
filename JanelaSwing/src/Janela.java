import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
		setTitle("Criando uma Janela");
	}

	public static void main(String[] args) {
		new Janela();
	}

}
