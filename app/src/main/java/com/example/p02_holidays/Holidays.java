package com.example.p02_holidays;

public class Holidays {
    private String name;
    private String date;
    private int pic;

    public Holidays(String name, int pic, String date) {
        this.name = name;
        this.date = date;
        this.pic = pic;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }
}

