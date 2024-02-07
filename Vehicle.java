public class Vehicle {

    private int doors;
    private int wheels;
    private String color;


    public String toString(){
        String description = "This vehicle has \n" + doors + " doors\n" +
                wheels + " wheels \n" + "and color is " + color;


        return description;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
