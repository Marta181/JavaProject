package displayWindow;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import planeDrawer.Plane;

public class MeshFrame {
	
	public static final int WIDTH=900;
	public static final int HEIGHT=900;
    
	

	public MeshFrame() {
		
		//Displaying JFrame by OpenGL MeshFrame constructor
		MainDisplay buttonspanel = new MainDisplay();
		buttonspanel.setVisible(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			Display.setTitle("Terrain Display");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);//it s working without it
		GL11.glLoadIdentity();//witout it either
		GL11.glOrtho(0, WIDTH, 0, HEIGHT, 1, -1);//but not without it
		
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
	
	//public static void main(String[] args) {
		//MeshFrame frameDisplay = new MeshFrame();
		
		

	//}
	 
}
