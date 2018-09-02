package com.example.maurya.hacksociety;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String> {

    private String[] items;
    private String[] descriptions;
    private int[] images;
    private Activity context;
    public CustomListView(Activity context, String[] items,String[] descriptions,int[] images) {
        super(context,R.layout.listlayout,items);

        this.context=context;
            this.items=items;
            this.descriptions=descriptions;
            this.images=images;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listlayout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.tvw1.setText(items[position]);
        viewHolder.tvw2.setText(descriptions[position]);
        viewHolder.ivw.setImageResource(images[position]);

        return r;


    }
    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View v)
        {
            tvw1=(TextView) v.findViewById(R.id.tvname);
            tvw2=(TextView) v.findViewById(R.id.tvdescription);
            ivw=(ImageView) v.findViewById(R.id.imageView);

        }


    }
}
