package com.example.kiosk_help_app;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MenuUploader {
    private static final String DATABASE_URL = "https://kiosk-guide-5a37f-default-rtdb.firebaseio.com/";
    private static final String MENU_NODE = "menu";

    public static void main(String[] args) {
        // Firebase 초기화
        FirebaseDatabase database = FirebaseDatabase.getInstance(DATABASE_URL);
        DatabaseReference menuRef = database.getReference(MENU_NODE);

        // 메뉴 데이터 추가
        addMenu(menuRef, "빅맥", 4900);
        addMenu(menuRef, "1955",6000 );
        addMenu(menuRef, "쿼터파운더치즈", 5500);
        // ... 다른 메뉴 추가

        System.out.println("메뉴 데이터 업로드 완료!");
    }

    private static void addMenu(DatabaseReference menuRef, String name, double price) {
        String key = menuRef.push().getKey();
        Menu menu = new Menu(name, price);
        menuRef.child(key).setValue(menu);
    }

    private static class Menu {
        private String name;
        private double price;

        public Menu() {
            // Firebase에서 객체로 매핑할 때 필요한 기본 생성자
        }

        public Menu(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}