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
        Ships player1Carrier;
        Ships player2Carrier;
        Ships player1Battleship;
        Ships player2Battleship;
        Ships player1Cruiser;
        Ships player2Cruiser;
        Ships player1Submarine;
        Ships player2Submarine;
        Ships player1Destroyer;
        Ships player2Destroyer;

        String player = "player1";


        System.out.println(player1Name + ", you will now place your ships. Follow the directions; you will enter the spots of the start and end of your ship. Only place ships horizontally or vertically");
        woo.printPlayer1SelfBoard();
        String temp1 = "";
        String temp2 = "";
        boolean bool = true;
        boolean bools = true;
        while (bools) {
            System.out.println("Pick the start of your Carrier (5) ship.");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Carrier (5) ship.");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 5) {
                System.out.println("Your ship is not five units long!");
            } else {
                bools = false;
            }
        }
        player1Carrier = new Ships(temp1, temp2, woo, "player1SelfBoard");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Battleship (4).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Battleship (4).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 4) {
                System.out.println("Your ship is not four units long!");
            } else {
                bools = false;
            }
        }
        player1Battleship = new Ships(temp1, temp2, woo, "player1SelfBoard");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Cruiser (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Cruiser (3).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 3) {
                System.out.println("Your ship is not three units long!");
            } else {
                bools = false;
            }
        }
        player1Cruiser = new Ships(temp1, temp2, woo, "player1SelfBoard");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Submarine (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Submarine (3).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 3) {
                System.out.println("Your ship is not three units long!");
            } else {
                bools = false;
            }
        }
        player1Submarine = new Ships(temp1, temp2, woo, "player1SelfBoard");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Destroyer (2).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Destroyer (2).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 2) {
                System.out.println("Your ship is not two units long!");
            } else {
                bools = false;
            }
        }
        player1Destroyer = new Ships(temp1, temp2, woo, "player1SelfBoard");
        woo.printPlayer1SelfBoard();


        System.out.println(player2Name + ", you will now place your ships. Follow the directions; you will enter the spots of the start and end of your ship. Only place ships horizontally or vertically");
        woo.printPlayer2SelfBoard();
        temp1 = "";
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Carrier (5) ship.");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Carrier (5) ship.");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 7 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G"))
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J") || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 5) {
                System.out.println("Your ship is not five units long!");
            } else {
                bools = false;
            }
        }
        player2Carrier = new Ships(temp1, temp2, woo, "player2SelfBoard");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Battleship (4).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G"))
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J") || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Battleship (4).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G"))
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J") || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 4) {
                System.out.println("Your ship is not four units long!");
            } else {
                bools = false;
            }
        }
        player2Battleship = new Ships(temp1, temp2, woo, "player2SelfBoard");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Cruiser (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Cruiser (3).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G"))
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J") || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 3) {
                System.out.println("Your ship is not three units long!");
            } else {
                bools = false;
            }
        }
        player2Cruiser = new Ships(temp1, temp2, woo, "player2SelfBoard");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Submarine (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Submarine (3).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 7 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 3) {
                System.out.println("Your ship is not three units long!");
            } else {
                bools = false;
            }
        }
        player2Submarine = new Ships(temp1, temp2, woo, "player2SelfBoard");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Destroyer (2).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, 2)) > 7 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            System.out.println("Pick the end of your Destroyer (2).");
            bool = true;
            temp2 = scan.nextLine();
            while (bool) {
                if (Integer.parseInt(temp2.substring(1, 2)) > 7 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 2) {
                    System.out.println("Invalid selection. Pick again.");
                    temp1 = scan.nextLine();
                } else {
                    bool = false;
                }
            }
            if (Ships.shipLength(temp1, temp2) != 2) {
                System.out.println("Your ship is not two units long!");
            } else {
                bools = false;
            }
        }
        player2Destroyer = new Ships(temp1, temp2, woo, "player2SelfBoard");
        woo.printPlayer2SelfBoard();
    }



    public static void takeTurn()
    {

    }
}


