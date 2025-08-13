package com.huacao.one;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import android.widget.ListView;

public class BAListView extends AppCompatActivity {
    private ListView lv;
	private List<DataBean> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balistview);
		initview();
        initdata();
        MbaseAdapter adapter = new MbaseAdapter(this, data);
        lv.setAdapter(adapter);
    }

	public void initdata() {
		data = new ArrayList<DataBean>();
		// 微信聊天信息列表模拟数据
		DataBean d1 = new DataBean();
		d1.setTitle("大胖");
		d1.setContent("今天在干嘛");
		d1.setImgid(R.drawable.img1);
		
		DataBean d2 = new DataBean();
		d2.setTitle("小美");
		d2.setContent("周末一起看电影吗？");
		d2.setImgid(R.drawable.img2);

		DataBean d3 = new DataBean();
		d3.setTitle("技术部老王");
		d3.setContent("项目文档发你邮箱了");
		d3.setImgid(R.drawable.img3);

		DataBean d4 = new DataBean();
		d4.setTitle("老妈");
		d4.setContent("记得按时吃饭");
		d4.setImgid(R.drawable.img4);

		DataBean d5 = new DataBean();
		d5.setTitle("死党阿强");
		d5.setContent("开黑吗？我亚索贼6");
		d5.setImgid(R.drawable.img5);

		DataBean d6 = new DataBean();
		d6.setTitle("大学同学群");
		d6.setContent("班长：同学聚会时间确定了");
		d6.setImgid(R.drawable.img6);

		DataBean d7 = new DataBean();
		d7.setTitle("快递小张");
		d7.setContent("包裹放快递柜了");
		d7.setImgid(R.drawable.img7);

		DataBean d8 = new DataBean();
		d8.setTitle("健身教练");
		d8.setContent("今天深蹲做几组？");
		d8.setImgid(R.drawable.img8);

		DataBean d9 = new DataBean();
		d9.setTitle("HR李小姐");
		d9.setContent("面试安排在下周二");
		d9.setImgid(R.drawable.img9);

		DataBean d10 = new DataBean();
		d10.setTitle("房东");
		d10.setContent("该交下季度房租了");
		d10.setImgid(R.drawable.img10);

		DataBean d11 = new DataBean();
		d11.setTitle("游戏好友");
		d11.setContent("新副本开了，速来");
		d11.setImgid(R.drawable.img11);

		DataBean d12 = new DataBean();
		d12.setTitle("表妹");
		d12.setContent("哥，借我点钱呗");
		d12.setImgid(R.drawable.img12);

		DataBean d13 = new DataBean();
		d13.setTitle("客户张总");
		d13.setContent("方案需要再修改下");
		d13.setImgid(R.drawable.img13);

		DataBean d14 = new DataBean();
		d14.setTitle("闺蜜小雅");
		d14.setContent("新买的裙子好看吗？[图片]");
		d14.setImgid(R.drawable.img14);

		DataBean d15 = new DataBean();
		d15.setTitle("外卖小哥");
		d15.setContent("已到楼下，请取餐");
		d15.setImgid(R.drawable.img15);

		DataBean d16 = new DataBean();
		d16.setTitle("同事小王");
		d16.setContent("帮我带杯咖啡");
		d16.setImgid(R.drawable.img16);

		DataBean d17 = new DataBean();
		d17.setTitle("旅行群");
		d17.setContent("五一去哪玩？");
		d17.setImgid(R.drawable.img17);

		DataBean d18 = new DataBean();
		d18.setTitle("前女友");
		d18.setContent("最近还好吗？");
		d18.setImgid(R.drawable.img18);

		DataBean d19 = new DataBean();
		d19.setTitle("宠物医生");
		d19.setContent("疫苗该打了");
		d19.setImgid(R.drawable.img19);

		DataBean d20 = new DataBean();
		d20.setTitle("房产中介");
		d20.setContent("新出学区房考虑吗？");
		d20.setImgid(R.drawable.img20);
		
		data.add(d1);
		data.add(d2);
		data.add(d3);
		data.add(d4);
		data.add(d5);
		data.add(d6);
		data.add(d7);
		data.add(d8);
		data.add(d9);
		data.add(d10);
		data.add(d11);
		data.add(d12);
		data.add(d13);
		data.add(d14);
		data.add(d15);
		data.add(d16);
		data.add(d17);
		data.add(d18);
		data.add(d19);
		data.add(d20);
		
	}

	private void initview() {
	lv = findViewById(R.id.activitybalistviewListView1);
	}


}
