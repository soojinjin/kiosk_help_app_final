package com.example.kiosk_help_app;

public class ListViewItem {
    private int cash;
    private String menu_name;

    public int getCash(){return cash;}

    public String getName(){return menu_name;}

    public ListViewItem(int cash,String menu_name){
        this.cash = cash;
        this.menu_name = menu_name;
    }
}
