package test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.scripts.JD;
import org.junit.Test;
import player.Player;
import poker.Poker;
import util.JudgeUtils;
import util.PokerUtils;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;


public class UtilTest {

    @Test
    /**
     * 测试洗牌
     */
    public void testShuffing(){
        List<Integer> pokerLists = new Poker().getIndexLists();
        PokerUtils.shuffing(pokerLists);
        System.out.println(pokerLists);
    }

    @Test
    public void testLookPoker(){
        Poker poker=new Poker();
        List<Integer> indexLists = poker.getIndexLists();
        HashMap<Integer, String> pokerLists = poker.getPokerMap();
        Player player1=new Player("小学僧");
        Player player2=new Player("锐萌萌");
        Player player3=new Player("儿童劫");
        Player player4=new Player("托儿索");

        PokerUtils.shuffing(indexLists);
        PokerUtils.dealing(indexLists, player1,
                player2, player3, player4);

        PokerUtils.lookPoker(player1, poker.getPokerMap());
        PokerUtils.lookPoker(player2, poker.getPokerMap());
        PokerUtils.lookPoker(player3, poker.getPokerMap());
        PokerUtils.lookPoker(player4, poker.getPokerMap());
    }

    @Test
    public void testJudgePokerType(){
        Poker poker=new Poker();
        List<Integer> indexLists = poker.getIndexLists();
        HashMap<Integer, String> pokerLists = poker.getPokerMap();
        Player player1=new Player("小学僧");
        Player player2=new Player("锐萌萌");
        Player player3=new Player("儿童劫");
        Player player4=new Player("托儿索");

        PokerUtils.shuffing(indexLists);
        PokerUtils.dealing(indexLists, player1,
                player2, player3, player4);
        PokerUtils.lookPoker(player1, poker.getPokerMap());
        PokerUtils.lookPoker(player2, poker.getPokerMap());


        //JudgeUtils.judgeSpecialType(player1);
        JudgeUtils.countPokers(player1);
        JudgeUtils.countPokers(player2);
        System.out.println(player1.getSpecialPokerType());
        System.out.println(player1.getCommonPokerType());
        System.out.println(player2.getSpecialPokerType());
        System.out.println(player2.getCommonPokerType());



    }


}
