package GusserGameProject;
import  java.util.Scanner;
class Gusser{
    int guesserN;
    public int guessNum(){
        Scanner sc=new Scanner(System.in);
        guesserN=sc.nextInt();
        return guesserN;
    }
}
class Player{
    int playerN;
    public int playerNum(){
        Scanner sc=new Scanner(System.in);
        playerN=sc.nextInt();
        return playerN;
    }
}
class Umpire{
    int GuesserN;
    int PlayerN1;
    int PlayerN2;
    int PlayerN3;
    public void collectNumFromGuessor(){
        System.out.println("Enter Guesser Num");
        Gusser g=new Gusser();
        GuesserN=g.guessNum();
    }
    public void collectNumFromPlayer(){
        System.out.println("Enter Player 1 Num");
        Player p1=new Player();
        PlayerN1=p1.playerNum();
        System.out.println("Enter Player 2 Num");
        Player p2=new Player();
        PlayerN2=p2.playerNum();
        System.out.println("Enter Player 3 Num");
        Player p3=new Player();
        PlayerN3=p3.playerNum();
    }
    public void compare(){
        if(GuesserN==PlayerN1){
            if(GuesserN==PlayerN2 && GuesserN==PlayerN3){
                System.out.println("All Players are Winner!");
            }else if(GuesserN==PlayerN2){
                System.out.println("Player 1 and Player 2 are Winner!");
            }
            else if (GuesserN==PlayerN3){
                System.out.println("Player 1 and Player 3 are Winner!");
            }
            else{
                System.out.println("Only Player 1 winner");
            }
        }else if(GuesserN==PlayerN2){
            if (GuesserN==PlayerN3){
                System.out.println("Player 2 and Player 3 are Winner!");
            }
            else{
                System.out.println("Only Player 2 winner");
            }
        }else if(GuesserN==PlayerN3){
            System.out.println("Player 3 is Winner!");
        }else {
            System.out.println(" All player lost the Game!");
        }
    }
}

public class Game {
    public static void main(String[] args) {
        Umpire um=new Umpire();
        um.collectNumFromGuessor();
        um.collectNumFromPlayer();
        um.compare();
    }
}
