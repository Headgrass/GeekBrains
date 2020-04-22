package ru.GeekBrains.weather;

import java.io.Serializable;
import java.text.BreakIterator;

public class Parcel implements Serializable {
    public String city = "Новосибирск";
    boolean bwind = false;
    boolean bpress = false;
    boolean blang = false;

public void setCity(String city){
    this.city = city;
}
public String getCity(String city){
    return city;
}
}
