package com.company.HackerEarth.JuneCircuit19;

import com.company.Code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import static com.company.HackerEarth.JuneCircuit19.Direction.*;

public class MinimunMatrix extends Code {

    private boolean[][] visited;
    private int maxVisitCount;
    private int visitCount;
    private int[] pos;
    private int[][] values;

    @Override
    protected String codeBody() {
        while (visitCount < maxVisitCount){
            move();
        }
        return null;
    }

    @Override
    protected void setInputs() {
        //set Size
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        int m = Integer.parseInt(numbers[0]);
        int n = Integer.parseInt(numbers[1]);

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

    private Direction getDirection(){

        Direction direction = STUCK;
        int minValue = -1;
        HashMap<Direction, Integer> possibleDirections = new HashMap<>();

        for (Direction dir : Direction.values()){
            if (dir != STUCK){
                int[] temp = getPosition(dir);
                if (!hasBeenVisited(temp)){
                    possibleDirections.put(dir, getValue(temp));

                    int cellValue = getValue(temp);
                    if (minValue == -1 || cellValue < minValue){
                        minValue = cellValue;
                        direction = dir;
                    }
                }
            }
        }

        //handling edges
        if (possibleDirections.size() == 2){

        } else {
            possibleDirections.values().stream().min();
            return possibleDirections.ke
        }

        return direction;
    }

    private void move(){
        Direction direction = getDirection();
        pos = getPosition(direction);
        visitCount++;
        setVisited(pos);
        System.out.println(Arrays.toString(pos) + " ==> " + getValue(pos));
    }

    private int getValue(int[] pos){
        return values[pos[0]][pos[1]];
    }

    private boolean hasBeenVisited(int[] pos){
        try {
            return visited[pos[0]][pos[1]];
        } catch (IndexOutOfBoundsException e){
            return true;
        }
    }

    private void setVisited(int[] pos){
        visited[pos[0]][pos[1]] = true;
    }
}
