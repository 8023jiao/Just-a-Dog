package supermanworks.wangdachui;

import android.content.Context;
import android.os.Handler;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2016/1/11.
 */
public class MyAdapter extends ArrayAdapter {
    public static final int SEND1=0;
    public static final int RECEIVE1=1;

    private RelativeLayout item_Layoutleft;
    private RelativeLayout item_Layoutright;
    private LinearLayout item_Layoutinner;
    private TextView item_chatText;
    private ImageView item_leftChatImg;
    private Juqing juqing;
    private int id;

    public MyAdapter(Context context, int textViewResourceId, List<Juqing> objects) {
        super(context, textViewResourceId, objects);
        id = textViewResourceId;//id为子项布局的id
    }

    //    重写getView方法
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        juqing = (Juqing) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(id, null);//获取子项布局的对象
        //发送部分左边的对象，通过子项布局的对象获取其中的控件
        TextView item_leftUserName = (TextView) view.findViewById(R.id.item_left_user_name);
        ImageView item_leftHeaderPic = (ImageView) view.findViewById(R.id.item_left_header_pic);
        item_chatText = (TextView) view.findViewById(R.id.item_left_chatText);
        item_leftChatImg = (ImageView) view.findViewById(R.id.item_left_chatImg);
//        ListView子项布局右边部分的对象
        ImageView item_rightHeaderPic = (ImageView) view.findViewById(R.id.item_right_header_pic);
        TextView item_myselfText = (TextView) view.findViewById(R.id.item_myselfText);
//        获取子项布局，两个左右布局的对象，获取方式跟控件一样
        item_Layoutleft = (RelativeLayout) view.findViewById(R.id.itemLayout_left);
        item_Layoutright = (RelativeLayout) view.findViewById(R.id.itemLayout_right);
        item_Layoutinner = (LinearLayout) view.findViewById(R.id.itemLayout_inner);

//        判断消息的类型，来显示listview里面是显示那个布局（气泡）
//        0 为发送，1为接收


        if (juqing.getType() == SEND1) {
            item_Layoutleft.setVisibility(View.GONE);
            item_Layoutinner.setVisibility(View.GONE);
            item_Layoutright.setVisibility(View.VISIBLE);

            //通过获取的子项布局控件对象，设置这些对象显示的内容，
            // 再通过调用Juqing类里面的方法设置显示内容的来源；
            item_myselfText.setText(juqing.getText());
            item_rightHeaderPic.setImageResource(juqing.getHeaderPic());

        } else if (juqing.getType() == RECEIVE1) {

            item_Layoutleft.setVisibility(View.VISIBLE);
            item_Layoutinner.setVisibility(View.VISIBLE);
            item_Layoutright.setVisibility(View.GONE);
            //通过获取的子项布局控件对象，设置这些对象显示的内容，
            // 再通过调用Juqing类里面的方法设置显示内容的来源；

            item_chatText.setText(juqing.getText());
            item_leftChatImg.setImageResource(juqing.getImageId());
            item_leftHeaderPic.setImageResource(juqing.getHeaderPic());
            item_leftUserName.setText(juqing.getUserName());

        }
        return view;
    }
}
