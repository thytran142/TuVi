package com.example.tranthy.fortuneteller;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;

/**
 * Created by tranthy on 3/12/14.
 */
public class MyAdapter extends ArrayAdapter {
    Activity context;
    String[] items;
    int layoutId;
    int titleId;
    int contentId;
    MyAdapter(Activity context, int layoutId,int titleId,String[] items,int contentId){
        super(context, layoutId,items);
        this.context=context;
        this.items=items;
        this.layoutId=layoutId;
        this.titleId=titleId;
        this.contentId=contentId;
    }
    public View getView(int pos, View convertView, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View row=inflater.inflate(layoutId,null);
        TextView label=(TextView)row.findViewById(titleId);
        if(pos==0){
            label.setText("Name");
        }
        else if(pos==1){
            label.setText("Gender");
        }
        else if(pos==2){
            label.setText("Place of birth");
        }
        else if(pos==3){
            label.setText("Date of birth");
        }else if(pos==4){
            label.setText("Time of birth");
        }
        TextView content=(TextView)row.findViewById(contentId);
        content.setText(items[pos]);
        return (row);
    }
}
