package org.example;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void rotateLeft() {
        this.direction = direction.left();
    }

    public void rotateRight() {
        this.direction = direction.right();
    }

    public void moveForward() {
        this.x = direction.moveX(x);
        this.y = direction.moveY(y);
    }
    String tryMoveForward() {
        int nextX = direction.moveX(x);
        int nextY = direction.moveY(y);
        if (nextX >= 0 && nextX <= Main.plateauX && nextY >= 0 && nextY <= Main.plateauY) {
            return "OK";
        } else {
            return "Rover is out of bounds at coordinates: " + nextX + ", " + nextY;
        }
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

