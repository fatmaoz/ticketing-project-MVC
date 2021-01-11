package com.cybertek.enums;

public enum Gender {
    //Eger database defarkli bi value olarak kullanicaksak bu structure da olmasi lazim
    MALE("Male"),FEMALE("Female");

    private final String value;
    private Gender(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
