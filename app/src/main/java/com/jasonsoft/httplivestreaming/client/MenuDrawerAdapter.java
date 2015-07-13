package com.jasonsoft.httplivestreaming.client;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.util.List;

public class MenuDrawerAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mInflater;
    private List<VideoEntry> mItems;
    private ImageLoader mImageLoader = ImageLoader.getInstance();

    public MenuDrawerAdapter(Context context, List<VideoEntry> items) {
        mContext = context;
        mInflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        mImageLoader.init(ImageLoaderConfiguration.createDefault(mContext));
        mItems = items;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public VideoEntry getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mInflater.inflate(R.layout.video_list_item, null);
        MenuDrawerItemViewHolder holder = new MenuDrawerItemViewHolder();
        holder.initViewHolder(view);

        VideoEntry item = mItems.get(position);
        mImageLoader.displayImage(item.video_thumbnail, holder.icon);
        holder.title.setText(item.name);
        holder.details.setText(item.video_content);
        return view;
    }

    class MenuDrawerItemViewHolder {

        public void initViewHolder(View convertView) {
            icon = (ImageView) convertView.findViewById(R.id.video_thumbnail);
            title = (TextView) convertView.findViewById(R.id.video_title);
            details = (TextView) convertView.findViewById(R.id.video_details);
        }

        public ImageView icon;
        public TextView title;
        public TextView details;
    }

}
