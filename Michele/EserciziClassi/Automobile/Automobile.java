package Automobile;

public class Automobile {
    private double consumo;
    private double serbatoio;

    public double getConsumo() {
        return consumo;
    }

    public double getSerbatoio() {
        return serbatoio;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void faiRifornimento(double carburante) {
        this.serbatoio += carburante;
    }

    public Automobile(double consumo) {
        this.consumo = consumo;
        this.serbatoio = 0;
    }

    public void drive(int kilometri){
        double maxKilometri = this.serbatoio * this.consumo;
        if(kilometri > maxKilometri){
            System.out.println("Con altri " + kilometri + " non arriveresti alla fine");
        }else {
            this.serbatoio -= (kilometri/consumo);
        }
    }

    public static void  main(String[] args){
        Automobile auto = new Automobile(12);
        auto.faiRifornimento(50);
        System.out.println("serbatoio auto: " + auto.getSerbatoio() + " litri");

        auto.drive(450);
        System.out.println("serbatoio auto: " + auto.getSerbatoio() + " litri");

        auto.drive(300);
    }
}


