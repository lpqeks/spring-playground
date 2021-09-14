package com.example.demo;

public class MathExpression {

    private String operation;
    private String x;
    private String y;

    public String calculateOp () throws NumberFormatException {

        int xValue = Integer.parseInt(x);
        int yValue= Integer.parseInt(y);
        int result = xValue + yValue;
        String operator = "+";

        if (this.getOperation() != null) {
            switch (this.getOperation()) {
                case "add":
                    result = xValue + yValue;
                    operator = "+";
                    break;
                case "subtract":
                    result = xValue - yValue;
                    operator = "-";
                    break;
                case "multiply":
                    result = xValue * yValue;
                    operator = "*";
                    break;
                case "divide":
                    result = xValue / yValue;
                    operator = "/";
                    break;

                default:
                    result = 0;
                    operator = "blank";
                    break;

            }
            //return this.getX() + " " + operator + " " + this.getY() + " = " + String.valueOf(result);
        }
        return this.getX() + " " + operator + " " + this.getY() + " = " + String.valueOf(result);
        }



    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
