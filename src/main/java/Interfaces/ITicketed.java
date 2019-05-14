package Interfaces;

import ThemeParkStuff.Visitor;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);
}
