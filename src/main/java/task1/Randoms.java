package task1;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{

    protected Random random;

    public Randoms(int min,int max){
    }

    @Override
    public Iterator<Integer> iterator() {


        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
    }
}
