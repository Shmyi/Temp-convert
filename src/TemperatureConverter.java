/*
 * Student Name: Yi Chen
 * Lab Professor: Amal Ibrahim
 * Due Date: Due Date Here
 * Modified: When the file was created or last modified
 * Description:This program allows users to input temperatures in either 
 * Fahrenheit or Celsius and converts them to the other unit
*/
public class TemperatureConverter {
	private int temperature = 0;	
	private String unit = null;	
//	private String temperature_UnitOfMeasure = "celsius"
	
 	public TemperatureConverter() {
		this(0,"Celsius");
	}
 
	public TemperatureConverter(int temperature, String temperature_UnitOfMeasure) {
		this.temperature = temperature;
		this.unit = temperature_UnitOfMeasure;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String temperature_UnitOfMeasure) {
		this.unit = temperature_UnitOfMeasure;
	}

	public String createReport() {
		String report = null;
		int convertedTemperature = 0;
		String weatherDescription = null;
		String convertedUnit = null;
		unit= unit.toLowerCase();
		switch(unit) {
		case "fahrenheit":     //Fahrenheit case
			convertedTemperature = (temperature - 32) * 5 / 9;  //converted Fahrenheit to Celsius
			convertedUnit = "Celsius";
			if (convertedTemperature < 0) {
				weatherDescription = "Cold";
			}
			else if (convertedTemperature >= 0 && convertedTemperature <= 20) {
				weatherDescription = "Moderate";
			}
			else if (convertedTemperature >= 20) {
				weatherDescription = "Warm";
			}
			//repot output
			report = "Input Temperature: "+ temperature+" Fahrenheit" + "\nConverted Temperature: "+ convertedTemperature +" "+ convertedUnit+
					"\nWeather Description: "+ weatherDescription;
		break;
		case "celsius":	//Celsius case 
			convertedTemperature = (temperature * 9 / 5) + 32; //converted Celsius to Fahrenheit
			convertedUnit = "Fahrenheit";
			if (convertedTemperature < 32) {
				weatherDescription = "Cold";
			}
			else if (convertedTemperature >= 32 && convertedTemperature <= 68) {
				weatherDescription = "Moderate";
			}
			else if (convertedTemperature >= 68) {
				weatherDescription = "Warm";
			}
			//repot output
			report = "Input Temperature: "+ temperature+" Celsius" + "\nConverted Temperature: "+ convertedTemperature+" "+convertedUnit+
					"\nWeather Description: "+ weatherDescription;
		break;
		default:
			report = "Invalid temperature unit";
		}
		// Check the unit of input temperature
		 // Convert Fahrenheit to Celsius
		// Determine the weather description based on the converted temperature
		// handle Invalid unit, output an error message	    
	    // return the results
		return report;
		}
	}

//•	If the temperature is below 32°F (0°C), it's considered "Cold."
//•	If the temperature is between 32°F (0°C) and 68°F (20°C), it's considered "Moderate."
//•	If the temperature is above 68°F (20°C), it's considered "Warm."
//o	// Convert Celsius to Fahrenheit
//o	            convertedFahrenheitTemperature = (temperature * 9 / 5) + 32
//o	// Convert Fahrenheit to Celsius
//o	            convertedCelsiusTemperature = (temperature - 32) * 5 / 9


