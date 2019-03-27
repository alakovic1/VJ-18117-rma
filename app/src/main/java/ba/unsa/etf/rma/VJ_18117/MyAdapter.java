package ba.unsa.etf.rma.VJ_18117;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter implements View.OnClickListener {

    private Activity activity;
    private ArrayList muzicari;
    private static LayoutInflater inflater = null;
    public Resources res;
    Muzicar muzicar = null;
    int i = 0;

    @Override
    public void onClick(View v) {
    }

    public static class ViewHolder{
        public TextView naziv;
        public TextView zanrMuzicara;
        public ImageView ikonaZanra;
    }

    public MyAdapter(Activity activity, ArrayList data, Resources res) {
        this.activity = activity;
        this.muzicari = data;
        this.res = res;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        if (muzicari.size() <= 0)
            return 1;
        return muzicari.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position){
        return position;
    }


    //Kreiramo svaki red u list view komponenti
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder holder;
        if (convertView == null) {
            v = inflater.inflate(R.layout.element_liste, null);
            holder = new ViewHolder();
            holder.naziv = (TextView) v.findViewById(R.id.Itemname);
            holder.zanrMuzicara = (TextView) v.findViewById(R.id.zanr);
            holder.ikonaZanra = (ImageView) v.findViewById(R.id.icon);
            v.setTag(holder);
        }
        else {
            holder = (ViewHolder) v.getTag();
        }
        if (muzicari.size() <= 0) {
            holder.naziv.setText(R.string.nema_info);
        }
        else {
            muzicar = (Muzicar) muzicari.get(position);
            holder.naziv.setText(muzicar.getImeIPrezime());
            holder.zanrMuzicara.setText(muzicar.getZanr());
            if (holder.zanrMuzicara.getText().equals("Rock'n'Roll"))
                holder.ikonaZanra.setImageResource(res.getIdentifier("drawable/rocknroll.jpg", null, null));
            else if (holder.zanrMuzicara.getText().equals("HIP HOP"))
                holder.ikonaZanra.setImageResource(res.getIdentifier("drawable/hiphop.png", null, null));
            else if (holder.zanrMuzicara.getText().equals("Country"))
                holder.ikonaZanra.setImageResource(res.getIdentifier("drawable/country.jpg", null, null));
            else if (holder.zanrMuzicara.getText().equals("Classical"))
                holder.ikonaZanra.setImageResource(res.getIdentifier("drawable/classical.jpg", null, null));
            else
                holder.ikonaZanra.setImageResource(res.getIdentifier("drawable/jazz.png", null,null));
            //v.setOnClickListener(new AdapterView.OnItemClickListener(position));
        }
        return v;
    }
}
