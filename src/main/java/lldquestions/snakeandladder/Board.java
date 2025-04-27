package lldquestions.snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell[][] cells;

    Board(int n, int noOfSnakes, int noOfLadders) {
        initializeCells(n);
        initializeSnakesAndLadders(noOfSnakes, noOfLadders);
    }

    private void initializeSnakesAndLadders(int noOfSnakes, int noOfLadders) {
        while (noOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (snakeTail >= snakeHead) {
                continue;
            }

            Jump snake = new Jump(snakeHead, snakeTail);

            Cell cell = getCell(snakeHead);
            cell.jump = snake;
            System.out.println("snake is at: " + snakeHead);

            noOfSnakes--;
        }
        while (noOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (ladderStart >= ladderEnd || getCell(ladderStart).getJump() != null) {
                continue;
            }

            Jump ladder = new Jump(ladderStart, ladderEnd);

            Cell cell = getCell(ladderStart);
            cell.jump = ladder;
            System.out.println("ladder is at: " + ladderStart);

            noOfLadders--;

        }
    }

    private void initializeCells(int n) {
        cells = new Cell[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int position) {
        int row = position / cells.length;
        int column = position % cells.length;
        if (row < cells.length && column < cells.length) {
            return cells[row][column];
        }
        throw new RuntimeException("invalid position");
    }

    public Cell[][] getCells() {
        return cells;
    }
}
