package ua.lviv.iot;

public class Guide {

    private String state;
    private int durationInDays;
    private double priceInEuros;
    private int capacityInSeats;
    private String guideName;

    private static double insuranceCostPerDayInEuros = 1.45;

    protected String driverName;
    protected String busModel;

    public Guide(String state, int durationInDays, double priceInEuros, int capacityInSeats, String guideName, String driverName, String busModel) {
        this.state = state;
        this.durationInDays = durationInDays;
        this.priceInEuros = priceInEuros;
        this.capacityInSeats = capacityInSeats;
        this.guideName = guideName;
        this.driverName = driverName;
        this.busModel = busModel;
    }

    public Guide(){
        this("Romania", 4, 550, 6, "Mysterious Transylvania", "Ion Popescu", "Dacia KUMO");
    }

    public Guide(String state, int durationInDays, double priceInEuros, int capacityInSeats) {
        this(state, durationInDays, priceInEuros, capacityInSeats, "Amazing " + state, "Mircea Valcea", "Mercedes Benz Sprinter 600");
    }

    @Override
        public String toString(){
            String information = this.guideName + '\n' +
                               "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" + '\n' +
            "Duration: " + this.durationInDays + " days;" + '\n' +
            "Price: " + this.priceInEuros + " Euro" + '\n' +
            "Country: " + this.state + '\n' +
            "INFORMATION ABOUT THE TOUR DETAILS" + '\n' +
            "Insurance costs " + this.durationInDays * insuranceCostPerDayInEuros + " Euro" + '\n' +
            "Your driver " + this.driverName + " will be driving " + this.busModel;
            System.out.println("|/////////////////////INFORMATION ABOUT YOUR TOUR///////////////////////////|");
            System.out.println(information);
            System.out.println("|///////////////////////////////////////////////////////////////////////////|");
            System.out.println();
            return information;
        }

    public static void printStaticInsuranceCostPerDayInEuros(){
        System.out.println("Static price of insurance per one day is " + insuranceCostPerDayInEuros + " Euro");
    }

    public static void printInsuranceCostPerDayInEuros(){
        System.out.println("The price of insurance per one day is " + insuranceCostPerDayInEuros + " Euro" + '\n');
    }

    public void resetValues(String state, int durationInDays, double priceInEuros, int capacityInSeats, String guideName, String driverName, String busModel) {
        this.state = state;
        this.durationInDays = durationInDays;
        this.priceInEuros = priceInEuros;
        this.capacityInSeats = capacityInSeats;
        this.guideName = guideName;
        this.driverName = driverName;
        this.busModel = busModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public double getPriceInEuros() {
        return priceInEuros;
    }

    public void setPriceInEuros(double priceInEuros) {
        this.priceInEuros = priceInEuros;
    }

    public int getCapacityInSeats() {
        return capacityInSeats;
    }

    public void setCapacityInSeats(int capacityInSeats) {
        this.capacityInSeats = capacityInSeats;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }


}
