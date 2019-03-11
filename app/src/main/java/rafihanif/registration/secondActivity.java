package rafihanif.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message_nama = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_nama);
        TextView textView_nama = (TextView) findViewById(R.id.nama_message);
        textView_nama.setText(message_nama);
        String message_alamat = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_alamat);
        TextView textView_alamat = (TextView) findViewById(R.id.alamat_message);
        textView_alamat.setText(message_alamat);
        String message_nohp = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_nohp);
        TextView textView_nohp = (TextView) findViewById(R.id.nohp_message);
        textView_nohp.setText(message_nohp);
    }
}
