import java.util.*;

public class Startgame {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to the Game!");

        System.out.println("Enter Size of the board");
        int Size = sc.nextInt();

        System.out.println("Enter number of dices you want to play with:");
        int noOfDice = sc.nextInt();

        Dicehandler dice = new Dicehandler(noOfDice);

        System.out.println("Enter No of Ladders");
        int noOfLadders = sc.nextInt();
        System.out.println("Please Be make sure that ladder coordinates must be less than or equal to "+Size+" !");

        HashMap<Integer, Ladder> ladderMap = new HashMap<Integer, Ladder>();
        sc.nextLine();
        while (noOfLadders-- > 0) {
            String[] arr = sc.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Ladder ladder = new Ladder(st, en);
            ladderMap.put(st, ladder);
        }

        System.out.println("Enter No of Snakes");
        int noOfSnakes = sc.nextInt();
        System.out.println("Please Be make sure that Snakes coordinates must be less than or equal to "+Size+" !");

        HashMap<Integer, Snakes> snakeMap = new HashMap<Integer, Snakes>();
        sc.nextLine();
        while (noOfSnakes-- > 0) {
            String[] arr =sc.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Snakes snake = new Snakes(st, en);
            snakeMap.put(st, snake);
        }



        Queue<Playerdetails> players = new LinkedList<Playerdetails>();

        System.out.println("Enter number of players: ");
        int noOfPlayers = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Players Names below");
        while (noOfPlayers-- > 0) {
            String name = sc.nextLine();
            Playerdetails p = new Playerdetails(name);
            players.add(p);
        }

        SnakesnLadder_Board board = new SnakesnLadder_Board(dice,players,snakeMap,ladderMap,Size);
        board.startgame();


    }
    
}
