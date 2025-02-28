package Operazioni;

public class Operazioni {
    private int num1;
    private int num2;

    public Operazioni(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

class opera{
    public static void main(String[] args){
        Operazioni op = new Operazioni(1,2);
        System.out.println(op.getNum2());
        System.out.println(op.getNum1());
    }
}
