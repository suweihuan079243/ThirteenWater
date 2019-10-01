package util;



import javafx.application.Platform;
import player.Player;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class PokerUtils {
    /***
     * 洗牌方法
     * @param list
     */
    public static void shuffing(List list){
        Collections.shuffle(list);
    }

    /***
     * 发牌
     * @param list
     */
    public static void dealing(List<Integer>list, Player player1,
                               Player player2, Player player3, Player player4){
        TreeSet<Integer> handPokers1 = player1.getTreeSet();
        TreeSet<Integer> handPokers2 = player2.getTreeSet();
        TreeSet<Integer> handPokers3 =  player3.getTreeSet();
        TreeSet<Integer> handPokers4 =  player4.getTreeSet();

        for(int i=0;i<list.size();i++){
            if(i%4==0){
                handPokers1.add(list.get(i));
            }else if(i%4==1){
                handPokers2.add(list.get(i));
            }else if(i%4==2){
                handPokers3.add(list.get(i));
            }else{
                handPokers4.add(list.get(i));
            }
        }

    }


    /***
     *
     * @param player
     * @param hashMap
     */
    public static void lookPoker(Player player,HashMap<Integer,String>hashMap){
        String name = player.getName();
        TreeSet<Integer> treeSet = player.getTreeSet();
        List<String> handPokers = player.getHandPokers();
        System.out.print(name+"的牌是：");
        for(Integer key:treeSet){
            String s = hashMap.get(key);
            handPokers.add(s);
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
