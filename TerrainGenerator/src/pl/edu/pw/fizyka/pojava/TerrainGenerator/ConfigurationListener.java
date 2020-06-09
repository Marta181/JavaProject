package package2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

import javax.swing.JFileChooser;
public class ConfigurationListener implements ActionListener {

	ConfigPanel confPanel;
	//Params param;
	public ConfigurationListener(ConfigPanel configPanel) {
		// TODO Auto-generated constructor stub
		this.confPanel = configPanel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String optionPicked = e.getActionCommand();

		switch (optionPicked) {

		case "GENERATE": {
			System.out.println("generate");
			ConfigPanel.setGenerating(true);
			
			 String lengthString = confPanel.getLengthTextField().getText(); 
			  try {
			  Params.setLength(Integer.parseInt(lengthString));
			  } 
			  catch (NumberFormatException ex) {
				  System.out.println("Nothing to do here with length");
			  }
			  
				String widthString = confPanel.getWidthTextField().getText();
				try
				{
					 Params.setWidth(Integer.parseInt(widthString));
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Nothing to do here with width");
				}
			  
				String maxHeightString = confPanel.getMaxHeightTextField().getText();
				try
				{
					Params.setMaxHeight(Float.parseFloat(maxHeightString));
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Nothing to do here with max");
				}
				
				
				String minHeightString = confPanel.getMinHeightTextField().getText();
				try
				{
					Params.setMinHeight(Float.parseFloat(minHeightString));
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Nothing to do here with min");
				}
				
				String roughnessString = confPanel.getRoughnessTextField().getText();
				try
				{
					Params.setRoughness(Float.parseFloat(roughnessString));
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Nothing to do here with roughness");
				}
				
				String seedString = confPanel.getSeedTextField().getText();
				try
				{
					Params.setSeed(Integer.parseInt(seedString));
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Nothing to do here with seed");
				}
				
				String relativnessString = confPanel.getRelativnessTextField().getText();
				try
				{
					Params.setRelativness(Float.parseFloat(relativnessString));
				}
				catch (NumberFormatException ex)
				{
					System.out.println("Nothing to do here with relativness");
				}
				
			break;
			
			

		}
		case "LINEAR": {
			System.out.println("Nothing to do here with linear");
			Params.setIsLinear(true);
		break;	
		}
		case "TRIGONOMETRIC": {
			System.out.println("Nothing to do here with trigonometric");
			Params.setIsLinear(false);
		break;	
		}
		case "SAVE": {
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogTitle("Choose file");
			int result = chooser.showDialog(null, "Choose");
			if(JFileChooser.APPROVE_OPTION == result) {
				System.out.println("File chosen: " + chooser.getSelectedFile().toPath());
				FileWriter writer = null;
				BufferedWriter bufferedWriter = null;
				try {
					writer = new FileWriter(chooser.getSelectedFile());
					bufferedWriter = new BufferedWriter(writer);
					for (int x = 0; x<Params.getWidth(); x++) {
						for (int y = 0; y<Params.getLength(); y++) {
						String str = Float.toString(MeshPanel.height[x][y]);
						bufferedWriter.write(str);
						bufferedWriter.newLine();
						}
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}	
				String lengthString = confPanel.getLengthTextField().getText();
					try 
					{
						  bufferedWriter.write(lengthString);
						  bufferedWriter.newLine();
					} 
					catch (NumberFormatException | IOException ex) 
					{
						  System.out.println("Nothing to do here with length");
					}
				String widthString = confPanel.getWidthTextField().getText();
					try 
					{
						  bufferedWriter.write(widthString);
						  bufferedWriter.newLine();
					}
					catch (NumberFormatException | IOException ex) 
					{
							System.out.println("Nothing to do here with width");
					}
				String maxHeightString = confPanel.getMaxHeightTextField().getText();
					try 
					{
						  bufferedWriter.write(maxHeightString);
						  bufferedWriter.newLine();
					}
					catch (NumberFormatException | IOException ex) 
					{
							System.out.println("Nothing to do here with max");
					}
				String minHeightString = confPanel.getMinHeightTextField().getText();
					try 
					{
						  bufferedWriter.write(minHeightString);
						  bufferedWriter.newLine();
					}
					catch (NumberFormatException | IOException ex) 
					{
							System.out.println("Nothing to do here with min");
					}
				String roughnessString = confPanel.getRoughnessTextField().getText();
					try 
					{
						  bufferedWriter.write(roughnessString);
						  bufferedWriter.newLine();
					}
					catch (NumberFormatException | IOException ex) 
					{
							System.out.println("Nothing to do here with roughness");
					}
				String seedString = confPanel.getSeedTextField().getText();
					try 
					{
						  bufferedWriter.write(seedString);
						  bufferedWriter.newLine();
					}
					catch (NumberFormatException | IOException ex) 
					{
							System.out.println("Nothing to do here with seed");
					}
				String relativnessString = confPanel.getRelativnessTextField().getText();
					try 
					{
						  bufferedWriter.write(relativnessString);
						  bufferedWriter.newLine();
					}
					catch (NumberFormatException | IOException ex) 
					{
							System.out.println("Nothing to do here with relativness");
					}
					try {
						bufferedWriter.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				
			}
			else 
				System.out.println("No file has been chosen");
			break;
		}
		case "OPEN": {
			JFileChooser chooser = new JFileChooser();
			chooser.setDialogTitle("Choose file");
			int result = chooser.showDialog(null, "Choose");
			if(JFileChooser.APPROVE_OPTION == result) {
				System.out.println("File chosen: " + chooser.getSelectedFile());
				FileReader reader = null;
				BufferedReader bufferedReader = null;
				try {
					reader = new FileReader(chooser.getSelectedFile());
					bufferedReader = new BufferedReader(reader);
					for (int x = 0; x<Params.getWidth(); x++) {
						for (int y = 0; y<Params.getLength(); y++) {
							 String str = bufferedReader.readLine();
							MeshPanel.height[x][y] = Float.parseFloat(str);
						}
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				try 
				{
					  String lengthString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(lengthString));
					  confPanel.getLengthTextField().setText(lengthString);
				} 
				catch (NumberFormatException | IOException ex) 
				{
					  System.out.println("Nothing to do here with length");
				}
				try 
				{
					 String widthString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(widthString));
					  confPanel.getWidthTextField().setText(widthString);
				}
				catch (NumberFormatException | IOException ex) 
				{
						System.out.println("Nothing to do here with width");
				}
				try 
				{
					 String maxHeightString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(maxHeightString));
					  confPanel.getMaxHeightTextField().setText(maxHeightString);
				}
				catch (NumberFormatException | IOException ex) 
				{
						System.out.println("Nothing to do here with max");
				}
				try 
				{
					 String minHeightString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(minHeightString));
					  confPanel.getMinHeightTextField().setText(minHeightString);
				}
				catch (NumberFormatException | IOException ex) 
				{
						System.out.println("Nothing to do here with min");
				}
				try 
				{
					 String roughnessString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(roughnessString));
					  confPanel.getRoughnessTextField().setText(roughnessString);
				}
				catch (NumberFormatException | IOException ex) 
				{
						System.out.println("Nothing to do here with roughness");
				}
				try 
				{
					 String seedString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(seedString));
					  confPanel.getSeedTextField().setText(seedString);
				}
				catch (NumberFormatException | IOException ex) 
				{
						System.out.println("Nothing to do here with seed");
				}
				try 
				{
					 String relativnessString = bufferedReader.readLine();
					  Params.setLength(Integer.parseInt(relativnessString));
					  confPanel.getRelativnessTextField().setText(relativnessString);
				}
				catch (NumberFormatException | IOException ex) 
				{
						System.out.println("Nothing to do here with relativness");
				}
				try {
					bufferedReader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}	
			}
			else 
				System.out.println("No file has been chosen");
			break;
		}
		case "NEW": {
			  try {				
			  Params.setLength(0);
			  } 
			  catch (NumberFormatException ex) {
				  System.out.println("Nothing to do here with length");
			  }
			  try {
				  Params.setWidth(0);
			  } 
			  catch (NumberFormatException ex) {
					  System.out.println("Nothing to do here with width");
			  }
			  try {
				  Params.setMaxHeight(0);
			  } 
			  catch (NumberFormatException ex) {
					  System.out.println("Nothing to do here with max");
			  }
			  try {
				  Params.setMinHeight(0);
			  } 
			  catch (NumberFormatException ex) {
					  System.out.println("Nothing to do here with min");
			  }
			  try {
				  Params.setRoughness(0);
			  } 
			  catch (NumberFormatException ex) {
					  System.out.println("Nothing to do here with roughness");
			  }
			  try {
				  Params.setSeed(0);
			  } 
			  catch (NumberFormatException ex) {
					  System.out.println("Nothing to do here with seed");
			  }
			  try {
				  Params.setRelativness(0);
			  } 
			  catch (NumberFormatException ex) {
					  System.out.println("Nothing to do here with relativness");
			  }
			  
			  confPanel.getLengthTextField().setText("0");
			  confPanel.getWidthTextField().setText("0");
			  confPanel.getMaxHeightTextField().setText("0");
			  confPanel.getMinHeightTextField().setText("0");
			  confPanel.getRoughnessTextField().setText("0");
			  confPanel.getSeedTextField().setText("0");
			  confPanel.getRelativnessTextField().setText("0");
			  break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + optionPicked);
		}

	}

}