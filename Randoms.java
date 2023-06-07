package ru.netology;

import java.util.Iterator;
//import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    //protected PrimitiveIterator.OfInt randomIterator;
    protected Random random;

    protected int min, max;


    public Randoms(int min, int max) {
//      randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }

    public Iterator<Integer> iterator() {
//      return new Iterator<>() {
        return new RandomsIterator();
    }


    public class RandomsIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            //для бесконечной итерации
            return true;
        }

        @Override
        public Integer next() {
//          return randomIterator.nextInt();
            random = new Random();
            int randomValue = random.nextInt(max + 1 - min) + min;
            return randomValue;
        }
    }
}

