package madelinebyrne.gardenapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.List;


public class MainActivityTest extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public TAGCOLLECTION testTagCollection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        testTagCollection.searchCommonName("daisy");

    }

    public TAG testTag;

    EditText editTextInput;
    public void inputUser(View view)
    {
       Log.d("inputUser", "entered");
        editTextInput = (EditText) findViewById(R.id.editText);
        String test = editTextInput.getText().toString();
        Log.d("common name", test);
        //testTag.setCommonName(test); // THIS LINE THROWS ERROR AND CAUSES APP TO CRASH (also code below throws errors)

        //EditText editTextInputG = (EditText) findViewById(R.id.editText2);
       // String GenusInput = editTextInputG.getText().toString();
       // testTag.setGenus(GenusInput);
//
      //  EditText editTextInputS = (EditText) findViewById(R.id.editText3);
      //  String SpeciesInput = editTextInputS.getText().toString();
      //  testTag.setSpecies(SpeciesInput);
       // testTagCollection.addTag(testTag);

      //Log.d("testTag common name", testTagCollection.tagList.get(0).CommonName);
      //  Log.d("testTag genus", testTagCollection.tagList.get(0).Genus);
      //  Log.d("testTag species", testTagCollection.tagList.get(0).Species);
       // String seasonalPlantC= testTagCollection.tagList.get(0).thisPlantSeasonalCharacteristics.toString();
       // Log.d("testTag SPC", seasonalPlantC);
    }

    public void evergreenClick()
    {
        testTag.setPlantSeasonalCharacterisesEvergreen();
    }
    public void deciduousClick()
    {
        testTag.setPlantSeasonalCharacteristicsDeciduous();
    }
}
