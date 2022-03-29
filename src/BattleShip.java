import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
/**
    This class is the main logic for the BattleShip game
    @author Max Klot
 */
public class BattleShip
{
    public ArrayList<Ships> player1Ships = new ArrayList<>();
    public ArrayList<Ships> player2Ships = new ArrayList<>();
    public Ships player1Carrier;
    public Ships player2Carrier;
    public Ships player1Battleship;
    public Ships player2Battleship;
    public Ships player1Cruiser;
    public Ships player2Cruiser;
    public Ships player1Submarine;
    public Ships player2Submarine;
    public Ships player1Destroyer;
    public Ships player2Destroyer;
    public String player1Name = "";
    public String player2Name = "";
    public Board woo = new Board();
    public Scanner scan = new Scanner(System.in);
    private boolean player1won = false;
    private boolean player2won = false;

    private String player = "player1";

    /**
        This method starts the program and places the ships.
     */
    public void start()
    {



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
        System.out.println("Welcome to BattleShip! Play in darkmode and caps lock for full effect.");
        System.out.println("Player one name: ");
        this.player1Name = scan.nextLine();
        System.out.println("Player two name: ");
        this.player2Name = scan.nextLine();





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
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player1Carrier = new Ships(temp1, temp2, woo, "player1SelfBoard", "Carrier");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Battleship (4).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player1Battleship = new Ships(temp1, temp2, woo, "player1SelfBoard", "Battleship");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Cruiser (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player1Cruiser = new Ships(temp1, temp2, woo, "player1SelfBoard", "Cruiser");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Submarine (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player1Submarine = new Ships(temp1, temp2, woo, "player1SelfBoard", "Submarine");

        woo.printPlayer1SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Destroyer (2).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player1Destroyer = new Ships(temp1, temp2, woo, "player1SelfBoard", "Destroyer");
        woo.printPlayer1SelfBoard();

        player1Ships.add(player1Carrier);
        player1Ships.add(player1Battleship);
        player1Ships.add(player1Cruiser);
        player1Ships.add(player1Submarine);
        player1Ships.add(player1Destroyer);

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
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player2Carrier = new Ships(temp1, temp2, woo, "player2SelfBoard", "Carrier");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Battleship (4).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player2Battleship = new Ships(temp1, temp2, woo, "player2SelfBoard", "BattleShip");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Cruiser (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player2Cruiser = new Ships(temp1, temp2, woo, "player2SelfBoard", "Cruiser");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Submarine (3).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                if (Integer.parseInt(temp2.substring(1, temp2.length())) > 10 || (!temp2.substring(0, 1).equals("A")
                        && !temp2.substring(0, 1).equals("B")
                        && !temp2.substring(0, 1).equals("C")
                        && !temp2.substring(0, 1).equals("D")
                        && !temp2.substring(0, 1).equals("E")
                        && !temp2.substring(0, 1).equals("F")
                        && !temp2.substring(0, 1).equals("G")
                        && !temp2.substring(0, 1).equals("H")
                        && !temp2.substring(0, 1).equals("I")
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player2Submarine = new Ships(temp1, temp2, woo, "player2SelfBoard", "Submarine");

        woo.printPlayer2SelfBoard();
        temp2 = "";
        bool = true;
        bools = true;
        while (bools) {
            System.out.println("Pick the start of your Destroyer (2).");
            temp1 = scan.nextLine();
            while (bool) {
                int length = 0;
                if (Integer.parseInt(temp1.substring(1, temp1.length())) > 10 || (!temp1.substring(0, 1).equals("A")
                        && !temp1.substring(0, 1).equals("B")
                        && !temp1.substring(0, 1).equals("C")
                        && !temp1.substring(0, 1).equals("D")
                        && !temp1.substring(0, 1).equals("E")
                        && !temp1.substring(0, 1).equals("F")
                        && !temp1.substring(0, 1).equals("G")
                        && !temp1.substring(0, 1).equals("H")
                        && !temp1.substring(0, 1).equals("I")
                        && !temp1.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
                        && !temp2.substring(0, 1).equals("J")) || temp1.length() > 3) {
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
        player2Destroyer = new Ships(temp1, temp2, woo, "player2SelfBoard", "Destroyer");
        woo.printPlayer2SelfBoard();


        player2Ships.add(player2Carrier);
        player2Ships.add(player2Battleship);
        player2Ships.add(player2Cruiser);
        player2Ships.add(player2Submarine);
        player2Ships.add(player2Destroyer);
    }

    /*
        This method is reused to take a turn.
     */
    public void takeTurn()
    {
        if(player.equals(("player1")))
        {
            System.out.println("Your own board: ");
            woo.printPlayer1SelfBoard();
            System.out.println("Your guessing board: ");
            woo.printPlayer1opponentBoard();
            System.out.println(player1Name + ", Where would you like to shoot?");
            boolean bool = true;
            while (bool) {
                int rowIdx;
                int colIdx;
                String input = scan.nextLine();
                rowIdx = Ships.getRowIdx(input);
                colIdx = Integer.parseInt(input.substring(1, input.length()));
                if (Integer.parseInt(input.substring(1, input.length())) > 10 || (!input.substring(0, 1).equals("A")
                        && !input.substring(0, 1).equals("B")
                        && !input.substring(0, 1).equals("C")
                        && !input.substring(0, 1).equals("D")
                        && !input.substring(0, 1).equals("E")
                        && !input.substring(0, 1).equals("F")
                        && !input.substring(0, 1).equals("G")
                        && !input.substring(0, 1).equals("H")
                        && !input.substring(0, 1).equals("I")
                        && !input.substring(0, 1).equals("J")) || input.length() > 3) {
                    System.out.println("Invalid selection. Pick again.");
                }
                else if(woo.player2SelfBoard[rowIdx][colIdx].containsHit || woo.player2SelfBoard[rowIdx][colIdx].containsMiss)
                {
                    System.out.println("You've already shot there.");
                }
                else
                {
                    if (woo.player2SelfBoard[rowIdx][colIdx].containsShip)
                    {
                        woo.player2SelfBoard[rowIdx][colIdx].hit();
                        woo.player1opponentBoard[rowIdx][colIdx].hit();
                        System.out.println("Hit!");
                        System.out.println(whichShipSankP2());
                    }
                    else
                    {
                        woo.player1opponentBoard[rowIdx][colIdx].miss();
                        System.out.println("Miss!");
                    }
                    bool = false;
                }
            }
        }
        else if(player.equals("player2"))
        {
            System.out.println("Your own board: ");
            woo.printPlayer2SelfBoard();
            System.out.println("Your guessing board: ");
            woo.printPlayer2opponentBoard();
            System.out.println(player2Name + ", Where would you like to shoot?");
            boolean bool = true;
            while (bool) {
                int rowIdx;
                int colIdx;
                String input = scan.nextLine();
                rowIdx = Ships.getRowIdx(input);
                colIdx = Integer.parseInt(input.substring(1, input.length()));
                if (Integer.parseInt(input.substring(1, input.length())) > 10 || (!input.substring(0, 1).equals("A")
                        && !input.substring(0, 1).equals("B")
                        && !input.substring(0, 1).equals("C")
                        && !input.substring(0, 1).equals("D")
                        && !input.substring(0, 1).equals("E")
                        && !input.substring(0, 1).equals("F")
                        && !input.substring(0, 1).equals("G")
                        && !input.substring(0, 1).equals("H")
                        && !input.substring(0, 1).equals("I")
                        && !input.substring(0, 1).equals("J")) || input.length() > 3) {
                    System.out.println("Invalid selection. Pick again.");
                }
                else if(woo.player1SelfBoard[rowIdx][colIdx].containsHit || woo.player1SelfBoard[rowIdx][colIdx].containsMiss)
                {
                    System.out.println("You've already shot there.");
                }
                else
                {
                    if (woo.player1SelfBoard[rowIdx][colIdx].containsShip)
                    {
                        woo.player1SelfBoard[rowIdx][colIdx].hit();
                        woo.player2opponentBoard[rowIdx][colIdx].hit();
                        System.out.println("Hit!");
                        System.out.println(whichShipSankP1());

                    }
                    else
                    {
                        woo.player2opponentBoard[rowIdx][colIdx].miss();
                        System.out.println("Miss!");
                    }
                    bool = false;
                }
            }
        }
        if(player.equals("player1"))
        {
            player = "player2";
        }
        else if(player.equals("player2"))
        {
            player = "player1";
        }
    }

    /**
        Helper method to tell whether or not a ship has sunk.
        @returns If ship has sunk
     */
    public String whichShipSankP1()
    {

        String ret = "";
        for(Ships ship : player1Ships)
        {
            int count = 0;
            for(Space space : ship.getShip())
            {
                if(space.containsHit)
                {
                    count++;
                }
            }
            if(count == ship.getShip().size() && !ship.sunk)
            {
                ret = "You sunk their " + ship.getType();
                ship.sunk = true;
                return ret;
            }
        }
        return ret;
    }

    /**
        Helper method to tell whether or not a ship has sunk.
        @returns If ship has sunk
     */
    public String whichShipSankP2()
    {
        String ret = "";
        for(Ships ship : player2Ships)
        {
            int count = 0;
            for(Space space : ship.getShip())
            {
                if(space.containsHit)
                {
                    count++;
                }
            }
            if(count == ship.getShip().size() && !ship.sunk)
            {
                ret = "You sunk their " + ship.getType();
                ship.sunk = true;
                return ret;
            }
        }
        return ret;
    }

    /**
        Condensed logic for play.
     */
    public void play()
    {
        start();

        while(!player1won && !player2won)
        {
            takeTurn();
            if(checkifSunkPlayer1())
            {
                player2won = true;
            }
            else if(checkifSunkPlayer2())
            {
                player1won = true;
            }

        }
        if(player1won)
        {
            System.out.println(player1Name + " won!");
        }
        if(player2won)
        {
            System.out.println(player2Name + " won!");
        }
    }


    /**
        Helper method to see if game was won
        @returns whether or not game was won
     */
    public boolean checkifSunkPlayer1()
    {
        for(Ships ship : player1Ships)
        {
            for(Space space : ship.getShip())
            {
                if(!space.containsHit)
                {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     Helper method to see if game was won
     @returns whether or not game was won
     */
    public boolean checkifSunkPlayer2()
    {
        for(Ships ship : player2Ships)
        {
            for(Space space : ship.getShip())
            {
                if(!space.containsHit)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
