package com.example.demo;

public class Figure {
    String type;
    int radius;
    int width;
    int height;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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

    public String calculateArea() {
        String finalArea;
        Double finalAreaValue;
        if (this.getType().equals("circle") && this.getRadius() > 0) {
            finalAreaValue = Math.PI * this.getRadius() * this.getRadius();
            finalArea = String.format("Area of a circle with a radius of %d is %.5f", this.getRadius(), finalAreaValue);
        } else if (this.getType().equals("rectangle") && this.getHeight() > 0 && this.getHeight() > 0) {
            finalAreaValue = Double.valueOf(this.getWidth() * this.getHeight());
            finalArea = String.format("Area of a %d x %d rectangle is %d ", this.getHeight(), this.getWidth(), finalAreaValue);

        } else {
            finalArea = "invalid";
        }

        return finalArea;
    }
}
