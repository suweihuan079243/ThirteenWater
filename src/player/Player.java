package player;

import poker.SpecialPokerType;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Player {

    private SpecialPokerType pokerType;

    private TreeSet<Integer> treeSet=new TreeSet<>();

    private List<String>handPokers=new ArrayList<>();

    private String name;

    private int pokerNumber;

    public List<String> getHandPokers() {
        return handPokers;
    }

    public Player(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public void setHandPokers(List<String> handPokers) {
        this.handPokers = handPokers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokerNumber() {
        return pokerNumber;
    }

    public void setPokerNumber(int pokerNumber) {
        this.pokerNumber = pokerNumber;
    }
}
