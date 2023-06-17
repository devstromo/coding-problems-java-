package com.devstromo.patterns.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
    }
}

class Singleton {
    private static Singleton instance;
    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
