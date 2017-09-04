package aceshub.mindspark.Events;

import android.content.Intent;
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

public class EventsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<EventsSingleItem> eventsSingleItem;

    public EventsAdapter(List<EventsSingleItem> eventsSingleItem) {
        this.eventsSingleItem = eventsSingleItem;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.event_single_item,parent,false);
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final EventsViewHolder eventsViewHolder=(EventsViewHolder)holder;
        eventsViewHolder.ivEvent.setImageResource(eventsSingleItem.get(position).getImage());
        eventsViewHolder.tvEvent.setText(eventsSingleItem.get(position).getName());
        eventsViewHolder.llEventSingleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(eventsViewHolder.tvEvent.getContext(),Event_WorkshopDetailsActivity.class);
                i.putExtra("Event",eventsSingleItem.get(position));
                i.putExtra("origin","EventsFragment");
                eventsViewHolder.tvEvent.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventsSingleItem.size();
    }

    private class EventsViewHolder extends RecyclerView.ViewHolder {
        TextView tvEvent;
        ImageView ivEvent;
        LinearLayout llEventSingleItem;
        public EventsViewHolder(View itemView) {
            super(itemView);
            tvEvent=(TextView)itemView.findViewById(R.id.tvEvent);
            ivEvent=(ImageView)itemView.findViewById(R.id.ivEvent);
            llEventSingleItem=(LinearLayout)itemView.findViewById(R.id.llEventSingleItem);
        }
    }
}
