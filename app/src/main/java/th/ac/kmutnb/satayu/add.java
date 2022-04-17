package th.ac.kmutnb.satayu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class add extends AppCompatActivity {
int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.add,menu);//โหลดจากxml
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
                Intent itn = new Intent(this,MainActivity.class);
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

    public void show(View v) {
        Button btn = findViewById(R.id.add);
        TextView tv1 = findViewById(R.id.num);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                tv1.setText(String.valueOf(i));
            }
        });

    }
    public void show1(View v) {
        Button btn = findViewById(R.id.add);
        TextView tv1 = findViewById(R.id.num);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                tv1.setText(String.valueOf(i));
            }
        });

    }
    public void click(View v) {
        Intent itn = new Intent(this,MainActivity.class);
        startActivity(itn);
    }

}