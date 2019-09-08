package com.pb;

public class SimpleClass {

    private int intValue = 1;
    private String stringValue = "initial";


    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }


    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public SimpleClass(){}

    public SimpleClass(int intValue, String stringValue){
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

}
