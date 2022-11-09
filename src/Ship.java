public class Ship extends Transport{
        private double shipsHeight;//высота борта корабля

    public Ship(String model, int year, double shipsHeight) {
        super(model, year);
        this.shipsHeight = shipsHeight;
    }

    public double getShipsHeight() {
        return shipsHeight;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDEA2"+
                " \nМодель: "+ this.getModel() +
                " \nгод выпуска: "+this.getYear()+
                " \nвысота борта корабля: "+ this.shipsHeight);
    }

}
