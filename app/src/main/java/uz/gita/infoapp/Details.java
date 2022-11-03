package uz.gita.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Data data = Data.getInstance(this);
        int index = getIntent().getIntExtra("data", 0);
        ((TextView) findViewById(R.id.name)).setText(getResources().getString(data.getName(index)));
        ((ImageView) findViewById(R.id.logo)).setImageDrawable(getResources().getDrawable(data.getImage(index)));
        ((TextView) findViewById(R.id.info)).setText(getResources().getString(data.getInfo(index)));

        findViewById(R.id.back).setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
}