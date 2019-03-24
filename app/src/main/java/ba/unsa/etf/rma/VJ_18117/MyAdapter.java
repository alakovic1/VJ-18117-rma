package ba.unsa.etf.rma.VJ_18117;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<Muzicar> {

    int resource;
    private Context muzicarContext;
    private List<Muzicar> listaMuzira = new ArrayList<>();

    public MyAdapter(@NonNull Context context, List<Muzicar> items) {
        super(context, 0, items);
        muzicarContext = context;
        listaMuzira = items;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(muzicarContext).inflate(R.layout.za_muzicara, parent, false);
        }

        Muzicar trenutniMuzicar = listaMuzira.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_slika);
        image.setImageResource(trenutniMuzicar.getIdSlike());

        TextView ime = (TextView) listItem.findViewById(R.id.imeMuzicara);
        ime.setText(trenutniMuzicar.getImeIPrezime());

        TextView zanr = (TextView) listItem.findViewById(R.id.zanrMuzicara);
        zanr.setText(trenutniMuzicar.getZanr());

        return listItem;
    }

}
