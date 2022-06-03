package com.curso.java;

public enum Brands {
    NULL(-1),
    BND_BGK(1),
    BND_CHL(2),
    BND_PRT(3),
    BND_ITL(4),
    BND_CHG(5),
    BND_STB(6),
    BND_CHF(7),
    BND_VPS(8),
    BND_DMN(9);

    private final Integer id;

    private Brands(Integer id) {
        this.id = id;
    }

    public Integer id() {
        return this.id;
    }
}
