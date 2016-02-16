package supermanworks.wangdachui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/1/11.
 */
public class Juqing {
    ImageView item_leftChatImg;

   private String text;
   private int imageId;
    private int type;
    private int headerPic;
    private String userName;

    public  Juqing(String text,int type,int headerPic,String userName){
        this.text=text;
        this.type=type;
        this.headerPic=headerPic;
        this.userName=userName;
    }
    public Juqing(int imageId,int type,int headerPic,String userName){
//        item_leftChatImg.setVisibility(View.VISIBLE);
        this.imageId=imageId;
        this.type=type;
        this.headerPic=headerPic;
        this.userName=userName;
    }

    public String getText(){
        return text;
    }
    public int getImageId(){
        return imageId;
    }
    public int getType(){
        return type;
    }
    public int getHeaderPic(){
        return headerPic;
    }
    public String getUserName(){
        return userName;
    }
}


