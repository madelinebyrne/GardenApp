package madelinebyrne.gardenapp;


import android.util.Log;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


/**
 * Created by Madeline Byrne on 6/17/2016.
 */

 public class TAG
{
    //static location instance (gps or image tbd)

    //photo collection instance

    public Integer ID; //auto-generated and unique to every object (used for reference)

    public String CommonName;
    public String Genus;
    public String Species;
    public String Variety;
    public enum  PlantType {Tree, Shrub, Groundcover, Vine}; //etc
    public PlantType thisPlantType;
    public enum PlantSeasonalCharacteristics {Deciduous, Evergreen};
    public PlantSeasonalCharacteristics thisPlantSeasonalCharacteristics;
    public String Description;
    public String CareNotes;

    public enum PlantState {Alive, Dead, Harvested}; //etc


    //-------------------------------------METHODS------------------------------------------------

    //Methods to edit/change state of tag variables based on user input
    public void editCommonName(String userInput)
    {
        CommonName=userInput;
    }

    public void editGenus(String userInput)
    {
        Genus=userInput;
    }

    public void editSpecies (String userInput)
    {
        Species=userInput;
    }

    public void editVariety(String userInput)
    {
        Variety=userInput;
    }

    public void setPlantTypeTree()
    {
        thisPlantType  = PlantType.Tree;
    }

    public void setPlantTypeShrub()
    {
        thisPlantType = PlantType.Shrub;
    }

    public void setPlantTypeGroundcover()
    {
        thisPlantType = PlantType.Groundcover;
    }

    public void setPlantTypeVine()
    {
        thisPlantType = PlantType.Vine;
    }

    public void setPlantSeasonalCharacteristicsDeciduous()
    {
        thisPlantSeasonalCharacteristics = PlantSeasonalCharacteristics.Deciduous;
    }

    public void setPlantSeasonalCharacterisesEvergreen()
    {
        thisPlantSeasonalCharacteristics = PlantSeasonalCharacteristics.Evergreen;
    }

    public void setDescription(String userInput)
    {
        Description=userInput;
    }

    public void setCareNotes(String userInput)
    {
        CareNotes=userInput;
    }

    //generate ID function

    //upload photo function

    //delete photo function

    //set/update location function


    //constructor
    public  TAG()
    {
        //call generate ID function
    }
}
