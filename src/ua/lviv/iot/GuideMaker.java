package ua.lviv.iot;

public class GuideMaker {

    public static void main(String[] args) {
        final int OBJECT_ARRAY_CAPACITY = 4;

        //Defining the objects due to all 3 constructors
        Guide tripToRomania = new Guide();
        Guide tripToMoldova = new Guide("Moldova", 6, 20, 50);
        Guide tripToFrance = new Guide("France", 14, 19999.99, 25, "Le Croissant - Explore your France!","Georghe Avramescu","Mercedes Sprinter Comfort");
        //Output of the information to console
        tripToRomania.toString();
        tripToMoldova.toString();
        tripToFrance.toString();
        //Output of the static field
        Guide.printStaticInsuranceCostPerDayInEuros();
        tripToFrance.printInsuranceCostPerDayInEuros();
        //Initializing 4 More objects
        int iterationNumber = 0;
        Guide[] arrayOfTours = new Guide[OBJECT_ARRAY_CAPACITY];
        do{
            arrayOfTours[iterationNumber] = new Guide();
            iterationNumber += 1;
        } while(iterationNumber < 4);
        //The usage of foreach construction
        for (Guide tour : arrayOfTours){
            tour.toString();
        }

    }
}
