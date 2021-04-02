import java.util.Scanner; 

public class Height
{
    //declare instance variables
    double centimeters; 
    double inches; 
    double enteredHeight;

    public String centimeterConversion(double enteredHeight){
        enteredHeight = this.enteredHeight;
        inches = enteredHeight / 2.54;
        return "You have entered the height: " + enteredHeight + "cm \nThis converts to: \n" + inches + " inches";
    }

    public String inchesConversion(double enteredHeight){
        enteredHeight = this.enteredHeight;
        centimeters = enteredHeight * 2.54;
        return "You have entered the height: " + enteredHeight + "inches \nThis converts to: \n" + centimeters + " cm";
    }

    public void heightConversion() {
        // declare instance variables 
        boolean invalidScale = false; 
        String enteredScale; 

        // Create a Scanner object
        Scanner heightInput = new Scanner(System.in); 

        do {
            //Request user input to define scale
            System.out.println("Please enter your desired measurement scale by typing cm for centimeters or in for inches: ");

            //Read user input for scale
            enteredScale = heightInput.nextLine();

            if(enteredScale.equals("cm")) {
                invalidScale = false;
                enteredScale = "cm";
            } else if (enteredScale.equals("in")) {
                invalidScale = false;
                enteredScale = "inches";
            } else { 
                invalidScale = true;
                System.out.println("Sorry, we can't read your input \""+ enteredScale +"\". Please try again.");
            }     

        } while (invalidScale == true ); 

        //Request user input to declare temperature
        System.out.println("You have selected the scale " + enteredScale + ". Please enter the height you wish to convert: ");

        //Read user input for temperature 
        enteredHeight = heightInput.nextDouble();

        //Return user input of scale, weight and conversion

        if(enteredScale.equals("cm")) {
            System.out.println(this.centimeterConversion(this.enteredHeight));
        } else if (enteredScale.equals("in")) {
            System.out.println(this.inchesConversion(this.enteredHeight));
        }
    }
}

