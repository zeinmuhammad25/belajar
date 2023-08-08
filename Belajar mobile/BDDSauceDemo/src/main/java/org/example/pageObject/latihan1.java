package org.example.pageObject;

import com.sun.javafx.binding.StringFormatter;

public class latihan1 {

    public static void main(String[] args) {
            String stringinput = "Independent";

            char[] resultarray = stringinput.toCharArray();

            for (int i = resultarray.length - 1; i >= 0; i--)
                System.out.print(resultarray[i]);
    }

}
