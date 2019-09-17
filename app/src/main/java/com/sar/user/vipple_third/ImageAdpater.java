package com.sar.user.vipple_third;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdpater extends BaseAdapter {
   Context mcontext;

    public ImageAdpater(Context context)
    {
        this.mcontext=context;
    }

    public  int a[]={ R.drawable.alina,R.drawable.alina,R.drawable.alina,
                     
            R.drawable.alina,R.drawable.alina,R.drawable.alina,R.drawable.alina,R.drawable.alina,R.drawable.alina,R.drawable.alina,R.drawable.alina,R.drawable.alina,};

    @Override
    public int getCount() {
        return a.length;
    }

    @Override
    public Object getItem(int position) {
        return a[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mcontext);
        imageView.setImageResource(a[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        //imageView.setLayoutParams(new GridView.LayoutParams(340,350));
        imageView.setAdjustViewBounds(true);






        return  imageView;
    }
}
