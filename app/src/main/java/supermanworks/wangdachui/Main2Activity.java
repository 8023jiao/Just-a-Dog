package supermanworks.wangdachui;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

//构造函数内需要一个消息类型参数，定义发送为0，接收为1,头像id,用户名id
public class Main2Activity extends AppCompatActivity  implements View.OnClickListener{
    public static final int SEND = 0;
    public static final int RECEIVE = 1;
    ArrayList<String>  a;
    //   设置头像常量
    public static int pWangdachui = R.drawable.p5;
    public static int pXiaomei = R.drawable.p6;
    public static int pWangnima = R.drawable.p1;
    public static int pmother = R.drawable.p11;
    public static int pbao = R.drawable.p9;
    public static String nWangdachui = "王大锤";
    public static String nXiaomei = "小美";
    public static String nWangnima = "王尼玛";
    public static String nmother = "小美妈";
String word;

    MyAdapter adapter;
    ListView listView;
    EditText content;
    Button send1;
    Button send2;
    Button send3;
    Button send4;
    Button send5;
    Button send6;
    Button send7;
    Button send8;
    Button send9;
    Button send10;
    Button send11;
    Button send12;
    Button send13;

    //    创建内容数组
    public List<Juqing> juqingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        //       调用方法传递数据，实现listView控件的数据初始化

//      创建适配器对象
        adapter = new MyAdapter(Main2Activity.this, R.layout.item, juqingList);
        //        获取listview对象
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setSelection(juqingList.size());
//        获取发送按钮和文本输入框的对象
        send1 = (Button) findViewById(R.id.send1);
        send2 = (Button) findViewById(R.id.send2);
        send3 = (Button) findViewById(R.id.send3);
        send4 = (Button) findViewById(R.id.send4);
        send5 = (Button) findViewById(R.id.send5);
        send6 = (Button) findViewById(R.id.send6);
        send7 = (Button) findViewById(R.id.send7);
        send8 = (Button) findViewById(R.id.send8);
        send9 = (Button) findViewById(R.id.send9);
        send10 = (Button) findViewById(R.id.send10);
        send11 = (Button) findViewById(R.id.send11);
        send12 = (Button) findViewById(R.id.send12);
        send13 = (Button) findViewById(R.id.send13);
        TextView text_back=(TextView)findViewById(R.id.text_back);
        ImageView img_back=(ImageView)findViewById(R.id.img_back);
        text_back.setOnClickListener(this);
        img_back.setOnClickListener(this);
        send1.setOnClickListener(this);
        send2.setOnClickListener(this);
        send3.setOnClickListener(this);
        send4.setOnClickListener(this);
        send5.setOnClickListener(this);
        send6.setOnClickListener(this);
        send7.setOnClickListener(this);
        send8.setOnClickListener(this);
        send9.setOnClickListener(this);
        send10.setOnClickListener(this);
        send11.setOnClickListener(this);
        send12.setOnClickListener(this);
        send13.setOnClickListener(this);
        content = (EditText) findViewById(R.id.eEditText);
//        定义一个a数组，里面的值会在单击时和用户输入的进行判断
         a=new ArrayList<>();
        a.add("我爱你");
        a.add("随便花");
        a.add("嫁给我");
        a.add("么么哒");
        a.add("我有钱");
        init();//初始化，显示开头的对话
    }


//    xx方法，利用循环判断当前输入的语句，有没有和数组a里相同的，有就返回真，没有即默认为假
//    在每一次点击中优先执行这个判断方法；
//    public boolean xx(String word,ArrayList<String>  b){
//        int len=b.size();
//        boolean or=false;
//        for(int i=0;i<len;i++){
//            or=word.equals(b.get(i));
//            if(or){
//               break;
//            }
//        }
//
//        return or;
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_back:
                this.finish();
                break;
        }
        switch (v.getId()){
            case R.id.img_back:
                this.finish();
                break;
        }
         word = content.getText().toString();
        if(a.contains(word)){
            myMsg(word);
            xmSay("啊，大锤，我好感动", 2000);
            xmSay("我要跟你生猴子", 4000);
            task(new Juqing(R.drawable.p17, RECEIVE, pWangnima, nWangnima), 0, 6000);
            wnmSay("从此他们过上了幸福的生活", 8000);
            wnmSay("游戏通关，嘿嘿嘿，可以去领红包了", 10000);
        }
        else{
        switch (v.getId()) {
            case R.id.send1:
                switch (word) {
                    case "":
                        break;
                    case "1":
                        myMsg("搭讪");
                        wdcSay("姑娘，你很像我的下一任女朋友啊", 2000);
                        xmSay("走开，死变态", 4000);
                        xmMotherSay("你要对我女儿干什么", 6000);
                        task(new Juqing(R.drawable.p21, RECEIVE, pmother, nmother), 0, 8000);
                        wnmSay("搭讪失败，你已经变成变态", 10000);
                        wnmSay("游戏结束，回复：0 重新开始", 12000);
                        Log.d("12356789","2");
                        send1.setVisibility(View.GONE);
                        send3.setVisibility(View.VISIBLE);
                        break;
                    case "2":
                        myMsg("不搭讪");
                        wdcSay("恩，像我这样风一样的男子，怎么能随便和凡人说话，让我用高冷的步伐" +
                                "引起小美的注意", 2000);
                        task(new Juqing(R.drawable.p22, RECEIVE, pWangdachui, nWangdachui), 0, 6000);

                        xmSay("刚才走过去的是谁，好潇洒的背影", 8000);
                        wdcSay("咦，地上好像有什么东西", 10000);
                        wdcSay("让我捡起来看看", 12000);
                        wnmSay("回复1：捡，回复2:不捡", 14000);
                        send1.setVisibility(View.GONE);
                        send2.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();//发送请按提示输入消息，并且清空输入框
                        break;
                }break;
            case R.id.send2:
                 word = content.getText().toString();
                switch (word) {
                    case "":
                        break;
                    case "1"://捡
                        myMsg("捡起来");
                     wdcSay("这简约又精致的耳环，莫非是小美的", 2000);
                        wdcSay("让我立马还给小美，树立我光辉伟岸的形象", 5000);
                        wnmSay("立刻把耳环还给小美呢，回复1：还，回复2： 先不还", 7000);
                        send2.setVisibility(View.GONE);
                        send4.setVisibility(View.VISIBLE);
                        break;
                    case "2"://不捡
                        myMsg("就不捡");
                     wdcSay("果然还是不能捡，不能低头，皇冠会掉，我要保持我高冷的气场", 4000);
                        wdcSay("我要只要戴着我低调的墨镜往前走", 6000);
                        wnmSay("王大锤继续目中无人往前走，然后撞上了玻璃门", 9000);
                        wnmSay("卒，享年23", 11000);
                        wnmSay("游戏结束，回复：0 重新开始", 13000);
                        send2.setVisibility(View.GONE);
                        send5.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send3:
                switch (word) {
                    case "":
                        break;
                    case "0":
                        adapter.clear();
                        init();
                        send3.setVisibility(View.GONE);
                        send1.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send4:
                switch (word) {
                    case "":
                        break;
                    case "1"://还
                        myMsg("还给小美~~~");
                        wdcSay("恩，还给小美，刚好可以展示我完美男神的形象", 2000);
                        wdcSay("小美,给~你的耳环", 4000);
                        xmSay("咦，这不是我之前的丢的吗，你怎么找到的", 7000);
                        wdcSay("小美，刚才我看到有人鬼鬼祟祟在楼道徘徊，我大步向前，" +
                                "他果然被我正义的光芒所震慑，丢下这个就跑，你看看耳环没坏吧", 10000);
                        xmSay("大锤，我现在才发现你是这么有男人味，周末一起出去玩吧", 17000);
                        wdcSay("嘿嘿嘿，小美果然被我的气质征服了，要不要跟小美出去呢，让我想想", 22000);
                        wnmSay("出去玩，回复1 不去玩，回复2", 26000);
                        send4.setVisibility(View.GONE);
                        send7.setVisibility(View.VISIBLE);
                        break;
                    case "2"://不还
                        myMsg("先让我收起来，嘿嘿嘿");
                        wdcSay("还是下次找机会还给小美，让我先珍藏两天，嘿嘿嘿", 4000);
                        xmSay("王大锤,你又发神经，在傻笑什么", 7000);
                        xmSay("手上什么东西，拿出来看看", 10000);
                        wdcSay("没什么，真没什么。。。啊呀，不要动手啊，疼疼疼~~~", 14000);
                        wnmSay("耳环被小美，小美以为是王大锤偷的，被暴打一顿", 18000);
                        wnmSay("卒，享年23", 21000);
                        wnmSay("游戏结束，回复：0 重新开始", 23000);
                        send4.setVisibility(View.GONE);
                        send6.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send5:
                switch (word) {
                    case "":
                        break;
                    case "0":
                        adapter.clear();
                        init();
                        send5.setVisibility(View.GONE);
                        send1.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send6:
                switch (word) {
                    case "":
                        break;
                    case "0":
                        adapter.clear();
                        init();
                        send6.setVisibility(View.GONE);
                        send1.setVisibility(View.VISIBLE);
                    default:
                        toast();
                        break;
                }break;
            case R.id.send7:
                switch (word) {
                    case "":
                        break;
                    case "1"://玩
                        myMsg("好啊，一起出去玩");
                        wnmSay("周末。。。。。。", 3000);
                        xmSay("大锤，如果我跟我妈同时掉河里，你会救谁呢", 6000);
                        wdcSay("嘿嘿嘿，这还用问，当然是救小美了，她妈那么凶", 10000);
                        wnmSay("小美妈突然在附近现身", 13000);
                        xmSay("妈，你怎么也在这，刚好，来大锤~这是我妈", 17000);
                        wdcSay("阿姨好", 20000);
                        xmMotherSay("刚才的问题我都听到了，你说你到底救谁", 24000);
                        wdcSay("额，这个。。。。那个。。。。。", 28000);
                        xmMotherSay("小美，你不能跟他在一起，你看他这么犹豫一定不爱你", 32000);
                        wdcSay("阿姨，我是真心爱小美的，你相信我啊", 36000);
                        xmMotherSay("是吗，那你证明给我看啊，你要是真心爱她，就从这条河里跳下去", 40000);
                        wnmSay("回复1：跳，回复2：不跳", 44000);
                        send7.setVisibility(View.GONE);
                        send10.setVisibility(View.VISIBLE);
                        break;
                    case "2"://不玩
                        myMsg("不去了");
                        wdcSay("不了，小美，作为祖国的大好青年，我要把时间花在事业上面，怎么能只顾儿女私情", 2000);
                        xmSay("大锤，果然我没有看错你，我现在就要跟你洞房，今天晚上你来我家吧，没人", 6000);
                        wdcSay("嘿嘿嘿，小美果然还是爱我的", 10000);
                        wdcSay("恩，小美，你等我", 12000);
                        wnmSay("晚上。。。。", 15000);
                        wdcSay("叮咚，叮咚。。。小美，你开门，你开门啊，你有本事叫我来，你倒是开门啊", 18000);
                        wnmSay("一夜过去，小美家晚上果然没人，王大锤冻死在小美家门口，", 23000);
                        wnmSay("卒，享年23 ", 27000);
                        wnmSay("游戏结束，回复：0 重新开始", 30000);
                        send7.setVisibility(View.GONE);
                        send9.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send8:
                switch (word) {
                    case "":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send9:
                switch (word) {
                    case "":
                        break;
                    case "0":
                        adapter.clear();
                        init();
                        send9.setVisibility(View.GONE);
                        send1.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send10:
                switch (word) {
                    case "":
                        break;
                    case "1"://跳
                        myMsg("I Jump");
                        wdcSay("小美，我要证明我对你的爱", 2000);
                        wnmSay("王大锤，纵身一跃跳入河中", 5000);
                        xmSay("大锤，不。。。", 8000);
                        xmMotherSay("恩，看来是真爱啊", 10000);
                        wnmSay("这时王大锤突然发现自己不会游泳", 12000);
                        wnmSay("卒，享年23", 15000);
                        wnmSay("游戏结束，回复：0 重新开始", 18000);
                        send10.setVisibility(View.GONE);
                        send12.setVisibility(View.VISIBLE);
                        break;
                    case "2"://不跳
                        myMsg("千山万水总是情，我不跳河行不行~");
                        xmMotherSay("看，小美，我说他不是真的爱你吧", 3000);
                        xmSay("果然你是在骗我，连这点小事都不肯为我做", 6000);
                        wnmSay("失去小美，游戏结束，回复：0 重新开始",9000);
                        send10.setVisibility(View.GONE);
                        send12.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send11:
                switch (word) {
                    case "":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send12:
                switch (word) {
                    case "":
                        break;
                    case "0":
                        adapter.clear();
                        init();
                        send12.setVisibility(View.GONE);
                        send1.setVisibility(View.VISIBLE);
                        break;
                    default:
                        toast();
                        break;
                }break;
            case R.id.send13:

                switch (word) {
                    case "":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    default:
                        toast();
                        break;
                }break;

        }}
    }

    //    异步加载的在这里更新ui，根据识别码进行判断，数字意义为第几次出现的对话
      Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    shuaxin();
                    break;
                default:
                    break;

            }

        }
    };

    //    初始化方法，开头的几个对话在此加入
    public void init() {
        content.setText("");
        Juqing a1 = new Juqing("你好，我叫王大锤", 1, pWangdachui, nWangdachui);
         Juqing a2 = new Juqing("没错，新时代的好男人就是我", 1, pWangdachui, nWangdachui);
        final Juqing a3 = new Juqing("哎呀，这不是新来的同事小美吗，看来我要上去认识一下，让她感受" +
                "一下来自集体的温暖", 1, pWangdachui, nWangdachui);
        final Juqing a4 = new Juqing("回复1:搭讪  回复2：不搭讪", 1, pWangnima, nWangnima);
        task(a1, 0, 1000);
        task(a2, 0, 3000);
        task(a3, 0, 5000);
        task(a4, 0, 9000);
    }


    //   下面是定时器和定时器任务方法，传入Juqing的对象（需要的对话内容），刷新ui的识别码0，和刷新ui的间隔时间
    public  void  task(final Juqing juqing, final int msg, int time) {
        TimerTask retask = new TimerTask() {
            public void run() {
                juqingList.add(juqing);
                Message message = new Message();
                message.what = msg;
                handler.sendMessage(message);
            }
        };
        Timer timer = new Timer();
        timer.schedule(retask, time);
    }


    //    刷新输入方法
    public  void shuaxin() {
        adapter.notifyDataSetChanged();//数据有变化时刷新内容
        listView.setSelection(juqingList.size());//定位到最后一行
        content.setText("");
    }

    public void toast() {
        Toast toast = Toast.makeText(this, "额，你输入了什么，我竟无法识别", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CLIP_HORIZONTAL, 0, -200);
        content.setText("");
    }
    //    发送方法，发送输入框里的文本
    public void myMsg(String word) {
        task(new Juqing(word, SEND, pbao, null), 0, 0);
    }

    //    小美，王大锤，王尼玛，小美妈四个人说话的方法，两个参数 说的话和显示间隔时间
    public void wdcSay(String string, int time) {
        task(new Juqing(string, RECEIVE, pWangdachui, nWangdachui), 0, time);

    }

    public void wnmSay(String string, int time) {
        task(new Juqing(string, RECEIVE, pWangnima, nWangnima), 0, time);

    }

    public void xmSay(String string, int time) {
        task(new Juqing(string, RECEIVE, pXiaomei, nXiaomei), 0, time);

    }

    public void xmMotherSay(String string, int time) {
        task(new Juqing(string, RECEIVE, pmother, nmother), 0, time);


    }
}
