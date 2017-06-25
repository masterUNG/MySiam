package appewtc.masterung.mysiam;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

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

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("Name", strings[0])
                    .add("Lat", strings[1])
                    .add("Lng", strings[2])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[3]).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();
            return response.body().string();

        } catch (Exception e) {
            Log.d("SiamV3", "e doin ==> " + e.toString());
            return null;
        }


    }
}   // Main Class
