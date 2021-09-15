package com.example.demo;

public class Dimensions {
    private int length = 0;
    private int width = 0;
    private int height = 0;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String calculateVolume() {
        int volume = getLength() * getHeight() * getWidth();
        return String.format("The volume of a %dx%dx%d rectangle is %d", getLength(), getWidth(), getHeight(), volume);
    }
}
