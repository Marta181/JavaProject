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
			String LengthString = setLengthTextField.getText();
			int Length = 0;
			try
			{
			Length = Integer.parseInt(LengthString);
			}
			catch (NumberFormatException)
			{
				Length = 700;
			}
		break;	
		}
		case "WIDTH": {
			System.out.println("Nothing to do here with width");
			String WidthString = setWidthTextField.getText();
			int Width = 0;
			try
			{
			Width = Integer.parseInt(WidthString);
			}
			catch (NumberFormatException)
			{
				Width = 1000;
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
			long seed;
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

