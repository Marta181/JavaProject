package planeDrawer;
import org.lwjgl.opengl.GL11;
import displayWindow.MeshFrame;
public class Plane {
	
	private static int columns=100;
	private static int rows=100;
	private static int HeightScale=MeshFrame.HEIGHT/rows;
	private static int WidthScale=MeshFrame.WIDTH/columns;
	//static float triangleMesh[]= new float[1];

	
	static public void init() {
		
		
		for(int i=MeshFrame.HEIGHT; i>=HeightScale;i-=HeightScale){
			GL11.glBegin(GL11.GL_TRIANGLE_STRIP);
			for (int j = 0; j <= MeshFrame.WIDTH; j+=WidthScale) {
				GL11.glVertex3f(j, i, 0);
				GL11.glVertex3f(j, i-HeightScale, 0);
			}
			GL11.glEnd();
			
		}		
		
	}
}
