package th.ac.kmutnb.satayu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Page2 extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    private List<Data> data = new ArrayList<>();
    private static final String TAG = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Data item = new Data("นก", "300.50 B", R.drawable.m1);
        data.add(item);
        data.add(new Data("รถยนต์", "150,000 B", R.drawable.i2));
        data.add(new Data("จรวด", "200 B", R.drawable.i3));
        data.add(new Data("เสือ", "30,000 B", R.drawable.m2));
        data.add(new Data("ปืน", "3,000 B",  R.drawable.i5));
        data.add(new Data("หนังสือ", "100 B",  R.drawable.i6));
        data.add(new Data("แมว", "700 B",  R.drawable.i7));
        data.add(new Data("สุนัข", "600 B",  R.drawable.i8));
        data.add(new Data("ของขวัญ", "250 B",  R.drawable.m3));
        data.add(new Data("ต้นไม้", "80 B",  R.drawable.m4));
        data.add(new Data("เพนกวิ้น", "1,400 B",  R.drawable.m5));
        data.add(new Data("สล็อต", "3,200 B",  R.drawable.m7));
        data.add(new Data("ตุ๊กตา", "790 B",  R.drawable.m8));
        data.add(new Data("ตุ๊กตากระโหลก", "600 B",  R.drawable.m9));


        ListView lv = findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(this, data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent itn = new Intent(this, Page3.class);
        itn.putExtra("id", i + 1);
        itn.putExtra("da", data.get(i).getMtext1());
        itn.putExtra("p", data.get(i).getMtext2());
        Log.i(TAG, String.valueOf(i));
        Toast.makeText(this, String.valueOf(i) + " ", Toast.LENGTH_SHORT).show();
        startActivity(itn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);//โหลดจากxml
        // menu.add(0,0,0,"List");
        // menu.add(0,1,1,"help");
        //menu.add(0,2,2,"Save");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            // case 0:
            case R.id.Menu1_P3:
                Toast.makeText(this, "Buy_Page", Toast.LENGTH_LONG).show();
                Intent itn = new Intent(this, MainActivity.class);
                startActivity(itn);
                return true;
            //case 1:
            case R.id.Menu2_P3:
                Toast.makeText(this, "Go_Home_Page", Toast.LENGTH_LONG).show();
                Intent itn2 = new Intent(this, Page2.class);
                startActivity(itn2);
                return true;
            //case 2:
            case R.id.Menu3_P3:
                Toast.makeText(this, "Back_Page", Toast.LENGTH_LONG).show();

                doSave();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void doSave() {
        Toast.makeText(this, "sel0", Toast.LENGTH_LONG).show();
        Intent itn = new Intent(this, Page3.class);
        startActivity(itn);
    }
}