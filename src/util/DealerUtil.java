package util;

import player.Player;

import java.util.ArrayList;
import java.util.List;

public class DealerUtil {


    public static void deal(Player player){
        String specialPokerType = player.getSpecialPokerType();
        String commonPokerType = player.getCommonPokerType();

         ArrayList<String> front = new ArrayList<>();//前墩
        ArrayList<String> middle = new ArrayList<>();//中墩
        ArrayList<String> behand = new ArrayList<>();//后墩

        List<String> handPokers = player.getHandPokers();
        if(specialPokerType==null){
            switch (commonPokerType){
                case "单张":{
                    front.add(handPokers.get(0));
                    front.add(handPokers.get(1));
                    front.add(handPokers.get(2));
                    middle.add(handPokers.get(3));
                    middle.add(handPokers.get(4));
                    middle.add(handPokers.get(5));
                    middle.add(handPokers.get(6));
                    middle.add(handPokers.get(7));
                    behand.add(handPokers.get(8));
                    behand.add(handPokers.get(9));
                    behand.add(handPokers.get(10));
                    behand.add(handPokers.get(11));
                    behand.add(handPokers.get(12));
                    break;
                }

            }
            player.setFront(front);
            player.setMiddle(middle);
            player.setBehand(behand);
        }
    }

}
