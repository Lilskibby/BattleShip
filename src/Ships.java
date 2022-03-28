import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ships
{
    private String type;

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }

    private boolean sunk;

    public ArrayList<Space> getShip() {
        return Ship;
    }

    ArrayList<Space> Ship = new ArrayList<>();

    public Ships(String spaceFrom, String spaceTo, Board board, String board1, String type)
    {
        this.type = type;
        int index1row = 0;
        int index1col = Integer.parseInt(spaceFrom.substring(1, spaceFrom.length()));
        String temp = spaceFrom.substring(0, 1);
        if(temp.equals("A"))
        {
            index1row = 1;
        }
        if(temp.equals("B"))
        {
            index1row = 2;
        }
        if(temp.equals("C"))
        {
            index1row = 3;
        }
        if(temp.equals("D"))
        {
            index1row = 4;
        }
        if(temp.equals("E"))
        {
            index1row = 5;
        }
        if(temp.equals("F"))
        {
            index1row = 6;
        }
        if(temp.equals("G"))
        {
            index1row = 7;
        }
        if(temp.equals("H"))
        {
            index1row = 8;
        }
        if(temp.equals("I"))
        {
            index1row = 9;
        }
        if(temp.equals("J"))
        {
            index1row = 10;
        }
        int index2row = 0;
        int index2col = Integer.parseInt(spaceTo.substring(1, spaceTo.length()));
        temp = spaceTo.substring(0, 1);
        if(temp.equals("A"))
        {
            index2row = 1;
        }
        if(temp.equals("B"))
        {
            index2row = 2;
        }
        if(temp.equals("C"))
        {
            index2row = 3;
        }
        if(temp.equals("D"))
        {
            index2row = 4;
        }
        if(temp.equals("E"))
        {
            index2row = 5;
        }
        if(temp.equals("F"))
        {
            index2row = 6;
        }
        if(temp.equals("G"))
        {
            index2row = 7;
        }
        if(temp.equals("H"))
        {
            index2row = 8;
        }
        if(temp.equals("I"))
        {
            index2row = 9;
        }
        if(temp.equals("J"))
        {
            index2row = 10;
        }
        switch (board1)
        {
            case "player1SelfBoard":

                if(index1col == index2col)
                {
                    for (int i = index1row; i <= index2row; i++) {
                        board.player1SelfBoard[i][index1col] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player1SelfBoard[i][index1col].containsShip = true;
                        Ship.add(board.player1SelfBoard[i][index1col]);
                    }
                }
                else
                {
                    for (int i = index1col; i <= index2col; i++)
                    {
                        board.player1SelfBoard[index1row][i] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player1SelfBoard[index1row][i].containsShip = true;
                        Ship.add(board.player1SelfBoard[index1row][i]);
                    }
                }
                break;
            case "player2SelfBoard":
                if(index1col == index2col)
                {
                    for (int i = index1row; i <= index2row; i++) {
                        board.player2SelfBoard[i][index1col] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player2SelfBoard[i][index1col].containsShip = true;
                        Ship.add(board.player1SelfBoard[i][index1col]);
                    }
                }
                else
                {
                    for (int i = index1col; i <= index2col; i++)
                    {
                        board.player2SelfBoard[index1row][i] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player2SelfBoard[index1row][i].containsShip = true;
                        Ship.add(board.player1SelfBoard[index1row][i]);
                    }
                }
                break;
            case "player1opponentBoard":
                if(index1col == index2col)
                {
                    for (int i = index1row; i <= index2row; i++) {
                        board.player1opponentBoard[i][index1col] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player1opponentBoard[i][index1col].containsShip = true;
                        Ship.add(board.player1SelfBoard[i][index1col]);
                    }
                }
                else
                {
                    for (int i = index1col; i <= index2col; i++)
                    {
                        board.player1opponentBoard[index1row][i] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player1opponentBoard[index1row][i].containsShip = true;
                        Ship.add(board.player1SelfBoard[index1row][i]);
                    }
                }

                break;
            case "player2opponentBoard":
                if(index1col == index2col)
                {
                    for (int i = index1row; i <= index2row; i++) {
                        board.player2opponentBoard[i][index1col] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player2opponentBoard[i][index1col].containsShip = true;
                        Ship.add(board.player1SelfBoard[i][index1col]);
                    }
                }
                else
                {
                    for (int i = index1col; i <= index2col; i++)
                    {
                        board.player2opponentBoard[index1row][i] = new Space("" + ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET);
                        board.player2opponentBoard[index1row][i].containsShip = true;
                        Ship.add(board.player1SelfBoard[index1row][i]);
                    }
                }

                break;
        }
    }

    public static int getRowIdx(String temp)
    {
        temp = temp.substring(0, 1);
        int index1row = 0;
        if(temp.equals("A"))
        {
            index1row = 1;
        }
        if(temp.equals("B"))
        {
            index1row = 2;
        }
        if(temp.equals("C"))
        {
            index1row = 3;
        }
        if(temp.equals("D"))
        {
            index1row = 4;
        }
        if(temp.equals("E"))
        {
            index1row = 5;
        }
        if(temp.equals("F"))
        {
            index1row = 6;
        }
        if(temp.equals("G"))
        {
            index1row = 7;
        }
        if(temp.equals("H"))
        {
            index1row = 8;
        }
        if(temp.equals("I"))
        {
            index1row = 9;
        }
        if(temp.equals("J"))
        {
            index1row = 10;
        }
        return index1row;
    }

    public static int shipLength(String spaceFrom, String spaceTo)
    {
        int index1row = 0;
        int index1col = Integer.parseInt(spaceFrom.substring(1, spaceFrom.length()));
        String temp = spaceFrom.substring(0, 1);
        if(temp.equals("A"))
        {
            index1row = 1;
        }
        if(temp.equals("B"))
        {
            index1row = 2;
        }
        if(temp.equals("C"))
        {
            index1row = 3;
        }
        if(temp.equals("D"))
        {
            index1row = 4;
        }
        if(temp.equals("E"))
        {
            index1row = 5;
        }
        if(temp.equals("F"))
        {
            index1row = 6;
        }
        if(temp.equals("G"))
        {
            index1row = 7;
        }
        if(temp.equals("H"))
        {
            index1row = 8;
        }
        if(temp.equals("I"))
        {
            index1row = 9;
        }
        if(temp.equals("J"))
        {
            index1row = 10;
        }
        int index2row = 0;
        int index2col = Integer.parseInt(spaceTo.substring(1, spaceTo.length()));
        temp = spaceTo.substring(0, 1);
        if(temp.equals("A"))
        {
            index2row = 1;
        }
        if(temp.equals("B"))
        {
            index2row = 2;
        }
        if(temp.equals("C"))
        {
            index2row = 3;
        }
        if(temp.equals("D"))
        {
            index2row = 4;
        }
        if(temp.equals("E"))
        {
            index2row = 5;
        }
        if(temp.equals("F"))
        {
            index2row = 6;
        }
        if(temp.equals("G"))
        {
            index2row = 7;
        }
        if(temp.equals("H"))
        {
            index2row = 8;
        }
        if(temp.equals("I"))
        {
            index2row = 9;
        }
        if(temp.equals("J"))
        {
            index2row = 10;
        }

        if(index1col == index2col)
        {
            return index2row - index1row + 1;
        }
        else if(index1row == index2row)
        {
            return index2col - index1col + 1;
        }
        return 0;
    }

    public String getType() {
        return type;
    }
}
