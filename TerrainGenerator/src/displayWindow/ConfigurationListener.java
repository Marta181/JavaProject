package displayWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationListener implements ActionListener {
	 

	           /* @Override
	            public void stateChanged(ChangeEvent arg0) {
	                String value = String.format("%d", slider.getValue());      // value
	                label.setText(value);
	            }*/

	@Override
	public void actionPerformed(ActionEvent e) {
		String optionPicked = e.getActionCommand();
		
		switch (optionPicked) {
		case "LENGHT": {
			System.out.println("Nothing to do here with length");
			String HEIGHTString = setLengthTextField.getText();
			try
			{
			HEIGHT = Integer.parseInt(HEIGHTString);
			}
			catch (NumberFormatException)
			{
				HEIGHT = 700;
			}
		break;	
		}
		case "WIDTH": {
			System.out.println("Nothing to do here with width");
			String WIDTHString = setWidthTextField.getText();
			try
			{
			WIDTH = Integer.parseInt(WIDTHString);
			}
			catch (NumberFormatException)
			{
				WIDTH = 1000;
			}
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
			String seedString = setSeedTextField.getText();
			try
			{
			seed = Long.parseLong(seedString);
			}
			catch (NumberFormatException)
			{
				seed = 	7347248;
			}
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

