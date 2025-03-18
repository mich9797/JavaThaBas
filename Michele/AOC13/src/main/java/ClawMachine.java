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

    public int play(){
        do {
            moveClawAtMax(this.b);
            if (prizeNotReached()) {
                do{
                    moveClawAtMax(this.a);
                    if (this.a.getMax() == 100 && prizeNotReached()) {
                        return 0;
                    } else if(winPrize()) {
                        return (this.b.getMax() + this.a.getMax() * 3);
                    }
                    moveBackClaw(this.a);
                    this.a.decrMax();
                }while (this.a.getMax() > 1);
            } else if (winPrize()) {
                return this.b.getMax();
            }
            this.a.setMax(100);
            this.b.decrMax();
            resetClaw();
        }while(this.b.getMax() > 1);
        return 0;
    }

    public void moveClawAtMax(Button button){
        this.claw.setX(this.claw.getX() + (button.getCoordinates().getX() * button.getMax()));
        this.claw.setY(this.claw.getY() + (button.getCoordinates().getY() * button.getMax()));
    }

    public void moveBackClaw(Button button){
        this.claw.setX(this.claw.getX() - (button.getCoordinates().getX() * button.getMax()));
        this.claw.setY(this.claw.getY() - (button.getCoordinates().getY() * button.getMax()));
    }

    public void resetClaw(){
        this.claw.setX(0);
        this.claw.setY(0);
    }

    public boolean winPrize(){
        return (this.claw.getX() == this.prize.getX() && this.claw.getY() == this.prize.getY());
    }

    public boolean prizeNotReached(){
       return (this.claw.getX() < this.prize.getX() && this.claw.getY() < this.prize.getY());
    }

}
