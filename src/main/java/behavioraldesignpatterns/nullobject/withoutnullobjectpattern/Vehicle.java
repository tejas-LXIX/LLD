package behavioraldesignpatterns.nullobject.withoutnullobjectpattern;

class Vehicle {
    private int seats;
    private int fuel;

    public Vehicle(int seats, int fuel) {
        this.seats = seats;
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}