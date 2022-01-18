package task1;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{

    protected Random random;

    private final Integer[] arrayList;
    private final int currentSize;

    public Randoms(int min,int max){
        final int count = 100; // количество сгенерированных случайных чисел
        int i = 0;
        int diff = max - min;
        this.arrayList = new Integer[count + 1];
        random = new Random();
        while (i <= count){
            arrayList[i] = random.nextInt(diff + 1) + min;
            i++;
        }
        this.currentSize = arrayList.length;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Integer next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
