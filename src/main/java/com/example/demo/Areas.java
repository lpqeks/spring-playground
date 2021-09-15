package com.example.demo;

public class Areas {
    int baseLegth = 0;
    int height = 0;

    public int getBaseLegth() {
        return baseLegth;
    }

    public void setBaseLegth(int baseLegth) {
        this.baseLegth = baseLegth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calculate() {
        return ((this.getBaseLegth() * 0.5) * this.getHeight());
    }
}
