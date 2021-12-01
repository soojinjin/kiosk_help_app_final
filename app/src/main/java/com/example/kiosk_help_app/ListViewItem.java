package com.example.kiosk_help_app;

public class ListViewItem {
    private String cost;
    private String menu_name;
    private int poster;

    public String getCost(){return this.cost;}

    public String getName(){return this.menu_name;}

    public int getPoster()
    {
        return this.poster;
    }

    public ListViewItem(String menu_name, String cost, int poster){
        this.poster = poster;
        this.cost = cost;
        this.menu_name = menu_name;
    }
}
