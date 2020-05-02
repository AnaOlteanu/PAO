package model;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    public int compare(Cat c1, Cat c2) {
        if(c1.getWeight() < c2.getWeight())
            return -1;
        if(c1.getWeight() > c2.getWeight())
            return 1;
        return 0;
    }
}
