package displayWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String optionPicked = e.getActionCommand();
		
		switch (optionPicked) {
		case "LENGHT": {
			System.out.println("Nothing to do here with length");
		break;	
		}
		case "WIDTH": {
			System.out.println("Nothing to do here with width");
			
			break;
		}
		case "MAX": {
			System.out.println("Nothing to do here with max");
			
			break;
		}
		case "MIN": {
			System.out.println("Nothing to do here with min");
			
			break;
		}
		case "ROUGHNESS": {
			System.out.println("Nothing to do here with roughness");
			
			break;
		}
		case "SEED": {
			System.out.println("Nothing to do here with seed");
			
			break;
		}
		case "RELATION": {
			System.out.println("Nothing to do here with relation");
			
			break;
		}
		case "GENERATE": {
			System.out.println("Nothing to do here with generate");
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + optionPicked);
		}

	}

}
