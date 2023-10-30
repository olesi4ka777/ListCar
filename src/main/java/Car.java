import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Car {
    {
        SimpleStringProperty color;
        SimpleStringProperty model;
        SimpleIntegerProperty speed;
    }
 public Car (String model, String color, int speed){
 this.color=color;
 this.model=model;
 this.speed=speed;
 }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }