public class Board
{
    //printBoards
    public Space[][] player1SelfBoard = new Space[11][11];
    public Space[][] player1opponentBoard = new Space[11][11];
    public Space[][] player2SelfBoard = new Space[11][11];
    public Space[][] player2opponentBoard = new Space[11][11];

    public void initializeAllBoards()
    {
        for(int i = 0; i < player1SelfBoard.length; i++)
        {
            for(int j = 0; j < player1SelfBoard[i].length; j++)
            {
                player1SelfBoard[i][j] = new Space();
            }
        }
        for(int i = 0; i < player1opponentBoard.length; i++)
        {
            for(int j = 0; j < player1opponentBoard[i].length; j++)
            {
                player1opponentBoard[i][j] = new Space();
            }
        }
        for(int i = 0; i < player2SelfBoard.length; i++)
        {
            for(int j = 0; j < player2SelfBoard[i].length; j++)
            {
                player2SelfBoard[i][j] = new Space();
            }
        }
        for(int i = 0; i < player2opponentBoard.length; i++)
        {
            for(int j = 0; j < player2opponentBoard[i].length; j++)
            {
                player2opponentBoard[i][j] = new Space();
            }
        }
        player1SelfBoard[1][0] = new Space(" A ");
        player1SelfBoard[2][0] = new Space(" B ");
        player1SelfBoard[3][0] = new Space(" C ");
        player1SelfBoard[4][0] = new Space(" D ");
        player1SelfBoard[5][0] = new Space(" E ");
        player1SelfBoard[6][0] = new Space(" F ");
        player1SelfBoard[7][0] = new Space(" G ");
        player1SelfBoard[8][0] = new Space(" H ");
        player1SelfBoard[9][0] = new Space(" I ");
        player1SelfBoard[10][0] = new Space(" J ");

        player2SelfBoard[1][0] = new Space(" A ");
        player2SelfBoard[2][0] = new Space(" B ");
        player2SelfBoard[3][0] = new Space(" C ");
        player2SelfBoard[4][0] = new Space(" D ");
        player2SelfBoard[5][0] = new Space(" E ");
        player2SelfBoard[6][0] = new Space(" F ");
        player2SelfBoard[7][0] = new Space(" G ");
        player2SelfBoard[8][0] = new Space(" H ");
        player2SelfBoard[9][0] = new Space(" I ");
        player2SelfBoard[10][0] = new Space(" J ");
        player1opponentBoard[1][0] = new Space(" A ");
        player1opponentBoard[2][0] = new Space(" B ");
        player1opponentBoard[3][0] = new Space(" C ");
        player1opponentBoard[4][0] = new Space(" D ");
        player1opponentBoard[5][0] = new Space(" E ");
        player1opponentBoard[6][0] = new Space(" F ");
        player1opponentBoard[7][0] = new Space(" G ");
        player1opponentBoard[8][0] = new Space(" H ");
        player1opponentBoard[9][0] = new Space(" I ");
        player1opponentBoard[10][0] = new Space(" J ");
        player2opponentBoard[1][0] = new Space(" A ");
        player2opponentBoard[2][0] = new Space(" B ");
        player2opponentBoard[3][0] = new Space(" C ");
        player2opponentBoard[4][0] = new Space(" D ");
        player2opponentBoard[5][0] = new Space(" E ");
        player2opponentBoard[6][0] = new Space(" F ");
        player2opponentBoard[7][0] = new Space(" G ");
        player2opponentBoard[8][0] = new Space(" H ");
        player2opponentBoard[9][0] = new Space(" I ");
        player2opponentBoard[10][0] = new Space(" J ");

        player1SelfBoard[0][1] = new Space(" 1 ");
        player1SelfBoard[0][2] = new Space(" 2 ");
        player1SelfBoard[0][3] = new Space(" 3 ");
        player1SelfBoard[0][4] = new Space(" 4 ");
        player1SelfBoard[0][5] = new Space(" 5 ");
        player1SelfBoard[0][6] = new Space(" 6 ");
        player1SelfBoard[0][7] = new Space(" 7 ");
        player1SelfBoard[0][8] = new Space(" 8 ");
        player1SelfBoard[0][9] = new Space(" 9 ");
        player1SelfBoard[0][10] = new Space(" 10 ");
        player2SelfBoard[0][1] = new Space(" 1 ");
        player2SelfBoard[0][2] = new Space(" 2 ");
        player2SelfBoard[0][3] = new Space(" 3 ");
        player2SelfBoard[0][4] = new Space(" 4 ");
        player2SelfBoard[0][5] = new Space(" 5 ");
        player2SelfBoard[0][6] = new Space(" 6");
        player2SelfBoard[0][7] = new Space(" 7 ");
        player2SelfBoard[0][8] = new Space(" 8 ");
        player2SelfBoard[0][9] = new Space(" 9 ");
        player2SelfBoard[0][10] = new Space(" 10 ");
        player1opponentBoard[0][1] = new Space(" 1 ");
        player1opponentBoard[0][2] = new Space(" 2 ");
        player1opponentBoard[0][3] = new Space(" 3 ");
        player1opponentBoard[0][4] = new Space(" 4 ");
        player1opponentBoard[0][5] = new Space(" 5 ");
        player1opponentBoard[0][6] = new Space(" 6");
        player1opponentBoard[0][7] = new Space(" 7 ");
        player1opponentBoard[0][8] = new Space(" 8 ");
        player1opponentBoard[0][9] = new Space(" 9 ");
        player1opponentBoard[0][10] = new Space(" 10 ");
        player2opponentBoard[0][1] = new Space(" 1 ");
        player2opponentBoard[0][2] = new Space(" 2 ");
        player2opponentBoard[0][3] = new Space(" 3 ");
        player2opponentBoard[0][4] = new Space(" 4 ");
        player2opponentBoard[0][5] = new Space(" 5 ");
        player2opponentBoard[0][6] = new Space(" 6");
        player2opponentBoard[0][7] = new Space(" 7 ");
        player2opponentBoard[0][8] = new Space(" 8 ");
        player2opponentBoard[0][9] = new Space(" 9 ");
        player2opponentBoard[0][10] = new Space(" 10 ");


    }

    public void printPlayer1SelfBoard()
    {
        for(Space[] spaces : player1SelfBoard)
        {
            for(Space space : spaces)
            {
                System.out.print("|" + space);
            }
            System.out.println("|");
            System.out.println("---------------------------------------------");

        }
    }

    public void printPlayer2SelfBoard()
    {
        for(Space[] spaces : player2SelfBoard)
        {
            for(Space space : spaces)
            {
                System.out.print("|" + space);
            }
            System.out.println("|");
            System.out.println("---------------------------------------------");

        }
    }



}
