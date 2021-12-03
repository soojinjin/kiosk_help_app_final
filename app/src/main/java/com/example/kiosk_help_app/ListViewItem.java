package com.example.kiosk_help_app;

import java.io.Serializable;

public class ListViewItem implements Serializable {
    private String cost;
    private String menu_name;


    public String getCost(){return this.cost;}

    public String getName(){return this.menu_name;}


    public ListViewItem(String menu_name, String cost){
        //this.poster = poster;
        this.cost = cost;
        this.menu_name = menu_name;
    }
}
