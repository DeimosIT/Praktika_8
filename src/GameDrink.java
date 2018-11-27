import java.util.ArrayList;
import java.util.*;

public class GameDrink {
    public static void main(String[] args) {

        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колоды по 5 карт, Master <3");
        for(int i = 0; i < 5 ; i++)
        {
            player1.add(sc.nextInt());
        }
        for(int i = 0; i < 5 ; i++)
        {
            player2.add(sc.nextInt());
        }
        int count = 1;
        for(int i = 0; i<106; i++)
        {
            if((player1.size()!=0)||(player2.size()!=0))
            {
                if((player1.get(0)!=0)&&(player2.get(0)!=9)&&((player2.get(0))!=0)&&(player1.get(0)!=9))
                {
                    if (player1.get(0) > player2.get(0))
                    {
                        int x, y;
                        x = player1.get(0);
                        y = player2.get(0);
                        player1.remove(0);
                        player2.remove(0);
                        player1.add(x);
                        player1.add(y);
                        System.out.println("\nДействие 1\n");

                    }
                    if (player1.get(0) < player2.get(0))
                    {
                        int x, y;
                        x = player1.get(0);
                        y = player2.get(0);
                        player1.remove(0);
                        player2.remove(0);
                        player2.add(x);
                        player2.add(y);
                        System.out.println("\nДействие 2\n");
                    }
                }
                else{

                    if((player1.get(0)==0)&&(player2.get(0)==9))
                    {
                        int x, y;
                        x = player1.get(0);
                        y = player2.get(0);
                        player1.remove(0);
                        player2.remove(0);
                        player1.add(x);
                        player1.add(y);
                        System.out.println("\nДействие 3\n");
                    }
                    if((player2.get(0)==0)&&(player1.get(0)==9))
                    {
                        int x, y;
                        x = player1.get(0);
                        y = player2.get(0);
                        player1.remove(0);
                        player2.remove(0);
                        player2.add(x);
                        player2.add(y);
                        System.out.println("\nДействие 4\n");
                    }
                }
            }
            if(player1.size() == 0){
                System.out.println("Winner Player2"+count);
                break;
            }
            if(player2.size() == 0){
                System.out.println("Winner Player1"+count);
                break;
            }
            count++;
            System.out.println("************\n");
            System.out.println("Карты первого\n");
            for(int Card : player1)
            {
                System.out.print(Card);
            }
            System.out.println("\nКарты Второго\n");
            for(int Card:player2){
                System.out.print(Card);
            }
            System.out.println("\n**************\n");
        }

        System.out.println(player1.size());
        System.out.println(player2.size());
        //System.out.println(count);
        System.out.println("************\n");
    }
}
