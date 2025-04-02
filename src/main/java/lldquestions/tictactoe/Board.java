package lldquestions.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;

    public PlayingPiece[][] playingBoard;

    public Board(int size) {
        this.size = size;
        playingBoard = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getPlayingBoard() {
        return playingBoard;
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        if (playingBoard[row][column] != null) {
            return false;
        }
        playingBoard[row][column] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                if (playingBoard[i][j]==null) {
                    freeCells.add(new Pair<>(i,j));
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            String row = "";
            for (int j = 0; j < size; j++) {
                if (playingBoard[i][j] == null) {
                    row = row + "\t" + "|";
                } else {
                    row = row + playingBoard[i][j] + "\t" + "|";
                }
            }
            System.out.println(row.substring(0, row.length()-1));
        }
    }

}
