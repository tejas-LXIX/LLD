package lldquestions.tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    private Deque<Player> players;  //deque because whenever a player completes their turn, they will be removed from the front of the queue and added to the end.

    private Board board;

    TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX xPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", xPiece);

        PlayingPieceO oPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", oPiece);

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player currentPlayer = players.removeFirst();
            board.printBoard();

            List<Pair<Integer, Integer>> freeSpaces = board.getFreeCells();
            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player: " + currentPlayer.getUserName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = board.addPiece(inputRow, inputColumn, currentPlayer.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect position chosen, please try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            boolean winner = isThereWinner(inputRow, inputColumn, currentPlayer.getPlayingPiece().getPieceType());
            if (winner) {
                board.printBoard();
                return currentPlayer.getUserName();
            }

        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i<board.getSize();i++) {
            if(board.playingBoard[row][i] == null || pieceType != board.playingBoard[row][i].getPieceType()) {
                rowMatch = false;
            }
        }

        for(int i=0;i<board.getSize();i++) {
            if(board.playingBoard[i][column] == null || pieceType != board.playingBoard[i][column].getPieceType()) {
                columnMatch = false;
            }
        }

        for(int i=0,j=0;i<board.getSize();i++,j++) {
            if(board.playingBoard[i][i] == null || pieceType != board.playingBoard[i][j].getPieceType()) {
                diagonalMatch = false;
            }
        }

        for(int i=0,j=board.getSize()-1;i<board.getSize();i++,j--) {
            if(board.playingBoard[i][j] == null || pieceType != board.playingBoard[i][j].getPieceType()) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }

}
