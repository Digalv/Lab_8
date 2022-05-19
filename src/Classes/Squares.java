package Classes;

import java.util.Arrays;

public class Squares {
    private Square[] squares;

    public Squares(int length) {
        this.squares = new Square[length];
    }

    public Squares() {
        squares = new Square[0];
    }

    public void add(Square square) {
        int n = 0;
        for (Square square1 : squares) {
            if (square1 == null) {
                break;
            } else {
                n++;
            }
        }
        if (squares.length == n) {
            resize(n + 1);
        }
        squares[n] = square;
    }

    public void resize(int newLength) {
        Square[] tempSquares = new Square[newLength];
        tempSquares = Arrays.copyOf(squares, newLength);
        squares = tempSquares;
    }

    public float getAvgS(){
        float sum = 0;
        for(Square square: squares){
            sum+= square.getSquare();
        }
        return sum/ squares.length;
    }


    @Override
    public String toString() {
        String result = "Square :" + System.lineSeparator();
        for (Square square : squares) {
            result += square + System.lineSeparator();
        }
        return result;
    }
}
