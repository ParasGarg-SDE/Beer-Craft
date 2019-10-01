package com.example.beercraft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class BeersAdapter extends RecyclerView.Adapter<BeersAdapter.BeerHolder>{
    private Context context;
    private ArrayList<Beers> beers;
    public class BeerHolder extends RecyclerView.ViewHolder {
        private TextView BeerName, abv, ibu, id, BeerStyle, ounces;

        public BeerHolder(View view){
            super(view);
            BeerName = view.findViewById(R.id.BeerName);
            abv = view.findViewById(R.id.abv);
            ibu = view.findViewById(R.id.ibu);
            id = view.findViewById(R.id.id);
            BeerStyle = view.findViewById(R.id.BeerStyle);
            ounces = view.findViewById(R.id.ounces);
        }
        public void setDetails(Beers beers) {
            BeerName.setText(beers.getBeerName());
            abv.setText(String.format(Locale.US, "The Alcoholic content by Vol.(Abv) : %.2f ", beers.getAbv()));
            ibu.setText(String.format(Locale.US, "International bittering unit(Ibu) : %d ", beers.getIbu()));
            id.setText(String.format(Locale.US, "Beer Id : %d ", beers.getId()));
            BeerStyle.setText(String.format(Locale.US, "Beer Style : %s", beers.getBeerStyle()));
            ounces.setText(String.format(Locale.US,"Ounces : %d ",beers.getOunces()));

        }
    }
    public BeersAdapter(Context context, ArrayList<Beers> beers){
        this.context = context;
        this.beers = beers;
    }
    @Override
    public int getItemCount() {
        return beers.size();
    }
    @Override
    public BeerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_row, parent, false);
        return new BeerHolder(view);
    }
    @Override
    public void onBindViewHolder(BeerHolder holder, int position) {
        Beers beer = beers.get(position);
        holder.setDetails(beer);
    }
}
