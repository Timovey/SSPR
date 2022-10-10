package org.example;

public class Function {
    public boolean isFive(int number) {
        if(number == 5) {
            return true;
        }
        return false;
    }
    public String Concat(String string1, String string2) {
        return new StringBuilder(string1).append(string2).toString();
    }
    public double Pow(double num, double degree) {
        return Math.pow(num, degree);
    }
}
