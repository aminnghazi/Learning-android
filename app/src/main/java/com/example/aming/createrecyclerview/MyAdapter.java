package com.example.aming.createrecyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

//  [5]
//Dar inja data ra az Listitem(jayi ke gharar ast etelaate mara negahdarad va in etelaat badan dar card view ha vared
// mishavand)      migirim va be View khod vasl mikonim
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    //yek list az jense clase recycleritems misazim
    List<RecyclerItems> listitems;
    Context cntx;

    public MyAdapter(List<RecyclerItems> listitems, Context cntx) {
        this.listitems = listitems;
        this.cntx = cntx;
    }
    public List<RecyclerItems> getListitems() {
        return listitems;
    }
    public void setListitems(List<RecyclerItems> listitems) {
        this.listitems = listitems;
    }
    public Context getCntx() {
        return cntx;
    }
    public void setCntx(Context cntx) {
        this.cntx = cntx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                        //In method vaghti seda zade mishavad ke View holder sakhte mishavad va
                        // ba An kar mikonad (be noE dade bazgashti tavajoh shavad)
        //Hala yek obj az view misazim ke kare an in ast ke Liste item hara(dar inja recycler1_item.xml)
        // barayash file dar javadorost konad

        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler1_items,parent,false);
        return new MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RecyclerItems item = listitems.get(position);
        //    xml               java
        holder.des.setText(item.getDesc());
        holder.head.setText(item.getHeader());
    }
    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView head;
        TextView des;
        public MyViewHolder(View itemView) {
            super(itemView);
            head=(TextView) itemView.findViewById(R.id.head);
            des=(TextView) itemView.findViewById(R.id.des);
        }
    }


}
