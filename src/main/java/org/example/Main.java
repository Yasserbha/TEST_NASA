package org.example;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static int plateauX;
    public static int plateauY;
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(inputFile);
             plateauX = scanner.nextInt();
             plateauY = scanner.nextInt();
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String[] pos = scanner.nextLine().split(" ");
                Rover rover = new Rover(Integer.parseInt(pos[0]), Integer.parseInt(pos[1]), Direction.valueOf(pos[2]));
                char[] moves = scanner.nextLine().toCharArray();
                for (char move : moves) {
                    switch (move) {
                        case 'L': rover.rotateLeft(); break;
                        case 'R': rover.rotateRight(); break;
                        case 'M':
                            String moveResult = rover.tryMoveForward();
                            if ("OK".equals(moveResult)) {
                                rover.moveForward();
                            } else {
                                System.out.println(moveResult);
                            }
                            break;
                    }
                }
                System.out.println(rover);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}