package com.bootcamp.demo;

import lombok.Getter;

@Getter
public enum Suit{
    DIAMOND("D",1), //
    CLUB("C",2), //
    HEART("H",3), //
    SPADE("S",4);

    private final String logo;
    private final int num;

    private Suit(String logo,int num){
        this.logo =logo;
        this.num=num;
    }
}


