import java.util.Optional;

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

    public Optional<Integer> playClawMachine(){
        do {
            moveClawAtMaxButton(this.b);
            if (prizeNotReachedYet()) {
                do{
                    moveClawAtMaxButton(this.a);
                    if (prizeNotReachedYet()) {
                        if (this.a.getMax() == 100){
                            return Optional.empty();
                        }
                        break;
                    } else if(winPrize()) {
                        return Optional.of(this.b.getMax() + this.a.getMax() * 3);
                    }
                    moveBackClaw(this.a);
                    this.a.decrMax();
                }while (this.a.getMax() > 1);
            } else if (winPrize()) {
                return Optional.of(this.b.getMax());
            }
            this.a.setMax(100);
            this.b.decrMax();
            resetClaw();
        }while(this.b.getMax() > 1);
        return Optional.empty();
    }

    public void moveClawAtMaxButton(Button button){
        this.claw.setX(this.claw.getX() + button.buttonAtMax().getX());
        this.claw.setY(this.claw.getY() + button.buttonAtMax().getY());
    }

    public void moveBackClaw(Button button){
        this.claw.setX(this.claw.getX() - button.buttonAtMax().getX());
        this.claw.setY(this.claw.getY() - button.buttonAtMax().getY());
    }

    public void resetClaw(){
        this.claw.setX(0);
        this.claw.setY(0);
    }

    public boolean winPrize(){
        return (this.claw.getX() == this.prize.getX() && this.claw.getY() == this.prize.getY());
    }

    public boolean prizeNotReachedYet(){
       return (this.claw.getX() < this.prize.getX() && this.claw.getY() < this.prize.getY());
    }


}
