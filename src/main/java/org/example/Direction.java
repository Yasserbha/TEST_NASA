package org.example;

public enum Direction {
    N {
        Direction left() { return W; }
        Direction right() { return E; }
        int moveY(int y) { return y + 1; }
    },
    E {
        Direction left() { return N; }
        Direction right() { return S; }
        int moveX(int x) { return x + 1; }
    },
    S {
        Direction left() { return E; }
        Direction right() { return W; }
        int moveY(int y) { return y - 1; }
    },
    W {
        Direction left() { return S; }
        Direction right() { return N; }
        int moveX(int x) { return x - 1; }
    };

    int moveX(int x) { return x; }
    int moveY(int y) { return y; }

    Direction left() { return this; }
    Direction right() { return this; }
}
