package homework1;

import java.util.Scanner;

public class TicTacToeGame {
    public static String[][] ticTacToe;
    public static int flag0,flagX,flagwin,step;
    public static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            ticTacToeInit();
            if(Math.random()<0.5)ticTacToe0turn();
            else ticTacToeXturn();
//            Scanner in=new Scanner(System.in);
            System.out.println("Do you want to go on? ( y or n )");
            if(in.next().charAt(0)=='n'){
//                in.close();
                break;
            }
//            in.close();
        }
        in.close();
    }

    public static void ticTacToePrint(String[][] pieces){
        if(pieces.length!=3||pieces[0].length!=3)
        throw new IllegalArgumentException("The length of pieces is not three!");
        System.out.println(
        "-------------\n"+
        "| "+pieces[0][0]+" | "+pieces[0][1]+" | "+pieces[0][2]+" |\n"+
        "-------------\n"+
        "| "+pieces[1][0]+" | "+pieces[1][1]+" | "+pieces[1][2]+" |\n"+
        "-------------\n"+
        "| "+pieces[2][0]+" | "+pieces[2][1]+" | "+pieces[2][2]+" |\n"+
        "-------------");
        return;
    }

    public static void ticTacToeInit(){
        ticTacToe=new String[][]{
            {" "," "," "},
            {" "," "," "},
            {" "," "," "}
        };
        flag0=0;
        flagX=0;
        flagwin=0;
        step=0;
        return;
    }

    public static void ticTacToe0(int x, int y){
        if(x<0||x>2||y<0||y>2)
        throw new IllegalArgumentException("The number must be 1, 2, or 3!");
        ticTacToe[x][y]="0";
        step++;
        return;
    }

    public static void ticTacToeX(int x, int y){
        if(x<0||x>2||y<0||y>2)
        throw new IllegalArgumentException("The number must be 1, 2, or 3!");
        ticTacToe[x][y]="X";
        step++;
        return;
    }

    public static void ticTacToe0turn(){
        ticTacToePrint(ticTacToe);
//        Scanner in=new Scanner(System.in);
        System.out.print("Enter a row (1, 2, or 3) for player 0: ");
        int row=in.nextInt();
        System.out.print("Enter a column (1, 2, or 3) for player 0: ");
        int column=in.nextInt();
//        in.close();
        if(row<1||row>3||column<1||column>3)
        {
            System.out.println("Error! The number must be 1, 2, or 3.");
            ticTacToe0turn();
        }
        if(ticTacToe[row-1][column-1]==" ")ticTacToe0(row-1, column-1);
        else
        {
            System.out.println("Error! Please chosse the space one.");
            ticTacToe0turn();
        }
        ticTacToeGameVictory();
        if(flagwin==1)return;
        else if(step==9)return;
        else ticTacToeXturn();
        return;
    }

    public static void ticTacToeXturn(){
        ticTacToePrint(ticTacToe);
//        Scanner in=new Scanner(System.in);
        System.out.print("Enter a row (1, 2, or 3) for player X: ");
        int row=in.nextInt();
        System.out.print("Enter a column (1, 2, or 3) for player X: ");
        int column=in.nextInt();
//        in.close();
        if(row<1||row>3||column<1||column>3)
        {
            System.out.println("Error! The number must be 1, 2, or 3.");
            ticTacToeXturn();
        }
        if(ticTacToe[row-1][column-1]==" ")ticTacToeX(row-1, column-1);
        else
        {
            System.out.println("Error! Please chosse the space one.");
            ticTacToeXturn();
        }
        ticTacToeGameVictory();
        if(flagwin==1)return;
        else if(step==9)return;
        else ticTacToe0turn();
        return;
    }

    public static void ticTacToeGameVictory(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)ticTacToeswitch(ticTacToe[i][j]);
            ticTacToeflagjudge();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)ticTacToeswitch(ticTacToe[j][i]);
            ticTacToeflagjudge();
        }
        ticTacToeswitch(ticTacToe[0][0]);
        ticTacToeswitch(ticTacToe[1][1]);
        ticTacToeswitch(ticTacToe[2][2]);
        ticTacToeflagjudge();
        ticTacToeswitch(ticTacToe[2][0]);
        ticTacToeswitch(ticTacToe[1][1]);
        ticTacToeswitch(ticTacToe[0][2]);
        ticTacToeflagjudge();
        return;
    }

    public static void ticTacToeswitch(String ticTacToecell){
        switch (ticTacToecell){
            case " ":
            break;

            case "0":
            flag0++;
            break;

            case "X":
            flagX++;
            break;

            default:
            System.out.println("Error!");
            break;
        }
        return;
    }

    public static void ticTacToeflagjudge(){
        if(flag0==3&&flagwin==0){
            ticTacToePrint(ticTacToe);
            System.out.println("Player 0 win!");
            flagwin=1;
        }
        if(flagX==3&&flagwin==0){
            ticTacToePrint(ticTacToe);
            System.out.println("Player X win!");
            flagwin=1;
        }
        if(step==9&&flagwin==0)
        {
            ticTacToePrint(ticTacToe);
            System.out.println("Dogfall!");
            flagwin=1;
        }
        flag0=0;
        flagX=0;
        return;
    }
}
