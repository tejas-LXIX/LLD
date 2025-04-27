package lldquestions.snakeandladder;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

    Board board;
    Dice dice;
    Queue<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 7, 4);
        dice = new Dice(2);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        Player player3 = new Player("p3", 0);
        Player player4 = new Player("p4", 0);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
    }

    public void startGame() {
        System.out.println("\nSTARTING GAME NOW\n");
        while (winner == null) {
            Player nextPlayer = players.peek();
            System.out.println("Next player is: " + nextPlayer.getName() + ". current position is: " + nextPlayer.getCurrPos());

            int diceNo = dice.rollDice();

            int playerNewPosition = nextPlayer.getCurrPos() + diceNo;
            if (playerNewPosition > board.getCells().length * board.getCells().length - 1) {
                System.out.println("Invalid move since the player cannot cross 100");
                playerNewPosition = nextPlayer.getCurrPos();
            }
            playerNewPosition = jumpCheck(playerNewPosition);
            nextPlayer.setCurrPos(playerNewPosition);

            System.out.println("player turn is:" + nextPlayer.getName() + " new Position is: " + playerNewPosition);

            if(playerNewPosition >= board.getCells().length * board.getCells().length-1){
                winner = nextPlayer;
            }
            if (diceNo%6 != 0) {
                players.remove();
                players.add(nextPlayer);
            }

        }
        System.out.println("Game over. Winner is " + winner.getName());
        players.forEach(player -> System.out.println("Player: " + player.getName() + " is at " + player.getCurrPos()));
    }

    private int jumpCheck(int playerNewPosition) {
        Cell cell = board.getCell(playerNewPosition);
        if (cell.getJump() != null) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

}
