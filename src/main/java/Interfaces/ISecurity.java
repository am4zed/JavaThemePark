package Interfaces;

import ThemeParkStuff.Visitor;

public interface ISecurity {
    boolean isAllowedTo(Visitor visitor);
}
