package com.example.aming.createrecyclerview;
//[1]
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private List<RecyclerItems> itemsList;
private Button btn;
EditText setheader;
EditText setdescription;
Button close;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemsList = new ArrayList<>();
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
        //constructore RecyclerItems ke az tarighe An ma etelaate header va description ra be adapter midahim ta
        //             tebghe barname i ke dar adapter va Recycleritems neveshtim ba an kar shavad
        // mitavan be jaye inkar yek list az sting dar recource sakht
//        for(int i =1 ; i<10 ; i++){
//            RecyclerItems item=new RecyclerItems
//                    ("hello"+i , "my description");
//            itemsList.add(item);
//        }
    String[] descriptions = getResources().getStringArray(R.array.des);
     for(int i = 0; i<descriptions.length;i++){
         RecyclerItems item = new RecyclerItems("header"+i,descriptions[i]);
         itemsList.add(item);
     }
        //   hala itemslist ke ma dar inja darim az tarighe construcore zir be adapter miravad va dar jaye khod gharar migirad
        MyAdapter adapter=new MyAdapter(itemsList,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
    MyCustomDialog();

    }
    public void MyCustomDialog(){
    final Dialog MyDialog = new Dialog(MainActivity.this);
    MyDialog.setContentView(R.layout.customdialog);
    MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
    MyDialog.setTitle("ijade iteme jadid");
    close = MyDialog.findViewById(R.id.close);
    close.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MyDialog.cancel();
        }
    });
    MyDialog.show();
}


}
