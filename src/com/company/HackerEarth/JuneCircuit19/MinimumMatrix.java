package com.company.HackerEarth.JuneCircuit19;

import com.company.Code;

import java.util.ArrayList;
import java.util.Arrays;

import static com.company.HackerEarth.JuneCircuit19.Direction.*;

public class MinimumMatrix extends Code {

    private boolean[][] visited;
    private int m, n;
    private int maxVisitCount;
    private int visitCount;
    private int[] pos;
    private int[][] values;
    private Direction[][] movement;

    @Override
    protected String codeBody() {
        while (visitCount < maxVisitCount){
            if (move() == STUCK){
                break;
            }
        }
        setMovement(pos, STUCK);

        checkForCompleteTouch();
        printMovement();
        return null;
    }

    @Override
    protected void setInputs() {
        //set Size
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        m = Integer.parseInt(numbers[0]);
        n = Integer.parseInt(numbers[1]);

        //set Values
        values = new int[m][n];
        for (int i = 0; i < m; i++) {
            line = input.nextLine();
            numbers = line.split(" ");
            for (int j = 0; j < n; j++) {
                int number = Integer.parseInt(numbers[j]);
                values[i][j] = number;
            }
        }

        //init visited
        visited = new boolean[m][n];

        //init pos to start position
        pos = new int[]{0, 0};
        setVisited(pos);

        //init visitCount
        visitCount = 1;

        //init maxVisitCount
        maxVisitCount = m * n;

        //init movement
        movement = new Direction[m][n];
    }

    private int[] getPosition(Direction direction){
        return getPosition(pos, direction);
    }

    private int[] getPosition(int[] start, Direction direction){
        int x = start[0], y = start[1];
        if (direction == UP) {
            x--;
        } else if (direction == RIGHT){
            y++;
        } else if (direction == DOWN){
            x++;
        } else if (direction == LEFT){
            y--;
        }
        return new int[]{x, y};
    }

    private ArrayList<Path> getPossiblePaths(int[] position){
        ArrayList<Path> possiblePaths = new ArrayList<>();
        for (Direction dir: Direction.values()){
            if (dir != STUCK){
                int[] temp = getPosition(position, dir);
                if (notVisited(temp)){
                    int value = getValue(temp);
                    int outlets = getPossiblePathCount(temp);
                    boolean open = notVisited(getPosition(temp, dir));
                    boolean fitsCase2 = fitsCase2(temp, dir);
                    possiblePaths.add(new Path(value, outlets, open, fitsCase2, dir));
                }
            }
        }
        return possiblePaths;
    }

    private boolean fitsCase2(int[] position, Direction direction) {
        if (direction == LEFT || direction == RIGHT){
            for (int i = 0; i < m; i++) {
                int[] temp = new int[]{position[0], i};
                if (temp == position){
                    continue;
                }

                if (notVisited(temp)){
                    return false;
                }
            }
        } else if (direction == UP || direction == DOWN){
            for (int i = 0; i < n; i++) {
                int[] temp = new int[]{i, position[1]};
                if (temp == position){
                    continue;
                }

                if (notVisited(temp)){
                    return false;
                }
            }
        }
        return true;
    }

    private int getPossiblePathCount(int[] position){
        int count = 0;
        for (Direction dir: Direction.values()){
            if (dir != STUCK){
                int[] temp = getPosition(position, dir);
                if (notVisited(temp)){
                    count++;
                }
            }
        }
        return count;
    }

    private Direction getDirection(){

        ArrayList<Path> possiblePaths = getPossiblePaths(pos);
        if (possiblePaths.size() == 0){
            return STUCK;
        }

        //check for closed paths with single outlet
        for (Path path: possiblePaths){
            if (path.fitsCase1()){
                return path.dir;
            }
        }

        //check if open path is available
        boolean openPathAvailable = false;
        for (Path path: possiblePaths){
            if (path.open){
                openPathAvailable = true;
                break;
            }
        }

        //remove all closed path if open alternative is available
        if (openPathAvailable){
            for (int i = 0; i < possiblePaths.size(); i++) {
                if (possiblePaths.size() <= 1) break;
                Path path = possiblePaths.get(i);
                if (!path.open){
                    possiblePaths.remove(path);
                }
            }
        }

        //check for case2 free paths
        boolean case2FreePathAvailable = false;
        for (Path path: possiblePaths){
            if (!path.fitsCase2){
                case2FreePathAvailable = true;
                break;
            }
        }

        //remove all case2 paths if alternative path is available
        if (case2FreePathAvailable){
            for (int i = 0; i < possiblePaths.size(); i++) {
                if (possiblePaths.size() <= 1) break;
                Path path = possiblePaths.get(i);
                if (path.fitsCase2){
                    possiblePaths.remove(path);
                }
            }
        }

        //check for path with lowest value
        Path path = possiblePaths.get(0);
        for (int i = 1; i < possiblePaths.size(); i++) {
            if (possiblePaths.get(i).compareTo(path) < 0) {
                path = possiblePaths.get(i);
            }
        }
        return path.dir;
    }

    private Direction move(){
        Direction direction = getDirection();
        setMovement(pos, direction);
        pos = getPosition(direction);
        visitCount++;
        setVisited(pos);
        System.out.println(Arrays.toString(pos) + " ==> " + getValue(pos));
        return direction;
    }

    private int getValue(int[] pos){
        return values[pos[0]][pos[1]];
    }

    private boolean notVisited(int[] pos){
        try {
            return !visited[pos[0]][pos[1]];
        } catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    private void setVisited(int[] pos){
        visited[pos[0]][pos[1]] = true;
    }

    private void checkForCompleteTouch(){
        for (boolean[] line: visited){
            for (boolean touched: line){
                if (!touched) {
                    System.out.println("Error");
                    return;
                }
            }
        }
        System.out.println("Clean Matrix");
    }

    private void setMovement(int[] pos, Direction dir){
        movement[pos[0]][pos[1]] = dir;
    }

    private void printMovement(){
        for (Direction[] line : movement){
            System.out.println(Arrays.toString(line));
        }
    }
}
