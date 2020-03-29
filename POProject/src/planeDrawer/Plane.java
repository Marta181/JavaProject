package planeDrawer;
import org.lwjgl.opengl.GL11;
import displayWindow.MainFrame;
public class Plane {
	
	private static int columns=100;
	private static int rows=100;
	private static int HeightScale=1000/rows;
	private static int WidthScale=1000/columns;
	//static float triangleMesh[]= new float[1];

	
	static public void init() {
		
		
		for(int i=1000; i>=HeightScale;i-=HeightScale){
			GL11.glBegin(GL11.GL_TRIANGLE_STRIP);
			for (int j = 0; j <= 1000; j+=WidthScale) {
				GL11.glVertex3f(j, i, 0);
				GL11.glVertex3f(j, i-HeightScale, 0);
			}
			GL11.glEnd();
			
		}		
		
	}
}
