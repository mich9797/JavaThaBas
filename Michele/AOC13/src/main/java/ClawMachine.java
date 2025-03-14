
public class ClawMachine {
    private final Button a;
    private final Button b;
    private final Coordinates prize;
    private Coordinates claw;

    public ClawMachine(Button a, Button b, Coordinates prize) {
        this.a = a;
        this.b = b;
        this.prize = prize;
        this.claw = new Coordinates(0,0);
    }

    public Button getA() {
        return a;
    }

    public Button getB() {
        return b;
    }

    public Coordinates getPrize() {
        return prize;
    }

    public Coordinates getClaw() {
        return claw;
    }

    public void moveClaw(Button button){
        this.claw.setX(this.claw.getX() + button.getCoordinates().getX());
        this.claw.setY(this.claw.getY() + button.getCoordinates().getY());
    }

    public void resetClaw(){
        this.claw.setX(0);
        this.claw.setY(0);
    }

}
