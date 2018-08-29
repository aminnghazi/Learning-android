package com.example.aming.createrecyclerview;

import android.support.v7.widget.CardView;

//[4]
// In bakhsh Haman Model Ast ke data ra negah midarad
// Dar inja etelaate Daroone card view ha negahdari mishavad
//Dar inja bayad 3 kar anjam dad:1)constructor 2)setter 3)getter
public class RecyclerItems
{
    private String header;
    private String desc;
    public RecyclerItems(String header, String desc) {
        this.header = header;
        this.desc = desc;
    }
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
