package rafihanif.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE_nama = "rafihanif.registration.extra.MESSAGE";
    public static final String EXTRA_MESSAGE_alamat = "rafihanif.registration.extra.MESSAGE";
    public static final String EXTRA_MESSAGE_nohp = "rafihanif.registration.extra.MESSAGE";
    private EditText mMessageEditText_name;
    private EditText mMessageEditText_alamat;
    private EditText mMessageEditText_nohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText_name = (EditText) findViewById(R.id.nama);
        mMessageEditText_alamat = (EditText) findViewById(R.id.alamat);
        mMessageEditText_nohp = (EditText) findViewById(R.id.nohp);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
        String message_name = mMessageEditText_name.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_nama, message_name);
        String message_alamat = mMessageEditText_alamat.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_alamat, message_alamat);
        String message_nohp = mMessageEditText_nohp.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_nohp, message_nohp);

    }
}
