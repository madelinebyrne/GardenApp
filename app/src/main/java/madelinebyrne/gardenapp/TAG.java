package madelinebyrne.gardenapp;


import android.util.Log;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Madeline Byrne on 6/17/2016.
 */

 public class TAG
{
    //location coordinates (gps or image tbd)

    public Integer ID; //auto-generated and unique to every object (used for reference)

    //public  List fieldsList = new ArrayList() {}; //FIELD objects

    //public CommonNameFIELD CommonName;
    //-------------------------------------METHODS------------------------------------------------



    //create or edit a common name field (add user input)
    public void editCommonName(String userCommonNameFieldInput)
    {
       // if (CommonName==null)
        {
            //create instance of CommonNameField and assign CommonName.fieldContent to user input
       //     CommonName = new CommonNameFIELD(userCommonNameFieldInput);
            Log.d("creating", "CommonName.fieldContent");
        }
       // else
        {
            //updating CommonName.fieldContent with new user input
         //   CommonName.fieldContent=userCommonNameFieldInput;
            Log.d("editing", "CommonName.fieldContent");
        }
    }

    //constructor
    public  TAG(String userCommonNameFieldInput)
    {
        //generate garden tag ID

        //record tag location

        //initialize with ONE important field (tbd)
        editCommonName(userCommonNameFieldInput);
    }

}
