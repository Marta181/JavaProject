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
			String lengthString = setLengthTextField.getText();
			int length = 0;
			try
			{
			length = Integer.parseInt(lengthString);
			}
			catch (NumberFormatException)
			{
				length = 700;
			}
		break;	
		}
		case "WIDTH": {
			System.out.println("Nothing to do here with width");
			String widthString = setWidthTextField.getText();
			int width = 0;
			try
			{
			width = Integer.parseInt(widthString);
			}
			catch (NumberFormatException)
			{
				width = 1000;
			}
			break;
		}
		case "MAX": {
			System.out.println("Nothing to do here with max");
			String maxHeightString = setMaxHeightTextField.getText();
			float maxHeight = 0;
			try
			{
			maxHeight = Float.parseFloat(maxHeightString);
			}
			catch (NumberFormatException)
			{
				maxHeight = 70;
			}
			break;
		}
		case "MIN": {
			System.out.println("Nothing to do here with min");
			String minHeightString = setMinHeightTextField.getText();
			float minHeight = 0;
			try
			{
			minHeight = Float.parseFloat(minHeightString);
			}
			catch (NumberFormatException)
			{
				minHeight = 10;
			}
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

