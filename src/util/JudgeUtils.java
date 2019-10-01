package util;

import player.Player;

import java.util.ArrayList;
import java.util.List;

public class JudgeUtils {

    public static void judgeSpecialType(Player player){
        List<String> handPokers = player.getHandPokers();
        List<Character>colors=new ArrayList<>();

        for(String string:handPokers){
            string.substring(0,1);
}}
}
