public class Plane extends Transport{

    private double emptyWeight; // масса пустого самолета
    private double passengerCapacity;// пасажировместимость


    public Plane(String model, int year, double emptyWeight, double passengerCapacity) {
        super(model, year);
        this.emptyWeight = emptyWeight;
        this.passengerCapacity = passengerCapacity;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void draw() {
        System.out.println("✈️"+
                " \nМодель: "+ this.getModel() +
                " \nгод выпуска: "+this.getYear()+
                " \nмасса пустого самолета: "+ this.getEmptyWeight()+
                " \nпасажировместимость: "+this.getPassengerCapacity());
    }


}
