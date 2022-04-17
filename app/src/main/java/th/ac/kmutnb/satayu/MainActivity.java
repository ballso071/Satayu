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
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Data> data = new ArrayList<>();
    private  static  final String TAG = "TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void botton_n(View v){
        Intent itn =new  Intent(this,Page2.class);
        startActivity(itn);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);//โหลดจากxml
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
                Intent itn2 = new Intent(this,cart.class);
                startActivity(itn2);
                return true;
            //case 2:
            case R.id.Menu3_p2:
                Toast.makeText(this,"Save....",Toast.LENGTH_LONG).show();
                doSave();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void doSave() {
        Toast.makeText(this,"sel0",Toast.LENGTH_LONG).show();
        Intent itn = new Intent(this,Page3.class);
        startActivity(itn);
    }

}
