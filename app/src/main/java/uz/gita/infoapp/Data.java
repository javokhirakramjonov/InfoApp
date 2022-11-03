package uz.gita.infoapp;

import android.content.Context;

import java.util.ArrayList;

public class Data {
    private int MAX_SIZE = 13;
    private ArrayList<ModelItem> languages = new ArrayList<>();
    private static Data data;
    private Context context;
    private Data(Context temp) {
        context = temp;
        loadData();
    }

    public static Data getInstance(Context context) {
        if(data == null) {
            data = new Data(context);
        }
        return data;
    }

    private void loadData() {
        String temp;
        int image;
        int name;
        int info;
        for(int i = 0; i < MAX_SIZE; ++ i) {
            temp = "ic_lan" + (i + 1);
            image = context.getResources().getIdentifier(temp, "drawable", context.getPackageName());
            temp = "lan" + (i + 1);
            name = context.getResources().getIdentifier(temp, "string", context.getPackageName());
            temp = "info" + (i + 1);
            info = context.getResources().getIdentifier(temp, "string", context.getPackageName());
            languages.add(new ModelItem(name, info, image));
        }
    }

    public int getImage(int index) {
        return languages.get(index).getImage();
    }

    public int getName(int index) {
        return languages.get(index).getName();
    }

    public int getInfo(int index) {
        return languages.get(index).getInfo();
    }

    public ArrayList<ModelItem> getItems() {
        return languages;
    }
}
