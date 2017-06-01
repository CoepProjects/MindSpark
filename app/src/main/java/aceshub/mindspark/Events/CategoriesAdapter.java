package aceshub.mindspark.Events;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<CategoriesSingleItem> categoriesSingleItem;
    private Context context;

    public CategoriesAdapter(Context context, List<CategoriesSingleItem> categoriesSingleItems) {
        this.categoriesSingleItem = categoriesSingleItems;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_single_item, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final CategoryViewHolder categoryViewHolder = (CategoryViewHolder) holder;
        categoryViewHolder.tvCategory.setText(categoriesSingleItem.get(position).getCategoryName());
        categoryViewHolder.ivCategory.setImageResource(categoriesSingleItem.get(position).getImage());

        int colorId = categoriesSingleItem.get(position).getBackgroundColor();
        int color = ContextCompat.getColor(context, colorId);
        categoryViewHolder.cvCategories.setCardBackgroundColor(color);

        List<EventsSingleItem> eventsSingleItems = categoriesSingleItem.get(position).getEventsSingleItemList();

        EventsAdapter eventsAdapter = new EventsAdapter(eventsSingleItems);

        categoryViewHolder.rvEvents.setItemAnimator(new DefaultItemAnimator());
        categoryViewHolder.rvEvents.setLayoutManager(new LinearLayoutManager(context));
        categoryViewHolder.rvEvents.setAdapter(eventsAdapter);

        categoryViewHolder.llCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (categoryViewHolder.rvEvents.getVisibility() == View.GONE)
                    categoryViewHolder.rvEvents.setVisibility(View.VISIBLE);
                else
                    categoryViewHolder.rvEvents.setVisibility(View.GONE);
            }
        });

        categoryViewHolder.rvEvents.setVisibility(View.GONE);
        // categoryViewHolder.llCategories.setBackgroundColor(categoriesSingleItem.get(position).getBackgroundColor());
    }

    @Override
    public int getItemCount() {
        return categoriesSingleItem.size();
    }

    private class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCategory;
        TextView tvCategory;
        RecyclerView rvEvents;
        LinearLayout llCategories;
        CardView cvCategories;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            ivCategory = (ImageView) itemView.findViewById(R.id.ivCategory);
            tvCategory = (TextView) itemView.findViewById(R.id.tvCategory);
            rvEvents = (RecyclerView) itemView.findViewById(R.id.rvEvents);
            llCategories = (LinearLayout) itemView.findViewById(R.id.llCategoryCard);
            cvCategories = (CardView) itemView.findViewById(R.id.cvCategory);
        }

    }
}
