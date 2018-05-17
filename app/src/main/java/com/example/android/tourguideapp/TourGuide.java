package com.example.android.tourguideapp;
public class TourGuide{
    private String Name;
    private String Location;
    private String Phone;
    private int ImageResourceId = NO_IMAGE_PROVIDED;
    @Override
    public String toString() {
        return "TourGuide{" +
                "Name='" + Name + '\'' +
                ",Location='" + Location + '\'' +
                ", Phone=" + Phone +
                ", ImageResourceId=" + ImageResourceId +
                '}';
    }
    private static final int NO_IMAGE_PROVIDED = -1;
    public TourGuide(String name, String location, String phone) {
     Name = name;
     Location = location;
     Phone = phone;
     }
    public TourGuide(String name, String location, String phone, int imageResourceId) {
        Name = name;
        Location = location;
        Phone = phone;
        ImageResourceId = imageResourceId;
    }
 public String getName(){return Name;}
 public String getLocation(){return Location;}
 public String getPhone(){return Phone;}
    public int getImageResourceId() {
        return ImageResourceId;
    }
    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }

}

