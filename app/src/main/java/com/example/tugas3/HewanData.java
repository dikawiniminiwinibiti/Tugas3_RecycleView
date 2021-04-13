package com.example.tugas3;

public class HewanData {
    String name , tag , description;
    int image;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public HewanData(String name, String tag, String description, int image) {
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.image = image;
    }
}
