import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Deck {
Random r = new Random();
Scanner eye = new Scanner(System.in);


        public String[] type = {"♠", "♣", "♥", "♦"};
        public   String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        public static String[] deck = new String[52];
        public static String[] board= new String [52];
        public static String[] p1d = new String [52];
        public static String[] p2d = new String [52];
    public static String [] p1  = new String[4];
    public static String [] p2  = new String[4];
    public static int b=4;
    public static String choice;
    public static String [] arr = new String[1];
    public static String [] jj = new String[1];
public static int g = 0;
public static String [] s2 = new String[1];
public static int n = 0;
public static int pıstı1=0;
public static int pıstı2=0;

   public void sss(){
       arr[0]="ss";
jj[0]="JJ";
       int n = 0;
    }
        public void createCards(){
            int a = 0;
            for(int i=0;i<4;i++){
                for(int j=0;j< 13;j++) {
                    deck[a] = type[i] + number[j];
                    a++;
                }
                }
            }


public void shuffle(){
            for(int i=0;i<deck.length;i++){
                int heo= r.nextInt(deck.length);
                String glass = deck [i];
                deck[i]   = deck [heo];
                deck[heo] = glass;
            }
}


    public void cutDeck(){

            int cut=r.nextInt(52);
           int c = cut;
           int x = cut;
           int l = 52 ;
           String [] deck2 = new String[52];
           for(int a =0;a<this.deck.length- cut-1 ;a++){
               deck2[a]=this.deck[c];
               c++;
           }
           for(int b =0;b< cut+1;b++){
               deck2[l-x-1]=this.deck[b];
               l++;

           }
        }



    public void dealCards(int a ){

            int d = 4+8*a  ;
            int c = 12+8*a ;
            int b = 0 ;
            int m = 0 ;
            for(int i=d;i<c;i++){
                if(i%2==0){
                    p1[b]= deck[i];
                    deck[i]=null  ;
                    b++;

                }
                else{
                    p2[m]=deck[i];
                    deck[i]=null;
                    m++;
                }
            }
           m=0;
           b=0;

        }
        public void giveBoard4(){
        for(int i=0;i<4;i++){
            board[i]=deck[i];
            deck[i]=null;
        }
        }
    public void showDeck(){  for(int i=0;i<52;i++){
        System.out.println(deck[i]);
    }}
public void showp1p2(){
            for(int i=0;i<4;i++){
                System.out.println(p1[i]+" "+ p2[i]);
            }
}
    public void createArrays (){
        for(int i=0;i<52;i++){
            board[i]="oo";
            p1d[i]="oo";
            p2d[i]="oo";
        }

        }
    public void p1turn () {

        System.out.println("1234");

        try{
            int c = eye.nextInt();
            choice = p1[c-1];
            board[b] = choice;
            p1[c-1]=null;}
        catch (Exception e){
            System.out.println("Please enter 1,2,3 or 4.");
            p1turn();
        }

if(board[b-1]!=null){

       if(choice.charAt(1)==board[b-1].charAt(1) && board[b-2]==null){
           pıstı1 ++;
           board[b]="oo";
           board[b-1]="oo";
           b++;
           System.out.println("******** Pişti *********");
       }
        else if(choice.charAt(1) ==board[b-1].charAt(1)) {
            b++;
            p1take();


        } else if (choice.charAt(1)==jj[0].charAt(1)) {
            b++;
            p1take();

        } else{b++;}


}

}
public void p1take(){
            for(int i= n;i<b;i++){

                    p1d[i] = board[i];
                    board[i]=null;
                    n=b;
                }
            }


public void p2take(){
    for(int i=n;i<b;i++){

            p2d[i] = board[i] ;
            board[i]=null     ;
            n=b;
        }
    }



public void p2turn(){
    if(board[b-1]!=null){
        if(p2[0].charAt(1)==board[b-1].charAt(1)){
            if( board[b-2]==null){
                pıstı2 ++;
                board[b]="oo";
                board[b-1]="oo";
                b++;
                System.out.println("******** Pişti *********");
            }else{
                board[b]=p2[0];
                p2[0]="ss";
            b++;
                p2take();

            }}
    else if(p2[1].charAt(1)==board[b-1].charAt(1)){
            if( board[b-2]==null){
                pıstı2 ++;
                board[b]="oo";
                board[b-1]="oo";
                b++;
                System.out.println("******** Pişti *********");
            }else {
                board[b] = p2[1];
                b++;
                p2take();

                p2[1] = "ss";
            }}

    else if(p2[2].charAt(1)==board[b-1].charAt(1)){
        if( board[b-2]==null){
            pıstı2 ++;
            board[b]="oo";
            board[b-1]="oo";
            b++;
            System.out.println("******** Pişti *********");
        }else {
            board[b] = p2[2];
            b++;
            p2take();

            p2[2] = "ss";
        }}

    else if(p2[3].charAt(1)==board[b-1].charAt(1)){
            if( board[b-2]==null){
                pıstı2 ++;
                board[b]="oo";
                board[b-1]="oo";
                b++;
                System.out.println("******** Pişti *********");
            }else{
        board[b]=p2[3] ;
            b++;
        p2take()       ;

        p2[3]="ss"     ;

    }}
else {

        if (p2[1].charAt(1) != arr[0].charAt(1)) {
            board[b] = p2[1];
            p2[1] = "ss";
            b++;
        } else if (p2[0].charAt(1) != arr[0].charAt(1)) {
            board[b] = p2[0];
            p2[0] = "ss";
            b++;
        } else if (p2[2].charAt(1) != arr[0].charAt(1)) {
            board[b] = p2[2];
            p2[2] = "ss";
            b++;
        } else if (p2[3].charAt(1) != arr[0].charAt(1)) {
            board[b] = p2[3];
            p2[3] = "ss";
            b++;
        }
    }}

   else{
       if (p2[1].charAt(1)!=arr[0].charAt(1)){
           board[b]=p2[1];
        p2[1]="ss";
        b++;
    }
    else if (p2[0].charAt(1)!=arr[0].charAt(1)){
           board[b]=p2[0];
        p2[0]="ss";
        b++;
    }
    else if (p2[2].charAt(1)!=arr[0].charAt(1)){
           board[b]=p2[2];
        p2[2]="ss";
        b++;
    }
    else if (p2[3].charAt(1)!=arr[0].charAt(1)){
           board[b]=p2[3];
        p2[3]="ss";
        b++;
    }

    }}








public void p2ControlJ(){
       if (board[b-2]!=null){
           if(board [b-1].charAt(1)==jj[0].charAt(1)){
               p2take();
           }
       else{}
       }


}










public void showp1(){
    System.out.println("your cards:       "+"  1."+p1[0]+"   2."+p1[1]+"   3."+p1[2]+"   4. "+p1[3]) ;
}

public void showBoard (){
            for(int i=0; i<b ;i++){
                if(board[i]!=null){
                    System.out.println(board[i]);
                }
                else{}
            }

}

public void showP1dP2d(){
    for(int i =0;i<52; i++){
        System.out.println(p1d [i]+"                     "+ p2d[i]);
}
}

    public void creatBoard(){
            for(int i=0;i<52;i++){
                board[i]="oo";
            }
}
    public void showp2(){
        System.out.println("computers Cards "+"  1."+p2[0]+"   2."+p2[1]+"   3."+p2[2]+"   4. "+p2[3]) ;
    }




    public int skorer1 (){
    int p1skore=0;
       for(int i =0;i<52;i++){

           if ( p1d[i].equals("♦10")){
               p1skore += 3;
           }
           else if (p1d[i].equals("♣2")){
               p1skore += 2;
           }
           else if (p1d[i].charAt(1)==jj[0].charAt(1)){
               p1skore += 1;
           }
       }

       return  p1skore;

    }


    public int skorer2 (){
        int p2skore=0;
        for(int i =0;i<52;i++){

            if ( p2d[i].equals("♦10")){
                p2skore += 3;
            }
            else if (p2d[i].equals("♣2")){
                p2skore += 2;
            }
            else if (p2d[i].charAt(1)==jj[0].charAt(1)){
                p2skore += 1;
            }
        }

        return  p2skore;

    }


    public void cardsCounter(){
      int count1= 0;
      int count2= 0;

      int p1skore = skorer1();
      int p2skore = skorer2();

       for(int i=0;i<52;i++){
           if(!p1d[i].equals("oo")){
               count1++;
           }
       }

        for(int i=0;i<52;i++){
            if(!p2d[i].equals("oo")){
                count2++;
            }
        }

        if(count1 > count2){
            p1skore += 3;
        }
        else if(count2 > count1){
            p2skore += 3;
        }
        System.out.println("Your Score :  "+p1skore+"               Computers Score :  "+p2skore);

        if(p1skore>p2skore){
            System.out.println("*****YOU WIN*****");
        }
        else if(p2skore>p1skore){
            System.out.println("*****YOU LOSE*****");
        }
        else {
            System.out.println("*****DRAW*****");
        }
    }

}

