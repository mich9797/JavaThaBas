public class Beer {
    public static void main(String[] args) {
      int Beer = 99;
      String word = "bottles";
      
      while (Beer > 0) {

        if (Beer == 1) {
            word = "bottle";
        }
        else if (Beer > 1) {
            word = "bottles";
        }
        else if (Beer < 0)
            word ="nope";
        System.out.println("There are " + word + " in the fridge");
        System.out.println(Beer + " " + word + " of beer");
        Beer = Beer -1;
      }
        System.out.println("There aro no more beers in the fridge");
    }
}
