package tddClass.airCondition;

public class AirCondition {

    private String color;
    private String name;
    private int temperature;
    private boolean isOn;

    public void setName(String acName) {
        this.name = acName;
    }

    public String getName() {
        return name;
    }

    public void setColour(String acColor) {
        this.color = acColor;
    }

    public String getColour() {
        return color;
    }

    public void setTemperature(int acTemperature) {
        this.temperature = acTemperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void powerOnOff() {
        if(isOn == false){
            isOn = true;
        }else if(isOn == true){
            isOn = false;
        }
    }

    public boolean getPowerOnOff() {
        return isOn;
    }

    public void increaseTemperature() {
        temperature = temperature +  1;
    }


    public void DecreasedTemperature() {
        temperature = temperature - 1;
    }


    public void SetName(String acName) {
        this.name = acName;
    }
}
