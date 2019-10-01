package poker;

import util.PokerUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 扑克牌类
 *  黑桃表示为$,红桃表示为&，梅花表示为*，方块表示为#
 */
public class Poker {
    //每张牌对应的编号
    private List<Integer> indexLists = new ArrayList<>();

    //总牌集
    private HashMap<Integer, String> pokerMap = new HashMap<>();

    //花色
    private String[] pokerColors = {"♤", "♡", "♧", "♢"};

    //数字
    private String[] pokerNumbers = {"2", "3", "4", "5", "6", "7", "8", "9",
            "10", "J", "Q", "K", "A"};

    public List<Integer> getIndexLists() {
        return indexLists;
    }

    public void setIndexLists(List<Integer> indexLists) {
        this.indexLists = indexLists;
    }

    public void setPokerMap(HashMap<Integer, String> pokerMap) {
        this.pokerMap = pokerMap;
    }

    public String[] getPokerColors() {
        return pokerColors;
    }

    public void setPokerColors(String[] pokerColors) {
        this.pokerColors = pokerColors;
    }

    public String[] getPokerNumbers() {
        return pokerNumbers;
    }

    public void setPokerNumbers(String[] pokerNumbers) {
        this.pokerNumbers = pokerNumbers;
    }

    public HashMap<Integer, String> getPokerMap() {
        int index = 0;
        for (String number : pokerNumbers) {
            for (String color : pokerColors) {
                String poker = color.concat(number);
                pokerMap.put(index, poker);
                indexLists.add(index);
                index++;
            }
        }
            return pokerMap;
    }


}
