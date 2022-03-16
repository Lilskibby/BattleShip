public class Main
{
    public static void main(String[] args)
    {
        Board woo = new Board();
        woo.initializeAllBoards();
        Ships middle = new Ships("B2", "B4", woo, "player1SelfBoard", 3);
        woo.printPlayer1SelfBoard();
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
    }
}
