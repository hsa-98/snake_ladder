public class snake_ladder {
    //constants
    public static final int No_Move = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static int play(int player1Position, String playername){
        int dieVal ,playerOption;

        playerOption = (int) Math.floor(Math.random() * 10) % 3; //calculates die option
        switch (playerOption) {
                case No_Move:
                    System.out.println(playername+" doesnt move");
                    break;
                case Ladder:
                    dieVal = (int) Math.floor(Math.random() * 10) % 6 + 1; //calculates die value

                    if(player1Position +dieVal>100){
                        System.out.println(playername+" doesnt move becasue he will exceed 100");
                        break;
                    }
                    else{
                        System.out.println(playername+" moves forward by " + dieVal + " positions");
                        player1Position += dieVal;
                    }
                    System.out.println(playername+" is at " + player1Position);
                    break;
                case Snake:
                    dieVal = (int) Math.floor(Math.random() * 10) % 6 + 1; //calculates die value
                    System.out.println(playername+" moves back by " + dieVal + " positions");
                    player1Position -= dieVal;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    System.out.println(playername+" is at " + player1Position);
                    break;
                default:
                    break;
        }
        return player1Position;
    }
    public static void main(String args[]){
        int player1Position,player2Position,dieRollNo1,dieRollNo2; //variables
        player1Position = player2Position = 0;
        dieRollNo1 = dieRollNo2 = 0;
        int turn = 0;
        while(player1Position < 100 && player2Position < 100){
            if(turn == 0){
                int temp = player1Position;
                player1Position= play(player1Position,"player1");
                if(player1Position <= temp){
                    turn=1;
                }

            }
            else{
                int temp2 = player2Position;
                player2Position = play(player2Position,"player2");
                if (player2Position<=temp2){
                    turn=0;
                }
            }

        }
        if (player1Position == 100){
            System.out.println("Player 1 won the game");
        }
        else{
            System.out.println("Player2 won the game");
        }
    }
}
