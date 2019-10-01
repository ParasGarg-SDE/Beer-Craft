package com.example.beercraft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BeersAdapter adapter;
    private ArrayList<Beers> beersArrayList;

    TextView appName;
    EditText search;
    ImageView cart;
    Button sortButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appName = findViewById(R.id.App_Name);
        search = findViewById(R.id.search);
        cart = findViewById(R.id.cart);
        sortButton = findViewById(R.id.sort);

        recyclerView =findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        beersArrayList = new ArrayList<>();
        adapter = new BeersAdapter(this, beersArrayList);

        recyclerView.addItemDecoration(new LineDividerItemDecoration(this, R.drawable.line_divider));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
        createListData();
    }
    private void createListData(){
        Beers beers = new Beers("Pub Beer", 0.05, 5, 1, "American Pale Larger", 50);
        beersArrayList.add(beers);

        beers = new Beers("Devils Cup", 0.06, 6, 2, "American Pale Ale", 60);
        beersArrayList.add(beers);

        beers = new Beers("Rise of the Pheonix", 0.07, 7, 3, "American IPA", 70);
        beersArrayList.add(beers);

        beers = new Beers("Sinister", 0.09, 8, 4, "American Double", 90);
        beersArrayList.add(beers);

        beers = new Beers("Sex And Candy", 0.07, 7, 5, "American IPA", 70);
        beersArrayList.add(beers);

        beers = new Beers("Black Exodus", 0.07, 8, 6, "Oatmeal Stout", 70);
        beersArrayList.add(beers);

        beers = new Beers("Lake Streer Express", 0.04, 6, 7, "American Pale Ale", 60);
        beersArrayList.add(beers);

        adapter.notifyDataSetChanged();


    }
}
