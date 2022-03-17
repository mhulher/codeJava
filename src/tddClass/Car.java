package tddClass;

public class Car {
    private String name;
    private String color;
    private int tyres;

    public Car(String name, String color, int tyres) {
        this.name = name;
        this.color = color;
        this.tyres = tyres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }
}
