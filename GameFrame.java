import javax.swing.JFrame;
public class GameFrame extends JFrame{
	GameFrame(){
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //take jframe & fit snugly around comp added to frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);
}
	public static void main(String[] args) {
    		new GameFrame();
}
}