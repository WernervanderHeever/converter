import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {
	public double value;
	public String choice;
	
	public Converter(double value){
		this.value = value;
	}
	
	//setter
	public void setValue(double value) {
		this.value = value;
	}
	
	//getter
	public double getValue() {return value;}
	
	//convert kelvin to celsius 
	public double kelvin2Celsius(double value) {
		
		double result = 0;
		result = value + 273.15;
		return result;
	}
	
	//convert pounds to kilograms
	public double pounds2kilograms(double value) {
		double result = 0;
		result = value / 2.205;
		return result;
	}
	
	//convert miles to kilometers
	public double miles2kilometers(double value) {
		double result;
		result = value * 1.609;
		return result;
	}
	
	//Check if String is a single Char (a,b,c)
	public String checkIfSingleChar(String choice) {
		if (choice.matches("[a-c]{1}")) {
			choice = checkChar(choice);
			return choice;
		}
		else {
			System.out.println("**Please Enter a valid option (a, b, c).**");
			//System.out.println("1 choice is " + choice);
			return "";
		}	
	}
	
	public String checkChar(String choice)
	{
		if(choice.matches("[a-c]{1}") )
		{
			return choice;
		}
		else {
			System.out.println("**Please Enter a valid option (a, b, c).**");
			//System.out.println("2 choice is " + choice);
			choice = "";
		}
		return choice;
	}
	
	//get value from user input
	public double getConValue() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String conValue = reader.readLine();
			try
			{
			  value = Double.parseDouble(conValue);
			}
			catch(NumberFormatException e)
			{
				//not a double
				System.err.println("Error with input, try again.");
			}
		}
		catch( IOException ioException )
		{
			System.err.println("Error with input");
		}
		return value;
	}
	
	public double conversion(String choice) {
		double result = 0;
		switch(choice) {
		case "a":
			System.out.println("Enter a kelvin value to convert to Celius:");
			value = getConValue();
			result = kelvin2Celsius(value);
			System.out.println("The conversion from kelvin to Celsius is: " + result);
			break;
		case "b":
			System.out.println("Enter a value in pounds to convert to kilograms:");
			value = getConValue();
			result = pounds2kilograms(value);
			System.out.println("The conversion from pounds to kilograms is: " + result);
			break;
		case "c":
			System.out.println("Enter a value in miles to convert to kilometers:");
			value = getConValue();
			result = miles2kilometers(value);
			System.out.println("The conversion from miles to kilometers is: " + result);
			break;
		}
		return value;
	}
	
}
