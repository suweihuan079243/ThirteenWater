package poker;

import java.awt.*;

public enum SpecialPokerType {

    ZhiZunQinLong,//至尊清龙，13 张牌为清一色（同花色）的从 1（A）－13（K）
    YiTiaoLong,//一条龙，13 张牌为从 1（A）－13（K）
    ShiErHuangZu,//十二皇族，13 张牌中 12 张都是 10 以上的牌
    SanTongHuaShun,//三同花顺，头墩，中墩，后墩都为同花顺
    SanFenTianXia,//三分天下，13 张牌出现 3 副炸弹加 1 张杂牌
    QuanDa,//全大，13 张牌数字都为 8－A
    QuanXiao,//全小，13 张牌数字都为 2－8
    CouYiSe,//凑一色，13 张牌都是方块、梅花或者黑桃、红心（杂牌无任何特殊牌型的情况）
    ShuangGuaiChongSan,//双怪冲三，指的是 2 对葫芦+1 个对子+任意 1 张杂牌
    SiTaoSanTiao,//四套三条，指的是 4 套相同的三张牌+任意 1 张杂牌
    WuDuiSanTiao,//五对三条，指的是 5 个对子+3 张相同的牌
    LiuDuiBan,//六对半，指的是 6 个对子+任意 1 张杂牌
    SanShunzi,//三顺子，指三敦水都是顺子牌
    SanTongHua;//三同花，指三敦水都是同一种花色牌

}
