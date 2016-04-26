package com.devstudio.mlabsa.recipes;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] recipeName;
    String[] recipeType;
    String[] recipeStep;
    TypedArray recipeImage;
    LayoutInflater inflater;

    public ListViewAdapter(Context context, String[] recipeName, String[] recipeType,
                           String[] recipeStep, TypedArray recipeImage) {
        this.context = context;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.recipeStep = recipeStep;
        this.recipeImage = recipeImage;
    }

    @Override
    public int getCount() {
        return recipeName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtName;
        TextView txtType;
        TextView txtSteps;
        ImageView imgRecipe;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.ui_list_item, parent, false);

        // Locate the TextViews in listview_item.xml
        txtName = (TextView) itemView.findViewById(R.id.Name);
        txtType = (TextView) itemView.findViewById(R.id.Type);
        txtSteps = (TextView) itemView.findViewById(R.id.Step);
        // Locate the ImageView in listview_item.xml
        imgRecipe = (ImageView) itemView.findViewById(R.id.RecipePic);

        // Capture position and set to the TextViews
        txtName.setText(recipeName[position]);
        txtType.setText(recipeType[position]);
        txtSteps.setText(recipeStep[position] + " STEPS");

        // Capture position and set to the ImageView
        imgRecipe.setImageResource(recipeImage.getResourceId(position, 0));

        return itemView;
    }
}

