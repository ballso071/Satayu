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
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class cart extends AppCompatActivity  implements AdapterView.OnItemClickListener{
    private List<Data> data = new ArrayList<>();
    private static final String TAG = "TEST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        data.add(new Data("รถยนต์", "150,000 B", R.drawable.i2));
        data.add(new Data("จรวด", "200 B", R.drawable.i3));
        data.add(new Data("เสือ", "30,000 B", R.drawable.m2));
        data.add(new Data("ปืน", "3,000 B",  R.drawable.i5));



        ListView lv = findViewById(R.id.show_item);
        MyAdapter2 adapter = new MyAdapter2(this, data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Intent itn = new Intent(this, Page3.class);
       // itn.putExtra("id", i + 1);
        //itn.putExtra("da", data.get(i).getMtext1());
        //itn.putExtra("p", data.get(i).getMtext2());
        Log.i(TAG, String.valueOf(i));
        Toast.makeText(this, String.valueOf(i) + " ", Toast.LENGTH_SHORT).show();
       // startActivity(itn);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.cart,menu);//โหลดจากxml
        // menu.add(0,0,0,"List");
        // menu.add(0,1,1,"help");
        //menu.add(0,2,2,"Save");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            // case 0:
            case R.id.Menu1_p2:
                Toast.makeText(this,"click1",Toast.LENGTH_LONG).show();
                Intent itn = new Intent(this,add.class);
                startActivity(itn);
                return true;
            //case 1:
            case R.id.Menu2_p2:
                Toast.makeText(this,"Help_info",Toast.LENGTH_LONG).show();
                Intent itn2 = new Intent(this,Page2.class);
                startActivity(itn2);
                return true;
            //case 2:
            case R.id.Menu3_p2:
                Toast.makeText(this,"Save....",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    public void click(View v) {
       // Intent itn = new Intent(this,MainActivity.class);
       // startActivity(itn);
    }
}