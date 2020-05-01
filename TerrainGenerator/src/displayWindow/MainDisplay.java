package displayWindow;

import java.awt.BorderLayout;


import javax.swing.JFrame;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

public class MainDisplay extends JFrame {
	
	final public static int HEIGHT = 700;
	final public static int WIDTH = 1000;
	
	   public static void main( String[] args ) {
			/*
		      final GLProfile profile = GLProfile.get( GLProfile.GL2 );
		      GLCapabilities capabilities = new GLCapabilities( profile );
		      
		      // The canvas
		      final GLCanvas glcanvas = new GLCanvas( capabilities );
		      CubePanel cube = new CubePanel();
		      ConfigPanel conf = new ConfigPanel();
				
		      glcanvas.addGLEventListener( cube );
		      glcanvas.setSize( 1000, 700 );
				
		      final JFrame frame = new JFrame ( " Multicolored cube" );
		      frame.setLayout(new BorderLayout());
		      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		      frame.getContentPane().add( glcanvas );
		      frame.setSize( frame.getContentPane().getPreferredSize() );
		      frame.setVisible( true );
		      frame.add(cube, BorderLayout.EAST);
		      frame.add(conf,BorderLayout.WEST);
		      final FPSAnimator animator = new FPSAnimator(glcanvas, 300,true);
				
		      animator.start();
		    */
		 //getting the capabilities object of GL2 profile
		      final GLProfile profile = GLProfile.get(GLProfile.GL2);
		      GLCapabilities capabilities = new GLCapabilities(profile);
		      
		      // The canvas 
		      final GLCanvas glcanvas = new GLCanvas(capabilities);
		     
		      MeshPanel mesh = new MeshPanel();
		      //mesh.setBackground(Color.BLUE);
		      ConfigPanel conf = new ConfigPanel();
		      glcanvas.addGLEventListener(mesh);
		     // glcanvas.setSize(500,HEIGHT);
		      
		      //creating frame
		      final JFrame frame = new JFrame ("mesh");
		      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		      frame.setLayout(new BorderLayout());
		      
		      //adding canvas to frame
		      frame.getContentPane().add(glcanvas);
		      //frame.setSize(frame.getContentPane().getPreferredSize());
		      frame.setSize(WIDTH,HEIGHT);
		      //frame.add(mesh);
		      
		      frame.add(glcanvas, BorderLayout.CENTER);
		      frame.add(conf,BorderLayout.EAST);
		      frame.setVisible(true);
		      
		      final FPSAnimator animator = new FPSAnimator(glcanvas, 300,true); 
		         animator.start();
		   }
		   

}
