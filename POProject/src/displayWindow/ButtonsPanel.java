package displayWindow;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import planeDrawer.Plane;
import displayWindow.MainFrame;

public class ButtonsPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setLayout(new GridLayout(1,2));  //this oznacza obiekt tej klasy, który będzie utworzony w main (i każdy kolejny obiekt)
		
    ButtonsPanel panel1;
		
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JLabel label;	
    public ButtonsPanel() throws HeadlessException{   //konstruktor
      panel1 = new ButtonsPanel();
      panel1.setBackground(Color.white);
      panel1.setSize(500, 400);
      panel1.setLayout(new GridLayoutLayout(8,1));
      button1 = new JButton ("długość terenu");
      button2 = new JButton ("szerokość terenu");
      button3 = new JButton ("maksymalna wysokość punktu");
	    button4 = new JButton ("minimalna wysokość punktu");
	    button5 = new JButton ("ziarnistość terenu");
	    button6 = new JButton ("ziarno");
	    button7 = new JButton ("względna zależność wysokości punktu od najbliższego otoczenia");
	    button8 = new JButton ("Generuj");
	    
      label = new JLabel ("Tutaj bedzie widoczny wygenerowany teren.");
	panel1.add(button1);
	panel1.add(button2);
	panel1.add(button3);
	panel1.add(button4);
	panel1.add(button5);
	panel1.add(button6);
	panel1.add(button7);
	panel1.add(button8);
	    this.add(panel1, BorderLayout.EAST);
    }
	
	public static void main(String[] args) {
		ButtonsPanel buttonspanel = new ButtonsPanel();
		buttonspanel.setVisible(true);
	}

}

