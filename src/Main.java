import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player1Name;
        String player2Name;
        Board woo = new Board();
        woo.initializeAllBoards();
        //NOTE: PLAY IN DARK MODE FOR FULL EFFECT.
        /*
        Board woo = new Board();
        woo.initializeAllBoards();
        Ships middle = new Ships("B2", "B4", woo, "player1SelfBoard", 3);
        woo.printPlayer1SelfBoard();
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
        woo.player1SelfBoard[4][5].hit();
        woo.player1SelfBoard[3][2].miss();
        woo.printPlayer1SelfBoard();
         */
        System.out.println("Welcome to BattleShip! Play in darkmode for full effect.");
        System.out.println("Player one name: ");
        player1Name = scan.nextLine();
        System.out.println("Player two name: ");
        player2Name = scan.nextLine();


        public void makeShips()
        {
            System.out.println(player1Name + ", you will now place your ships. Follow the directions; you will enter the spots of the start and end of your ship.");
            System.out.println("Pick the start of your largest (5) ship.");
            String temp1 = scan.nextLine();
            boolean bool = true;
            while (bool) {
                if (Integer.parseInt(temp1.substring(1, 2)) > 7 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your largest (5) ship.");
            bool = true;
            String temp2 = scan.nextLine();
            while (bool)
            {
                if (Integer.parseInt(temp1.substring(1, 2)) > 7 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            Ships player1Destroyer = new Ships(temp1, temp2, woo, "player1SelfBoard");
        }



    }
}
