package chess;

public class Rook {

    private int x, y;
    private char symbol;
    private String color;

    Rook(int a, int b, String d) {
        this.x = a;
        this.y = b;
        this.color = d;
        if (this.color.equals("white")) {
            this.symbol = '♖';
        } else if (this.color.equals("black")) {
            this.symbol = '♜';
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getColor() {
        return color;
    }
}
