public class snake_ladder {
    //constants
    public static final int No_Move = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static void main(String args[]){
        int player1Position; //position of player
        player1Position = 0;
        int dieVal; //value of die
        dieVal = (int)Math.floor(Math.random()*10)%6 +1; //calculates die value
        int playerOption; //the option player gets
        playerOption = (int)Math.floor(Math.random()*10)%3; //calculates die option
        switch (playerOption){
            case No_Move:
                System.out.println("Player doesnt move");
                break;
            case Ladder:
                System.out.println("Player moves forward by " +dieVal+" positions");
                player1Position+=dieVal;
                System.out.println("The player is at " +player1Position);
                break;
            case Snake:
                System.out.println("Player moves back by " +dieVal + " positions");
                player1Position-=dieVal;
                if(player1Position<0){
                    player1Position=0;
                }
                System.out.println("The player is at " +player1Position);
                break;
        }
    }
}
