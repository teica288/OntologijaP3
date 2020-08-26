package ffos.p3.tbizik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Automobil> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Automobil o = podaci.get(position);
        red.sifra.setText(String.valueOf(o.getSifra()));
        red.automobil.setText(o.getAutomobil());
        red.proizvodac.setText(o.getProizvodac());
        red.cijena.setText(String.format("%.2f",o.getCijena()));
        red.kupac.setText(o.getKupac());
        red.blagajnik.setText(o.getBlagajnik());
    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView sifra;
        private TextView automobil;
        private TextView proizvodac;
        private TextView cijena;
        private TextView kupac;
        private TextView blagajnik;

        Red(View itemView) {
            super(itemView);
            sifra = itemView.findViewById(R.id.sifra);
            automobil = itemView.findViewById(R.id.automobil);
            proizvodac = itemView.findViewById(R.id.proizvodac);
            kupac = itemView.findViewById(R.id.kupac);
            cijena = itemView.findViewById(R.id.cijena);
            blagajnik = itemView.findViewById(R.id.blagajnik);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Automobil getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Automobil> itemList) {
        this.podaci = itemList;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
