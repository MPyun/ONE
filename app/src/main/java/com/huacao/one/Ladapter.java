package com.huacao.one;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
public class Ladapter extends RecyclerView.Adapter<Ladapter.ViewHolder> {
	private List<DataBean> list;
	private Context context;

	public Ladapter(List<DataBean> list, Context context) {
		this.list =list;
	    this.context = context;
	}

	@Override
	public int getItemCount() {
		return list.size();
	}

	@Override
	public void onBindViewHolder(Ladapter.ViewHolder vH, int p) {
		DataBean n1 = list.get(p);
		//获取item对象位置并从列表中取出对应对象
		vH.content.setText(n1.getContent());
		vH.title.setText(n1.getTitle());
		vH.img1.setImageResource(n1.getImgid());
		//新建对象，设置数据(内部类成员变量)
		
		
	}

	@Override
	public Ladapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int p) {
		View view = LayoutInflater.from(context).inflate(R.layout.list_item1, viewGroup,false);
		//将item视图转化为根布局view;
		final ViewHolder viewholder = new ViewHolder(view);
		//将该item用ViewHolder缓存起来
		viewholder.v1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					int postion = viewholder.getAdapterPosition();
					DataBean d = list.get(postion);
					Toast.makeText(v.getContext(), "联系人:"+d.getTitle(), Toast.LENGTH_SHORT).show();
				}
				
			
		});//将总item封装成一个实例view，再写入点击事件
		return viewholder;
		//因为是oncreate方法，所以缓存后还需要再返回该item
	}


	public static class ViewHolder extends RecyclerView.ViewHolder {
		TextView title;
		TextView content;
		ImageView img1;
		View v1;
		public ViewHolder(View v) {
			super(v);
			v1 = v;//总布局item的实例，用于点击事件实现
			title = v.findViewById(R.id.listitem1TextView1);
			content = v.findViewById(R.id.listitem1TextView2);
			img1 = v.findViewById(R.id.listitem1ImageView1);
			//将控件保存为实例
		}

	}
}
