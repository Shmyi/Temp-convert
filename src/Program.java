/*
 * Student Name: Yi Chen
 * Lab Professor: Amal Ibrahim
 * Due Date: Due Date Here
 * Modified: When the file was created or last modified
 * Description:This program allows users to input temperatures in either 
 * Fahrenheit or Celsius and converts them to the other unit
*/
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String temperature_UnitOfMeasure = "celsius";	// Initialize temperature_UnitOfMeasure
		int temperature = 0;	// initialize temperature
		String report	= null; // report from object
		
		//if input not = 'Fahrenheit' or 'Celsius' keep asking user to input
		do {
		System.out.print("Enter the unit ('Fahrenheit' or 'Celsius'): ");
		temperature_UnitOfMeasure = keyboard.nextLine();
		}
		while (!(temperature_UnitOfMeasure.equalsIgnoreCase("Fahrenheit") 
				|| temperature_UnitOfMeasure.equalsIgnoreCase("Celsius")));
		
		System.out.print("Enter the temperature: ");
		temperature = keyboard.nextInt();
		keyboard.nextLine();
		TemperatureConverter temperatureConverter = new TemperatureConverter(temperature, temperature_UnitOfMeasure);
		
		report = temperatureConverter.createReport();

		System.out.println(report);
		// update the line below to include your name
		System.out.println("Program by Yi Chen");
		System.out.println();
		
	}
}



