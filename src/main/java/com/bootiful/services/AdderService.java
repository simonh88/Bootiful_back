package com.bootiful.services;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    private int num;

    public void baseNum(int base) {
        this.num = base;
    }

    public int generateBase(){
        return this.num =  1 + (int)(Math.random() * 999);
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return this.num + adder;
    }

    public int accumulate(int adder) {
        return this.num += adder;
    }
}