package com.example.kiosk_help_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter {

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<ListViewItem> sample;
    public int cost_sum;

    public int getCostSum()
    {
        return this.cost_sum;
    }

    public ListviewAdapter(Context context, ArrayList<ListViewItem> data) {
        mContext = context;
        sample = data;
        mLayoutInflater = LayoutInflater.from(mContext);


    }



    @Override
    public int getCount() {
        return sample.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ListViewItem getItem(int position) {
        return sample.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.listview_custom, null);

        //ImageView imageView = (ImageView)view.findViewById(R.id.poster);
        TextView menuName = (TextView)view.findViewById(R.id.menu_name);
        TextView menuCost = (TextView)view.findViewById(R.id.menu_cost);

        //imageView.setImageResource(sample.get(position).getPoster());
        menuName.setText(sample.get(position).getName());
        menuCost.setText(sample.get(position).getCost());

        return view;
    }
}
