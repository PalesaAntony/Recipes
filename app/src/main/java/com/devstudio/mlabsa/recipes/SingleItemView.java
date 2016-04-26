package com.devstudio.mlabsa.recipes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends Activity {
    // Declare Variables
    TextView txtName;
    TextView txtType;
    TextView txtStep;
    ImageView imgRecipe;

    TextView txtIngredients;
    TextView txtDirections;

    Button btnMoreDetai;

    String[] Name;
    String[] Type;
    String[] Step;
    int[] Image;
    int position;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);
        // Retrieve data from MainActivity on listview item click
        Intent i = getIntent();
        // Get a single position
        position = i.getExtras().getInt("position");
        // Get the list of rank
        Name = i.getStringArrayExtra("name");
        // Get the list of country
        Type = i.getStringArrayExtra("type");
        // Get the list of population
        Step = i.getStringArrayExtra("step");
        // Get the list of flag
        Image = i.getIntArrayExtra("image");

        // Locate the TextViews in singleitemview.xml
        txtName = (TextView) findViewById(R.id.Name);
        txtType = (TextView) findViewById(R.id.Type);
        txtStep = (TextView) findViewById(R.id.Step);
        txtIngredients = (TextView) findViewById(R.id.txtIngredient);
        txtDirections = (TextView) findViewById(R.id.txtDirections);

        // Locate the ImageView in singleitemview.xml
        imgRecipe = (ImageView) findViewById(R.id.RecipePic);

        btnMoreDetai = (Button) findViewById(R.id.read_directions);

        // Load the text into the TextViews followed by the position
        txtName.setText(Name[position]);
        txtType.setText(Type[position]);
        txtStep.setText(Step[position]);

        if(position == 0){
            for(String ingredients : getResources().getStringArray(R.array.slow_beef_stew_ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.slow_beef_stew_directions)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 1){
            for(String ingredients : getResources().getStringArray(R.array.choc_cake_Ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.chocolate_cake_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 2){
            for(String ingredients : getResources().getStringArray(R.array.choc_cornstarch_ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.chocolate_cornstarch_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 3){
            for(String ingredients : getResources().getStringArray(R.array.herb_dumpling_ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.herb_dumpling_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 4){
            for(String ingredients : getResources().getStringArray(R.array.instant_berry_yoghurt_ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.instant_berry_yoghurt_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 5){
            for(String ingredients : getResources().getStringArray(R.array.omelette_ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.omelette_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 6){
            for(String ingredients : getResources().getStringArray(R.array.peanut_butter_cookies_ingredients)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.peanut_butter_cookies_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }else if(position == 7){
            for(String ingredients : getResources().getStringArray(R.array.pumpkin_chess_pie)){
                txtIngredients.append(ingredients + "\n\n");
            }
            for(String directions : getResources().getStringArray(R.array.pumpkin_cheese_pie_direction)){
                txtDirections.append(directions + "\n\n");
            }
        }
        // Load the image into the ImageView followed by the position
        imgRecipe.setImageResource(Image[position]);
    }

    public void makeVisible(View v){
        txtDirections.setVisibility(View.VISIBLE);
        btnMoreDetai.setVisibility(View.GONE);
    }
}