package util;

import player.Player;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class JudgeUtils {


    /***
     * 记牌
     * @param player
     */
    public  static void countPokers(Player player){
        List<String> handPokers = player.getHandPokers();//总牌

        TreeSet<Character>colors=new TreeSet<>();//花色集合，无重复

        List<Character>colorList=new ArrayList<>();//有重复

        TreeSet<Integer>numbers=new TreeSet<>();//数字集合，无重复

        List<Integer>numberList=new ArrayList<>();//有重复


        for(String string:handPokers){
            char[] color = string.substring(0, 1).toCharArray();
            String number = string.substring(1);
            if("J".equals(number)){
                numberList.add(11);
                numbers.add(11);
            }else if("Q".equals(number)){
                numberList.add(12);
                numbers.add(12);
            }else if("K".equals(number)){
                numberList.add(13);
                numbers.add(13);;
            }else if("A".equals(number)){
                numberList.add(14);
                numbers.add(14);
            }else{
                numberList.add(Integer.parseInt(number));
                numbers.add(Integer.parseInt(number));
            }
            colorList.add(color[0]);
            colors.add(color[0]);
        }

        int index = 0;
        while (true) {
            if ( index < numberList.size() - 3 && numberList.get(index).equals(numberList.get(index + 3)) ) {
                player.getFour().add(numberList.get(index));
                index = index + 4;
            } else if (index < numberList.size() - 2 && numberList.get(index).equals(numberList.get(index + 2))) {
                player.getThree().add(numberList.get(index));
                index = index + 3;
            } else if (index < numberList.size() - 1 && numberList.get(index).equals(numberList.get(index + 1))) {
                player.getTwo().add(numberList.get(index));
                index = index + 2;
            } else {
                player.getOne().add(numberList.get(index));
                index = index + 1;
            }
            if (index >= 13) break;
        }
        System.out.println(player.getOne());
        System.out.println(player.getTwo());
        System.out.println(player.getThree());
        System.out.println(player.getFour());

        judgeSpecialPokerType(colors,numbers,numberList,player);
    }

    /**
     * 判断特殊牌型
     * @param colors
     * @param numbers
     * @param numberlist
     * @param player
     */
    public static void judgeSpecialPokerType(TreeSet<Character>colors,
                                             TreeSet<Integer>numbers,List<Integer>numberlist,Player player){
        if(colors.size()==1&&numbers.size()==13){
            player.setSpecialPokerType("至尊清龙");
            return ;
        }

        if(numbers.size()==13){
            player.setSpecialPokerType("一条龙");
            return ;
        }

        if(numberlist.get(1)>10){
            player.setSpecialPokerType("十二皇族");
        }

        if(player.getTwo().size()==6){
            player.setSpecialPokerType("六对半");
            return ;
        }

        if(player.getTwo().size()==5&&player.getThree().size()==1){
            player.setSpecialPokerType("五对三条");
        }

        if(player.getThree().size()==4){
            player.setSpecialPokerType("四套三条");
            return ;
        }

        if(player.getThree().size()==2&&player.getTwo().size()==3){
            player.setSpecialPokerType("双怪冲三");
            return ;
        }

        if(numberlist.get(0)>=8){
            player.setSpecialPokerType("全大");
            return ;
        }

        if(numberlist.get(12)<=8){
            player.setSpecialPokerType("全小");
            return ;
        }

        if(player.getFour().size()==3){
            player.setSpecialPokerType("三分天下");
            return ;
        }



        //最后判断凑一色
        if(colors.size()==1){
            player.setSpecialPokerType("凑一色");
            return ;
        }
    }

    /**
     * 判断普通牌型
     * @param colors
     * @param numbers
     * @param numberlist
     * @param player
     */
    public static void judgeCommonPokerType(TreeSet<Character>colors,
                                            TreeSet<Integer>numbers,List<Integer>numberlist,Player player){

        //全是单牌
        if(numbers.size()==13){
            player.setCommonPokerType("单张");
            DealerUtil.deal(player);
            return ;
        }

        //

    }


}
