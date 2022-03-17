package tddClass;

public class Television {

    private boolean ison;
    private String name;
    private String colour;
    private int volume;
    private int limit;


    public void setOn() {
        if (ison== false) {
            this.ison = true;
        } else if (ison == true) {
            this.ison = false;
        }

    }

    public boolean getIsOn() {
        return ison;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getName() {return name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {return colour;
    }

    public void setVolume() {
        this.volume = volume + 1;
    }

    public int getVolume() {return volume;
    }

    public void decreasedvolume() {
        this.volume = volume -1;
    }

    //public void setlimit() {//
        this.limit =  15;
    }//

   // public void setlimit() {return limit;//
    //}//

    //public void ChangeChanell() {//
    //}//
//}//