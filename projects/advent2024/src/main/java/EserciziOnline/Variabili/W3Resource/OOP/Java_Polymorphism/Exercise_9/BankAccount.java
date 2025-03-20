package EserciziOnline.Variabili.W3Resource.OOP.Java_Polymorphism.Exercise_9;

public class BankAccount {

   private double bilancio;


   public BankAccount(double bilancioIniziale) {
       this.bilancio = bilancio;
   }

    public double getBilancio() {
        return bilancio;
    }

    public void deposito(double quantita){
       bilancio += quantita;

    }

    public void ritiroSoldi (double quantita) {
       if (quantita <= bilancio) {
           bilancio -= quantita;
       } else {
           System.out.println("Fondi insufficienti poraccio");
       }
    }
}
