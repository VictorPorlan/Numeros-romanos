package edu.pingpong;

public enum SimbolosRomanos {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000),
    IV(4), IX(9), XL(40), XC(90), CD(400), CM(900);

    private int valorDecimal;

    SimbolosRomanos(int valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public int getValorDecimal() {
        return valorDecimal;
    }
}
