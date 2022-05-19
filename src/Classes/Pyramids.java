package Classes;

import java.util.Arrays;

public class Pyramids {
    private Pyramid[] pyramids;

    public Pyramids(int length) {
        this.pyramids = new Pyramid[length];
    }

    public Pyramids() {
        pyramids = new Pyramid[0];
    }
    public Pyramid[] getPyramids() {
        return pyramids;
    }

    public void add(Pyramid pyramid) {
        int n = 0;
        for (Pyramid pyramid1 : pyramids) {
            if (pyramid1 == null) {
                break;
            } else {
                n++;
            }
        }
        if (pyramids.length == n) {
            resize(n + 1);
        }
        pyramids[n] = pyramid;
    }

    public Pyramid getMinSquare(){
        Pyramid result = pyramids[0];
        for (int i = 1; i < pyramids.length; i++) {
            if (result.getSquare() > pyramids[i].getSquare()){
                result = pyramids[i];
            }
        }
        return result;
    }

    public void resize(int newLength) {
        Pyramid[] tempPyramides = new Pyramid[newLength];
        tempPyramides = Arrays.copyOf(pyramids, newLength);
        pyramids = tempPyramides;
    }
    public String toString() {
        String result = "Pyramids :" + System.lineSeparator();
        for (Pyramid pyramid : pyramids) {
            result += pyramid + System.lineSeparator();
        }
        return result;
    }
}
