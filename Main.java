
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[]args) {

        Deck deck = new Deck();

        deck.createCards();
        deck.shuffle();
        deck.cutDeck();
        deck.createArrays();
        deck.creatBoard();
        deck.giveBoard4();



            deck.dealCards(0);
            deck.sss();
            deck.showp1p2();
            deck.showp1();
            deck.showBoard();
                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.dealCards(1);
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.dealCards(2);
        deck.showp1();
                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.dealCards(3);
        deck.showp1();
                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.dealCards(4);
        deck.showp1();
                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.dealCards(5);
        deck.showp1();
                         deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.p1turn();
            deck.p2turn();deck.p2ControlJ();
            deck.showp1();
            deck.showBoard();

            deck.p1turn();
            deck.p2turn();

            // I tried to put on a loop these repeated codes but it cause a problem for dealcards method.

            System.out.println("oooooooooooooooooooooooooooooooooooooooooooooo1" );



            deck.cardsCounter();


            try {
                FileWriter writer = new FileWriter("Scores.txt");
                int score1 = deck.skorer1();
                writer.write(score1 + "\n");
                writer.close();
            }
            catch (IOException e){
                System.out.println("File error");
                e.printStackTrace();
            }

        }
    }

