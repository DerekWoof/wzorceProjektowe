package pl.sdacademy.designpatterns.pl.sdacademy.designpatterns.duck.quack;


import pl.sdacademy.designpatterns.pl.sdacademy.designpatterns.duck.quack.Quack;

public abstract class Duck {
    private Quack quack;

    public Duck(Quack quack) {
        this.quack = quack;
    }

    public void quack() {
        quack.quack();
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }
}
