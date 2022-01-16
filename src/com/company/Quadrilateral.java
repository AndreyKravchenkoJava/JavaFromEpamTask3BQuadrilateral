package com.company;

import java.security.PublicKey;

public class Quadrilateral {
    private Length a;
    private Length b;
    private Length c;
    private Length d;
    private Length diagonal1;
    private Length diagonal2;
    private String typeOfQuadrilateral;

    public Quadrilateral (Length a, Length b, Length c, Length d, Length diagonal1, Length diagonal2, String typeOfQuadrilateral) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.typeOfQuadrilateral = typeOfQuadrilateral;
    }
    public Length getA () {
        return a;
    }
    public void setA (Length a) {
        this.a = a;
    }
    public Length getB () {
        return b;
    }
    public void setB (Length b) {
        this.b = b;
    }
    public Length getC () {
        return c;
    }
    public void setC (Length c) {
        this.c = c;
    }
    public Length getD () {
        return d;
    }
    public void setD (Length d) {
        this.d = d;
    }
    public Length getDiagonal1 () {
        return diagonal1;
    }
    public void setDiagonal1 (Length diagonal1) {
        this.diagonal1 = diagonal1;
    }
    public Length getDiagonal2 () {
        return diagonal1;
    }
    public void setDiagonal2 (Length diagonal1) {
        this.diagonal2 = diagonal2;
    }
    public String getTypeOfQuadrilateral () {
        return typeOfQuadrilateral;
    }
    public void setTypeOfQuadrilateral (String typeOfQuadrilateral) {
        this.typeOfQuadrilateral = typeOfQuadrilateral;
    }
    public String toString() {
        return "Quadrilateral {" + "A: " + a + ", B: " + b + ", C: " + c + ", D: " + d + ", Diagonal 1: " + diagonal1 + ", Diagonal 2: "+ diagonal2 + " " + typeOfQuadrilateral + "}";
    }
}
