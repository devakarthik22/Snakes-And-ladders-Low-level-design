import java.util.*;
public class SnakesnLadder_Board {
    private Dicehandler dice;
    private Queue<Playerdetails> players;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladder> ladders;
    private int boardsize;
    SnakesnLadder_Board(Dicehandler dice,Queue<Playerdetails> players,HashMap<Integer,Snakes> snakes,HashMap<Integer,Ladder> ladders,int boardsize){
        this.dice=dice;
        this.players=players;
        this.snakes=snakes;
        this.ladders=ladders;
        this.boardsize=boardsize;

    }
    public void startgame(){
        while(true){
            Playerdetails P=players.poll();
            int curr = P.getlocation();
            int next = curr + dice.rolldice();
            if (next <= boardsize) {
                if (snakes.containsKey(next)) {
                    System.out.println(P.getname() + " was bitten by a snake!");
                    Snakes snk = snakes.get(next);
                    next = snk.getendpoint();
                } else if (ladders.containsKey(next)) {
                    System.out.println(P.getname() + " climbed a Ladder!");
                    Ladder lad = ladders.get(next);
                    next = lad.getendpoint();
                }
                int t=curr;
                curr = next;
                P.setlocation(curr);
                System.out.println(P.getname() + " moved from " + t +" to "+curr);
                if (curr == boardsize) {
                    System.out.println();
                    System.out.println(P.getname() + " is the winner");
                    break;
                }

            }
            // adding at the end
            players.add(P);

        }


    }

    
}
