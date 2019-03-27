package ba.unsa.etf.rma.VJ_18117;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button dugme;
    private EditText tekst;
    private ListView lista;

    private ArrayList<String> unosi = new ArrayList<String>();
    private MyAdapter adapter;
    private ArrayList<Muzicar> muzicari = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dugme = (Button) findViewById(R.id.button);
        tekst = (EditText) findViewById(R.id.editText);
        lista = (ListView) findViewById(R.id.listView);
        muzicari.add(new Muzicar("Cardi B", "HIP HOP", "https://en.wikipedia.org/wiki/Cardi_B", "Belcalis Marlenis Almánzar (born October 11, 1992), known professionally as Cardi B, is an American rapper, singer, and songwriter.",R.drawable.hiphop));
        muzicari.add(new Muzicar("Ella Fitzgerald", "Jazz", "https://en.wikipedia.org/wiki/Ella_Fitzgerald", "Ella Jane Fitzgerald (April 25, 1917 – June 15, 1996) was an American jazz singer sometimes referred to as the First Lady of Song, Queen of Jazz, and Lady Ella.",R.drawable.jazz));
        muzicari.add(new Muzicar("Freddie Mercury", "Rock'n'Roll", "https://hr.wikipedia.org/wiki/Freddie_Mercury", " Freddie Mercury (Zanzibar, 5. rujna 1946. - London, 24. studenog 1991.), bio je britanski pjevač, tekstopisac i producent, najpoznatiji kao pjevač britanskog rock sastava Queen.",R.drawable.rocknroll));
        muzicari.add(new Muzicar("Blake Shelton", "Country", "https://en.wikipedia.org/wiki/Blake_Shelton", " Blake Tollison Shelton (born June 18, 1976) is an American country singer, songwriter and television personality.",R.drawable.country));
        muzicari.add(new Muzicar("Mozart", "Classical", "https://en.wikipedia.org/wiki/Wolfgang_Amadeus_Mozart", " Wolfgang Amadeus Mozart (27 January 1756 – 5 December 1791), baptised as Johannes Chrysostomus Wolfgangus Theophilus Mozart,[b] was a prolific and influential composer of the classical era.",R.drawable.classical));
        muzicari.add(new Muzicar("Eminem", "HIP HOP", "https://hr.wikipedia.org/wiki/Eminem", "Marshall Bruce Mathers III (St. Joseph, Missouri, 17. listopada 1972.), poznatiji pod umjetničkim imenom Eminem, stilizirano kao EMINƎM, američki je rap glazbenik, producent i glumac.",R.drawable.hiphop));
        muzicari.add(new Muzicar("Mick Jagger", "Rock'n'Roll", "https://en.wikipedia.org/wiki/Mick_Jagger", "Sir Michael Philip Jagger (born 26 July 1943) is an English singer, songwriter, actor and film producer who gained fame as the lead singer and one of the founder members of the Rolling Stones.",R.drawable.rocknroll));
        Resources res = getResources();
        adapter = new MyAdapter(this, muzicari, res);
        lista.setAdapter(adapter);
        //lista.setAdapter(adapter);

        /*dugme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                unosi.add(0,tekst.getText().toString());
                adapter.notifyDataSetChanged();
                tekst.setText("");
            }
        });*/

    }

}

