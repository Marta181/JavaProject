package displayWindow;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import planeDrawer.Plane;

public class MainFrame {
	
	private static final int WIDTH=1000;
	private static final int HEIGHT=1000;
    
	

	public MainFrame() {
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);//bez tego dzia³a
		GL11.glLoadIdentity();//bez tego tez
		GL11.glOrtho(0, WIDTH, 0, HEIGHT, 1, -1);//bez tego nie
		
		//MainLoop
		while(!Display.isCloseRequested()) {
			
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			GL11.glColor3f(0.2f, 0.3f, 0.8f);
			GL11.glPolygonMode(GL11.GL_FRONT, GL11.GL_LINE);
			
			
			Plane.init();
			

			GL11.glPolygonMode(GL11.GL_FRONT, GL11.GL_FILL);
			
			Display.update();
		}
		
		Display.destroy();

	
	}
	
	public static void main(String[] args) {
		MainFrame frameDisplay = new MainFrame();
		
		

	}

}
