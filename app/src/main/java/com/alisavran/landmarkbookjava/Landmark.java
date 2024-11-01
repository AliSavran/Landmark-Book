package com.alisavran.landmarkbookjava;

import java.io.Serializable;

public class Landmark implements Serializable { // serializable bir yapıyı veri haline getirip başka bir yerde kullanmayı sağlar

    String name;
    String country;
    int image;

    //constructor

    public Landmark(String name, String country, int image){
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
