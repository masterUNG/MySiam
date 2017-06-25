package appewtc.masterung.mysiam;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by masterUNG on 6/25/2017 AD.
 */

public class AddAndEditLocation extends AsyncTask<String, Void, String>{

    private Context context;

    public AddAndEditLocation(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        try {

        } catch (Exception e) {
            Log.d("SiamV3", "e doin ==> " + e.toString());
        }

        return null;
    }
}   // Main Class
