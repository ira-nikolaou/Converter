import java.util.Scanner; 

public class Weight
{
    //declare instance variables
    double kilograms; 
    double lbs; 
    double enteredWeight;


    public String kilogramConversion(double enteredWeight){
        enteredWeight = this.enteredWeight;
        lbs = enteredWeight * 2.205;
        return "You have entered the weight: " + enteredWeight + "kg \nThis converts to: \n" + lbs + " lbs";
    }

    public String lbsConversion(double enteredWeight){
        enteredWeight = this.enteredWeight;
        kilograms = enteredWeight / 2.205;
        return "You have entered the weight: " + enteredWeight + "lbs \nThis converts to: \n" + kilograms + " kg";
    }

    public void weightConversion() {
        // declare instance variables 
        boolean invalidScale = false; 
        String enteredScale; 

        // Create a Scanner object
        Scanner weightInput = new Scanner(System.in); 

        do {
            //Request user input to define scale
            System.out.println("Please enter your desired weight scale by typing kg for kilograms or lbs for pounds: ");

            //Read user input for scale
            enteredScale = weightInput.nextLine();

            if(enteredScale.equals("kg")) {
                invalidScale = false;
                enteredScale = "kg";
            } else if (enteredScale.equals("lbs")) {
                invalidScale = false;
                enteredScale = "lbs";
            } else { 
                invalidScale = true;
                System.out.println("Sorry, we can't read your input \""+ enteredScale +"\". Please try again.");
            }     

        } while (invalidScale == true ); 

        //Request user input to declare temperature
        System.out.println("You have selected the scale " + enteredScale + ". Please enter the weight you wish to convert: ");

        //Read user input for temperature 
        enteredWeight = weightInput.nextDouble();

        //Return user input of scale, weight and conversion

        if(enteredScale.equals("kg")) {
            System.out.println(this.kilogramConversion(this.enteredWeight));
        } else if (enteredScale.equals("lbs")) {
            System.out.println(this.lbsConversion(this.enteredWeight));
        }
    }
}

