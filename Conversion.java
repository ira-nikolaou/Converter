import java.util.Scanner;

public class Conversion
{
    public void space(){
        System.out.println();
        System.out.println("_____________________________");
        System.out.println();
    }

    public void Conversion()
    {
        boolean invalidScale = false; 
        boolean invalidDecision = false; 
        boolean goAgain = false;
        String enteredDecision;
        String selectedConversion; 

        do {
            do {
                // Create a Scanner object
                Scanner conversionInput = new Scanner(System.in); 

                //Request user input to define scale
                System.out.println("Welcome! Please select the type of value you wish to convert by typing: ");
                System.out.println("w for Weight (supported scales: kg, lbs)");
                System.out.println("h for Height (supported scales: cm, inches)");
                System.out.println("t for Temperature (supported scales: Celcius, Fahrenheit, Kelvin)");

                //Read user input for scale
                selectedConversion = conversionInput.nextLine();

                if(selectedConversion.equals("w")) {
                    invalidScale = false;
                    selectedConversion = "Weight";
                    this.space();
                    System.out.println("You have selected to convert " + selectedConversion);
                    Weight wConversion = new Weight(); 
                    wConversion.weightConversion();
                } else if (selectedConversion.equals("h")) {
                    invalidScale = false;
                    selectedConversion = "Height";
                    this.space();
                    System.out.println("You have selected to convert " + selectedConversion);
                    Height hConversion = new Height();
                    hConversion.heightConversion();
                } else if (selectedConversion.equals("t")) {
                    invalidScale = false;
                    selectedConversion = "Temperature"; 
                    this.space();
                    System.out.println("You have selected to convert " + selectedConversion);
                    Temp tConversion = new Temp();
                    tConversion.tempConversion();
                } else { 
                    invalidScale = true;
                    this.space();
                    System.out.println("The letter \""+ selectedConversion +"\" you have entered is invalid. Please try again.");
                    this.space();
                }     

            } while (invalidScale == true ); 

            do{
                //Request user input to declare temperature
                this.space();
                System.out.println("Would you like to convert another value? Select your option by typing:");
                System.out.println("y for yes");
                System.out.println("n for no - please note this will terminate the programm");

                // Create a Scanner object
                Scanner decisionInput = new Scanner(System.in); 

                //Read user input for temperature 
                enteredDecision = decisionInput.nextLine();

                //Return user input of scale, temperature and conversion

                if(enteredDecision.equals("y")) {
                    goAgain = true;
                    invalidDecision = false; 
                    this.space();
                } else if (enteredDecision.equals("n")) {
                    goAgain = false;
                    invalidDecision = false; 
                    System.out.println("Thank you! Bye!");
                } else {
                    invalidDecision = true;
                    System.out.println("The value \""+ enteredDecision +"\" you have entered is invalid. Please try again.");
                } 
            }while (invalidDecision == true);
        } while (goAgain == true);
    }

}
