package com.example.joselitosbackend.businesLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AsyncMethod extends Thread {

    public void run () {
        URL url = null;
        try {
            url = new URL("https://es.wikipedia.org/wiki/Pandemia_de_COVID-19");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        URLConnection con = null;
        try {
            con = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream is = null;
        try {
            is = con.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Error e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        AsyncMethod thread = new AsyncMethod();
        thread.start();
    }
}
