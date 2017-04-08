package com.example.dell.android_s4a4_gridviewimgtext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by dell on 4/6/2017.
 */
public class ImageAdapter extends BaseAdapter {

    Context ctx;
    private Integer android_images[] = {R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ice_cream_sandwich,
                                        R.drawable.jellybean,R.drawable.kitkat,R.drawable.lolipop};


    public ImageAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return android_images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView iv;
        if(view==null)
        {
            iv=new ImageView(ctx);
            iv.setLayoutParams(new GridView.LayoutParams(300,300));
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iv.setPadding(8,8,8,8);
        }
        else{
            iv=(ImageView)view;
        }
        iv.setImageResource(android_images[i]);
        return  iv;
    }
}
