package th.ac.kmutnb.satayu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Intent itn =getIntent();
        Intent itn2 =getIntent();
        Intent itn3 =getIntent();
        int item_id = itn.getIntExtra("id",0);
        String item_show = itn2.getStringExtra("da");
        String item_show2 = itn3.getStringExtra("p");
        TextView tv1 = findViewById(R.id.tx3_1);
        tv1.setText("Item is:"+" "+String.valueOf(item_show));
        TextView tv3 = findViewById(R.id.tx3_3);
        tv3.setText("Price is:"+" "+String.valueOf(item_show2));
        TextView tv2 = findViewById(R.id.tx3_2);
        tv2.setText("Item id:"+" "+String.valueOf(item_id));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu3,menu);//โหลดจากxml
        // menu.add(0,0,0,"List");
        // menu.add(0,1,1,"help");
        //menu.add(0,2,2,"Save");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            // case 0:
            case R.id.Menu1_P4:
                Toast.makeText(this,"click1",Toast.LENGTH_LONG).show();
                Intent itn = new Intent(this,MainActivity.class);
                startActivity(itn);
                return true;
            //case 1:
            case R.id.Menu2_P4:
                Toast.makeText(this,"Help_info",Toast.LENGTH_LONG).show();
                Intent itn2 = new Intent(this,Page2.class);
                startActivity(itn2);
                return true;
            //case 2:
            case R.id.Menu3_P4:
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
    public void botton_n(View v){
        int i =1;
        if(i==1) {
            TextView a = findViewById(R.id.txh);
            a.setVisibility(View.VISIBLE);
            ImageView ok = findViewById(R.id.img3);
            ok.setVisibility(View.VISIBLE);
            i++;
        }
        if(i==2){
            Intent itn = new Intent(this,MainActivity.class);
            Toast.makeText(this,"ซื้อสำเร็จกลับไปยังหน้าหลัก",Toast.LENGTH_LONG).show();
            startActivity(itn);
        }
    }
}