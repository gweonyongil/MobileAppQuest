package com.example.caucse.week4_mobileapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView sent_tv;
    Button ok_btn;
    int click_cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.name_et);
        et2 = (EditText) findViewById(R.id.num_et);
        sent_tv = (TextView) findViewById(R.id.sent_tv);
        //시간 구하기
        // 현재시간을 msec 으로 구한다.

        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String getTime = sdf.format(date);
        sent_tv.setText(getTime);
        ok_btn = (Button) findViewById(R.id.ok_btn);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.animate_screen);
                ImageView img1 = (ImageView)findViewById(R.id.img1);
                ImageView img2 = (ImageView)findViewById(R.id.img2);
                ImageView img3 = (ImageView)findViewById(R.id.img3);
                ImageView img4 = (ImageView)findViewById(R.id.img4);
                Animation anim1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                Animation anim2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim2);
                Animation anim3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim3);
                Animation anim4 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim4);
                img1.startAnimation(anim1);
                img2.setAnimation(anim2);
                img3.setAnimation(anim3);
                img4.setAnimation(anim4);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog();
                    }
                }, 2000);
            }
        });
    }

    public void AlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);     // 여기서 this는 Activity의 this
        builder.setTitle("시스템 경고")        // 제목 설정
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("귀하의 핸드폰은\n" +
                        "바이러스에 감염되었고\n" +
                        "배터리가 파손되었습니다.\n" +
                        "" +
                        "폰을 고치시려면 지시에 따라주십시오.\n" +
                        "이 창을 닫지마세요.\n" +
                        "" +
                        "**자기 위험 부담으로 나가기**")        // 메세지 설정
                .setCancelable(false)        // 뒤로 버튼 클릭시 취소 가능 설정
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    // 확인 버튼 클릭시 설정
                    public void onClick(DialogInterface dialog, int whichButton) {
                        click_cnt++;
                        if(click_cnt != 9) {
                            AlertDialog();
                        }
                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    // 취소 버튼 클릭시 설정
                    public void onClick(DialogInterface dialog, int whichButton) {
                        click_cnt++;
                        if(click_cnt != 9) {
                            AlertDialog();
                        }
                    }
                });
        AlertDialog dialog = builder.create();    // 알림창 객체 생성
        dialog.show();    // 알림창 띄우기
    }
}
