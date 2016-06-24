package madelinebyrne.gardenapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Madeline Byrne on 6/23/2016.
 */

public class TAGCOLLECTION
{
    public List<TAG> tagList = new ArrayList<TAG>();

    public void addTag(TAG foo)
    {
        tagList.add(foo);
    }

    public List<TAG> searchCommonName(String searchInput)
    {
       List<TAG> searchResults = new ArrayList<TAG>();
        for(int i=0; i<=tagList.size();i++)
        {
            if (tagList.get(i).CommonName == searchInput) {
                searchResults.add(tagList.get(i));
            }
        }
        return searchResults;
    }
}
