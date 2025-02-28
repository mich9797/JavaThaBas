package Michele.ADogExample;

class Dog{
    String name;
    public static void main(String[] args) {
        Dog dog1 = new Dog();   //abbiamo fatto oggetto di classe cane
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name ="Fred";
        myDogs[1].name = "Marge";

        System.out.println("last dog name is " + myDogs[2].name);

        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name + " dice bau");
    }
}
