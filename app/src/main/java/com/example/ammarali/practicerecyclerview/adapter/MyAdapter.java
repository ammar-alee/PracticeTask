package com.example.ammarali.practicerecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ammarali.practicerecyclerview.R;
import com.example.ammarali.practicerecyclerview.model.ListItem;

import java.util.List;

/**
 * Created by Ammar.Ali on 10/26/16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public MyAdapter (List<ListItem> listData, Context context){

        this.inflater = LayoutInflater.from(context);
        this.listData = listData;
    }

    @Override
    public RecHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new RecHolder(view);
    }

    @Override
    public void onBindViewHolder(RecHolder holder, int position) {

        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResId());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class RecHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView icon;
        private View container;

        public RecHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.lbl_item_text);
            icon = (ImageView) itemView.findViewById(R.id.im_item_icon);
            container = itemView.findViewById(R.id.cont_item_root);
        }
    }
}
