

import java.util.ArrayList;

public class DotCom{
    private String name;
    private ArrayList<String> locationCells;

    public void setName(String newName){
        name = newName;
    }

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    
    public String checkYourself(String userInput){
        String result ="miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("hai affondato " + name + "   : (");
            }else {
                result ="hit";
            }
        }
        return result;
    }
}
