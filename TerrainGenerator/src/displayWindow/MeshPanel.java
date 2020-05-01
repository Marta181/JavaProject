package displayWindow;

import java.awt.DisplayMode;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import javax.swing.JFrame;


import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;



public class MeshPanel extends GLJPanel implements GLEventListener {

   public static DisplayMode dm, dm_old;
   private GLU glu = new GLU();
   private float rquad = 0.0f;
   
   int xCount = 9000;
   int yCount = 7000;
   Random heightRandom = new Random();
   float[][] height = new float[xCount][yCount];
   private long seed;
   
   //private double panelWidthOffset;	
   //private double panelHeightOffset;
   	//private int panelHeight;
    //private int panelWidth;
	private static int columns=10;
	private static int rows=10;
	//private static int HeightScale=HEIGHT/rows;
	//private static int WidthScale=WIDTH/columns;
	public MeshPanel() {
		// TODO Auto-generated constructor stub
		//this.setSize(500, 500);
		//panelHeight = this.getHeight();
		//panelWidth = this.getWidth();
		//panelHeightOffset = this.getY();
		//panelWidthOffset = this.getX();
		seed=7347248;
		for (int x = 0; x < xCount; x++) {
			for (int y = 0; y < yCount; y++) {
				height[x][y]=generateHeight(x, y);
			}
		}
	}
      
   @Override
   public void display( GLAutoDrawable drawable ) {
	 
	   
	      final GL2 gl = drawable.getGL().getGL2();
	      
	      gl.glPolygonMode(GL2.GL_FRONT, GL2.GL_LINE);
	      
	      
	     gl.glClear (GL2.GL_COLOR_BUFFER_BIT |  GL2.GL_DEPTH_BUFFER_BIT );
	     gl.glMatrixMode(GL2.GL_MODELVIEW);
	      gl.glLoadIdentity();
	      gl.glTranslatef( -170f, 10f, -40.5f );
	     // gl.glPushMatrix();
	     //gl.glRotatef( rquad, 0.0f, 20.0f, 0.0f );
	     gl.glRotatef( -29, 1.0f, 0.0f, 0.0f );
	      for(int y=0; y>-yCount; y--){ 

	    	  gl.glBegin( GL2.GL_TRIANGLE_STRIP);
	    	  
				for (int x = 0; x < xCount; x++) {
					gl.glVertex3f(x, y, height[x][-y]);
					gl.glVertex3f(x, y-1,0);
				}
				
				gl.glEnd();
				gl.glFlush();
				
	      }
	      
	     // gl.glPopMatrix();
	      rquad+=1f;
	    }
   
   @Override
   public void dispose( GLAutoDrawable drawable ) {
      // TODO Auto-generated method stub
   }
   
   @Override
   public void init( GLAutoDrawable drawable ) {
	
   }
      
   @Override
   public void reshape( GLAutoDrawable drawable, int x, int y, int width, int height ) {
	 
	   
	   GL2 gl = drawable.getGL().getGL2();
	      
	      if( height <= 0 )
	         height = 1;
				
	      final float h = ( float ) width / ( float ) height;
	      gl.glViewport( 0, 0, width, height );
	      gl.glMatrixMode( GL2.GL_PROJECTION );
	      gl.glLoadIdentity();
	  
			
	      glu.gluPerspective( 95.0f, h, 1.0, 2000.0 );
	      gl.glMatrixMode( GL2.GL_MODELVIEW );
	      gl.glLoadIdentity();
	      
   }
      
   private float generateHeight(int x, int y) {
	   float height=0;
	   heightRandom.setSeed(x*12345+y*4321+seed*54321);
	   
	   
	   
	   
	   return heightRandom.nextFloat()*5;
   }
	
}