package Michele.SimpleDotCom;

import Michele.DotCom.GameHelper;

import java.io.*;

public class SimpleDotComTestDrive{
    
    public static void main(String[] args) {
        
        int numOfGuess = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int)(Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("you took " + numOfGuess + " guesses");
            }
        }
    }    
}

class SimpleDotCom{

    int[] locationCellS;
    int numofHits = 0;

    public void setLocationCells(int[] locs){
        locationCellS = locs;
    }

    public String checkYourself(String stringguess){
        int guess = Integer.parseInt(stringguess);
        String result = "miss";

        for (int cell : locationCellS){
            if (guess == cell){
                result = "hit";
                numofHits++;
                break;
            }
        }

        if (numofHits == locationCellS.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}


class GameHelpers {
  public String getUserInput(String prompt) {
     String inputLine = null;
     System.out.print(prompt + " ");
     try {
       BufferedReader is = new BufferedReader(
 new InputStreamReader(System.in));
      inputLine = is.readLine();
      if (inputLine.length() == 0 )  return null; 
    } catch (IOException e) {
      System.out.println("IOException: " + e);
    }
    return inputLine;
 }
}
