package com;

public class OverdraftException extends RuntimeException {
    private double deflcit;

    public OverdraftException(String message,double deflcit) {
        super(message);
        this.deflcit = deflcit;

    }

    public double getDeflcit() {
        return deflcit;
    }

}

