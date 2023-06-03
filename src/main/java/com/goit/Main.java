package com.goit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();
        User user = new User("Anton", "Lapushenko");
        String s = gson.toJson(user);
        System.out.println(s);
    }
}
