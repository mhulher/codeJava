package tddClass;

public class Laptop {
    private String name;
    private String color;
    private boolean power;

    public void setName(String laptopName) {
        this.name = laptopName;
    }

    public String getName() {
        return name;
    }

    public void setColor(String laptopColor) {
        this.color = laptopColor;
    }

    public String getColor() {
        return color;
    }

    public void switchPower() {
        if(power == false){
            power = true;
        }else if(power == true){
            power = false;
        }
    }

    public boolean getPower() {
    return power;
    }
}
