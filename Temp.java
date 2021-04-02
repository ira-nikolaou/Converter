import java.util.Scanner; 

public class Temp
{
    //Declare instance variables
    double celcius; 
    double fahrenheit; 
    double kelvin; 
    double enteredTemperature;

    //Method to convert Fahrenheit to Celcius and Kelvin, requires temperature value 
    public String fahrenheitConversion(double enteredTemperature){
        celcius = (enteredTemperature - 32) * 5/9;
        kelvin = (enteredTemperature - 32) * 5/9 + 273.15;
        return "Your current temperature is " + enteredTemperature + "°F \nThis converts to: \n" + kelvin + " °K \n" + celcius + " °C";
    }

    //Method to convert Celcius to Fahreneheit and Kelvin, requires temperature value 
    public String celciusConversion(double enteredTemperature){
        fahrenheit = (enteredTemperature * 9/5) + 32;
        kelvin = enteredTemperature + 273.15;
        return "Your current temperature is " + enteredTemperature + "°C \nThis converts to: \n" + kelvin + " °K \n" + fahrenheit + " °F";
    }

    //Method to convert Kelvin to Fahreneheit and Celcius, requires temperature value 
    public String kelvinConversion(double enteredTemperature){
        fahrenheit = (enteredTemperature - 273.15) * 9/5 + 32;
        celcius = enteredTemperature - 273.15;
        return "Your current temperature is " + enteredTemperature + "°K \nThis converts to: \n" + celcius + " °C \n" + fahrenheit + " °F";
    }

    public void tempConversion() {
        // declare instance variables 
        boolean invalidScale = false; 
        String enteredScale; 

        // Create a Scanner object
        Scanner temperatureInput = new Scanner(System.in); 

        do {
            //Request user input to define scale
            System.out.println("Please select your temperature scale by typing c for celcius, f for fahrenheit, or k for kelvin: ");

            //Read user input for scale
            enteredScale = temperatureInput.nextLine();

            //Define entered scale based on user input
            if(enteredScale.equals("c")) {
                invalidScale = false;
                enteredScale = "°C";
            } else if (enteredScale.equals("f")) {
                invalidScale = false;
                enteredScale = "°F";
            } else if (enteredScale.equals("k")) {
                invalidScale = false;
                enteredScale = "°K"; 
            } else { 
                invalidScale = true;
                System.out.println("The letter \""+ enteredScale +"\" you have entered is invalid. Please try again.");
            }     
            
            //do while loop ends when a valid scale input has been entered
        } while (invalidScale == true ); 

        //Request user input to declare temperature
        System.out.println("You have selected the scale " + enteredScale + ". Please enter the temperature you wish to convert: ");

        //Read user input for temperature 
        enteredTemperature = temperatureInput.nextDouble();

        //Return user input of scale, temperature and conversion

        if(enteredScale.equals("°C")) {
            System.out.println(this.celciusConversion(this.enteredTemperature));
        } else if (enteredScale.equals("°F")) {
            System.out.println(this.fahrenheitConversion(this.enteredTemperature));
        } else if (enteredScale.equals("°K")) {
            System.out.println(this.kelvinConversion(this.enteredTemperature));
        }
    }
}

