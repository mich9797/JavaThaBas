package EserciziOnline.Variabili.W3Resource.OOP.Object_Oriented_Programming.Exercise_8;

public class TrafficLights {

    private String color;
    private int duration;

    public TrafficLights(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public  boolean isGreen() {
        return color.equals("green");
    }

    public boolean isRed() {
        return  color.equals("red");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
