package com.example.recipebook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycerviewAdapter extends RecyclerView.Adapter<RecycerviewAdapter.MyViewHolder> {

     private Context context;
    private List<recipe> mData;


    public RecycerviewAdapter(Context context, List<recipe> mData) {
        this.context = context;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.recipe_design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
           holder.recipeImg.setImageResource(mData.get(position).getRecipeImage());
           holder.recipeTitle.setText(mData.get(position).getRecipeName());
           holder.cardview.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent = new Intent(context,Recipe_Details.class);
                   intent.putExtra("RecipeName",mData.get(position).getRecipeName());
                   intent.putExtra("RecipeIngredients",mData.get(position).getRecipeIngredients());
                   context.startActivity(intent);
               }
           });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle; ImageView recipeImg;
        CardView cardview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = itemView.findViewById(R.id.recipe_name);
            recipeImg = itemView.findViewById(R.id.recipe_image);
            cardview = itemView.findViewById(R.id.cardview_id);
        }
    }
}
