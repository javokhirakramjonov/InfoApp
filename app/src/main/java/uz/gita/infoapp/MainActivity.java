package uz.gita.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Data data;
    private LinearLayout items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = Data.getInstance(this);
        items = findViewById(R.id.items);

        for(int i = 0; i < items.getChildCount(); ++ i) {
            LinearLayout temp = (LinearLayout) items.getChildAt(i);
            temp.setTag(i);
            for(int j = 0; j < temp.getChildCount(); ++ j) {
                Log.d("TTT", String.valueOf(("i: " + i) + (" j: " + j)));
                temp.getChildAt(j).setTag(i);
                temp.getChildAt(j).setOnClickListener(view -> {
                    goDataWith((Integer) view.getTag());
                });
            }
        }
    }

    public void goDataWith(int index) {
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("data", index);
        startActivity(intent);
        finish();
    }
}