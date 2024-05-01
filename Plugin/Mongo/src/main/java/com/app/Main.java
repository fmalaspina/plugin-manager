package com.app;

import  com.app.Plugin;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements Plugin {
    public static void main(String[] args) {

    }

    @Override
    public String getName() {
        return "Mongo plugin";
    }
    @Override
    public String getType() {
        return "Mongo";
    }

}