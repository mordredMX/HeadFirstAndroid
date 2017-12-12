package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }


    public void onClickFindBeer(View view){
        TextView brandText= (TextView)findViewById(R.id.brands);
        Spinner color=(Spinner)findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItem());
        List<String> brands=expert.getBrands(beerType);
        StringBuilder sb=new StringBuilder();
        for(String brand:brands){
            sb.append(brand).append('\n');
        }
        brandText.setText(sb);
    }
}
