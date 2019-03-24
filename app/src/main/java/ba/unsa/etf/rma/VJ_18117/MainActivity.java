package ba.unsa.etf.rma.VJ_18117;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText textField;
    private ListView listView;

    private ArrayList<String> unosi = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private ArrayList<Muzicar> muzicari = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textField = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,R.layout.element_liste,R.id.Itemname,unosi);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                unosi.add(0,textField.getText().toString());
                adapter.notifyDataSetChanged();
                textField.setText("");
            }
        });

    }

}

