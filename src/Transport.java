public abstract class Transport implements Printable{
    private String model;// модель
    private int year;// год выпуска

       public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


}
