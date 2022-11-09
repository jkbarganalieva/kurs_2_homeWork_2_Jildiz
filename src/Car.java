public class Car extends Transport {
    private double volume;// объем
    private String transmissionBox;// коробка передачи

    public Car(String model, int year, double volume, String transmissionBox) {
        super(model, year);
        this.volume = volume;
        this.transmissionBox = transmissionBox;
    }

    public double getVolume() {
        return volume;
    }

    public String getTransmissionBox() {
        return transmissionBox;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE97 "+
                " \nМодель: "+ this.getModel() +
                " \nгод выпуска: "+this.getYear()+
                " \nобъем: "+ this.getVolume()+
                " \nкоробка передачи: "+this.getTransmissionBox());
    }
}
