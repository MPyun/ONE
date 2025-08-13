package com.huacao.one;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MbaseAdapter extends BaseAdapter {
	public List<DataBean> data;
	private Context context;
	private LayoutInflater layoutInflater;

	public MbaseAdapter(Context context, List<DataBean> data) {
		this.context = context;
		this.data = data;
		this.layoutInflater = LayoutInflater.from(context); // 正确创建一次
	}
	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
		convertView=layoutInflater.inflate(R.layout.list_item1,parent,false);
		}
		DataBean databean = (DataBean) getItem(position);	
		ImageView img = convertView.findViewById(R.id.listitem1ImageView1);
		img.setImageResource(databean.getImgid());
		TextView title = convertView.findViewById(R.id.listitem1TextView1);
		title.setText(databean.getTitle());
		TextView content = convertView.findViewById(R.id.listitem1TextView2);
		content.setText(databean.getContent());	
		return convertView;
	}
	
    
    
    
}
