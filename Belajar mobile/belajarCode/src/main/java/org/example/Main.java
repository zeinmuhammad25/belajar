package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> optional = new HashMap<String, String>();
        optional.put("a", "indonesia");
        optional.put("b","kanada");
        optional.put("c","india");

        int b = optional.size();
        String c = optional.values().toString();
        String d = optional.keySet().toString();
        optional.remove("a");
         String a = optional.get("a");

//        optional.clear();
//        Boolean a=optional.isEmpty();
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }
}