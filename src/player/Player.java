package player;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Player {

    private String specialPokerType;

    private  ArrayList<String> front = new ArrayList<>();//前墩
    private  ArrayList<String> middle = new ArrayList<>();//中墩
    private  ArrayList<String> behand = new ArrayList<>();//后墩

    private List<Integer>one=new ArrayList<>();//单牌
    private List<Integer>two=new ArrayList<>();//对子
    private List<Integer>three=new ArrayList<>();//三张
    private List<Integer>four=new ArrayList<>();//炸弹

    public List<Integer> getOne() {
        return one;
    }

    public void setOne(List<Integer> one) {
        this.one = one;
    }

    public List<Integer> getTwo() {
        return two;
    }

    public void setTwo(List<Integer> two) {
        this.two = two;
    }

    public List<Integer> getThree() {
        return three;
    }

    public void setThree(List<Integer> three) {
        this.three = three;
    }

    public List<Integer> getFour() {
        return four;
    }

    public void setFour(List<Integer> four) {
        this.four = four;
    }

    public ArrayList<String> getFront() {
        return front;
    }

    public void setFront(ArrayList<String> front) {
        this.front = front;
    }

    public ArrayList<String> getMiddle() {
        return middle;
    }

    public void setMiddle(ArrayList<String> middle) {
        this.middle = middle;
    }

    public ArrayList<String> getBehand() {
        return behand;
    }

    public void setBehand(ArrayList<String> behand) {
        this.behand = behand;
    }

    public String getSpecialPokerType() {
        return specialPokerType;
    }

    public void setSpecialPokerType(String specialPokerType) {
        this.specialPokerType = specialPokerType;
    }

    public String getCommonPokerType() {
        return commonPokerType;
    }

    public void setCommonPokerType(String commonPokerType) {
        this.commonPokerType = commonPokerType;
    }

    private String commonPokerType;

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
