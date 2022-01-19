package task1;

import java.util.*;

public class Randoms implements Iterable<Integer>{

    protected Random random;

    private List<Integer> list;

    public Randoms(int min,int max){
        list = new ArrayList<>();
        random = new Random();

        while (max > min) {
            list.add(max);
            max--;
        }

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
                return list.get(random.nextInt(list.size()));
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
