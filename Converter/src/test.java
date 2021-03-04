import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test{ 
	public static void main(String[] args) {
		
		Converter con = new Converter(0);
		String choice = "";
		
		System.out.println("*******JAVA CONVERTER*********");
		System.out.println("Choose an option: ");
		System.out.println("a.) Kelvin to Celsius");
		System.out.println("b.) Pounds to kilograms ");
		System.out.println("c.) Miles to Kilometers");
		System.out.println("**Note: Choose a, b, or c");
		
		try {
			while(choice == "") {
				//get input
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				choice = reader.readLine();		
				con.checkIfSingleChar(choice); //check if value is valid
			}
			con.conversion(choice);
		}
		catch( IOException ioException )
		{
			System.err.println("Error with input");
		}
	}
}