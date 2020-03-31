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
    JMenu menu1;	
		
    public ButtonsPanel() throws HeadlessException{   //konstruktor
     this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.setLayout(new BorderLayout());		//this oznacza obiekt tej klasy, który będzie utworzony w main (i każdy kolejny obiekt)
	
	JMenuBar menuBar = new JMenuBar();
	menu1 = new JMenu("Menu");//w "" nazwa menu       // menu1 jako zm. globalna

	        JMenuItem menuItem1 = new JMenuItem("Zapisz");
	        //menuItem1.addActionListener(this);
	        JMenuItem menuItem2 = new JMenuItem("Otwórz");
	        //menuItem2.addActionListener(this);
	        JMenuItem menuItem3 = new JMenuItem("Nowy");
	        //menuItem3.addActionListener(this);
	        JMenuItem menuItem4 = new JMenuItem("Interpolacja");
	    
	        menu1.add(menuItem1);// to przez to nie dziaÂłaÂł suwak (nie moÂżna byÂło go przesuwaĂ¦)
	        menu1.add(menuItem2);
	        menu1.add(menuItem3);
	    	menu1.add(menuItem4);
	        menuBar.add(menu1);
	        this.setJMenuBar(menuBar);//dodaje do okna obiekt klasy JMenuBar	
	    
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

