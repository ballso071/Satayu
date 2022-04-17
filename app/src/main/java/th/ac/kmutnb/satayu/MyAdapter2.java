package th.ac.kmutnb.satayu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter2 extends BaseAdapter {
    private List<Data> mDatas;
    private LayoutInflater mLayoutInflater;

    public MyAdapter2(Context context, List<Data> aList) {
        mDatas = aList;
        mLayoutInflater = LayoutInflater.from(context);
    }


    static class ViewHolder {
        TextView tvTitle;
        TextView tvDesc;
        ImageView img;
    }

    @Override
    public int getCount() {
        return mDatas.size();
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.row_layout2,viewGroup,false);
            holder = new ViewHolder();
            holder.tvTitle = (TextView)view.findViewById(R.id.word1);
            holder.tvDesc = (TextView)view.findViewById(R.id.word2);


            holder.img = (ImageView)view.findViewById(R.id.item2);
            view.setTag(holder);
        } else {
            holder = (ViewHolder)view.getTag();
        }
        String title = mDatas.get(position).getMtext1();
        holder.tvTitle.setText(title);
        holder.tvDesc.setText(mDatas.get(position).getMtext2());
        holder.img.setImageResource(mDatas.get(position).getMicon());

        return view;
    }

}
