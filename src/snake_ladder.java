public class snake_ladder {
    //constants
    public static final int No_Move = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static void main(String args[]){
        int player1Position, dieVal, playerOption,dieRollNo; //variables
        player1Position = 0;
        dieRollNo = 0;
        while(player1Position < 100){
            playerOption = (int) Math.floor(Math.random() * 10) % 3; //calculates die option
            switch (playerOption) {
                case No_Move:
                    System.out.println("Player doesnt move");
                    break;
                case Ladder:
                    dieRollNo++;
                    dieVal = (int) Math.floor(Math.random() * 10) % 6 + 1; //calculates die value

                    if(player1Position +dieVal>100){
                        System.out.println("The player doesnt move becasue he will exceed 100");
                        break;
                    }
                    else{
                        System.out.println("Player moves forward by " + dieVal + " positions");
                        player1Position += dieVal;
                    }
                    System.out.println("The player is at " + player1Position);
                    break;
                case Snake:
                    dieRollNo++;
                    dieVal = (int) Math.floor(Math.random() * 10) % 6 + 1; //calculates die value
                    System.out.println("Player moves back by " + dieVal + " positions");
                    player1Position -= dieVal;
                    if (player1Position < 0) {
                        player1Position = 0;
                    }
                    System.out.println("The player is at " + player1Position);
                    break;
            }
        }
        System.out.println("The no. of times the die rolled was "+dieRollNo);
    }
}
