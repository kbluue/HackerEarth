package com.company.HackerEarth.JuneCircuit19;

import com.company.Code;

import java.util.*;
import java.util.stream.Collectors;

import static com.company.HackerEarth.JuneCircuit19.Direction.*;

public class MinimumMatrix extends Code implements Cloneable{

    private boolean[][] visited;
    private int maxVisitCount;
    private int visitCount;
    private int[] pos;
    private int[][] values;
    private Direction[][] movement;
    private List<MinimumMatrix> checkPoints;

    @Override
    protected String codeBody() {
        while (visitCount < maxVisitCount) {
            if (move() == STUCK) {
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

        //init movement
        movement = new Direction[m][n];

        //init checkpoints and add start point
        checkPoints = new ArrayList<>();
        saveCheckPoint();
    }

    private int[] getPosition(Direction direction) {
        return getPosition(pos, direction);
    }

    private int[] getPosition(int[] start, Direction direction) {
        int x = start[0], y = start[1];
        if (direction == UP) {
            x--;
        } else if (direction == RIGHT) {
            y++;
        } else if (direction == DOWN) {
            x++;
        } else if (direction == LEFT) {
            y--;
        }
        return new int[]{x, y};
    }

    private Set<Path> getPossiblePaths(int[] position) {
        Set<Path> possiblePaths = new HashSet<>();
        for (Direction dir : Direction.values()) {
            if (dir != STUCK) {
                int[] temp = getPosition(position, dir);
                if (notVisited(temp)) {
                    int degree = getDegree(temp, dir);
                    int outlets = getPossiblePathCount(temp);
                    int value = getValue(temp);
                    possiblePaths.add(new Path(value, outlets, degree, dir));
                }
            }
        }
        return possiblePaths;
    }

    private int getDegree(int[] position, Direction direction){
        int degree = 0;
        int[] temp = getPosition(position, direction);
        if (notVisited(temp)){
            degree++;
            temp = getPosition(position, direction);
            if (notVisited(temp)){
                degree++;
            }
        }
        return degree;
    }

    private int getPossiblePathCount(int[] position) {
        int count = 0;
        for (Direction dir : Direction.values()) {
            if (dir != STUCK) {
                int[] temp = getPosition(position, dir);
                if (notVisited(temp)) {
                    count++;
                }
            }
        }
        return count;
    }

    private Direction getDirection() {

        Set<Path> possiblePaths = getPossiblePaths(pos);

        //remove case 2s
        possiblePaths = clearCase2s(possiblePaths);

        //prioritize closed paths
        Set<Path> closedPaths = possiblePaths.stream()
                .filter(Path::isClosed)
                .collect(Collectors.toSet());

        if (closedPaths.size() > 0) {
            possiblePaths = closedPaths;
        } else {
//            prioritize degree3 paths
            Set<Path> d3Paths = possiblePaths.stream()
                    .filter(Path::isDegree3)
                    .collect(Collectors.toSet());

            if (!d3Paths.isEmpty()){
                possiblePaths = d3Paths;
            }
        }

        if (possiblePaths.size() == 0) {
            return STUCK;
        } else {
            //use path with lowest value
            return possiblePaths.stream()
                    .min(Path::compareTo)
                    .get().dir;
        }
    }

    private Set<Path> clearCase2s(Set<Path> paths) {
        return paths.parallelStream()
                .filter(path -> !path.fitsCase2())
                .collect(Collectors.toSet());
    }

    private boolean is2PointClear(Direction direction) {
        return true;
    }

    private Direction move() {
        Direction direction = getDirection();
        setMovement(pos, direction);
        pos = getPosition(direction);
        visitCount++;
        setVisited(pos);
        return direction;
    }

    private int getValue(int[] pos) {
        return values[pos[0]][pos[1]];
    }

    private boolean notVisited(int[] pos) {
        try {
            return !visited[pos[0]][pos[1]];
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private void setVisited(int[] pos) {
        visited[pos[0]][pos[1]] = true;
    }

    private void checkForCompleteTouch() {
        for (boolean[] line : visited) {
            for (boolean touched : line) {
                if (!touched) {
                    System.out.println("Error");
                    return;
                }
            }
        }
        System.out.println("Clean Matrix");
    }

    private void setMovement(int[] pos, Direction dir) {
        movement[pos[0]][pos[1]] = dir;
    }

    public void printMovement() {
        for (Direction[] line : movement) {
            System.out.println(Arrays.toString(line));
        }
        System.out.println("===============");
    }

    private void saveCheckPoint(){
    }

    private MinimumMatrix getLastCheckpoint(){
        if (checkPoints.size() == 1){
            System.out.println("clean version");
            return checkPoints.get(0);
        } else {
            return checkPoints.remove(checkPoints.size() - 1);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
