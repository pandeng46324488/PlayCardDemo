package com.dpan.playingcard.utils;

/**
 * 人名随机生成器
 */
public class PersonNameUtils {


    /**
     * 常用姓
     */
    private final static String[] chineseFamilyName = {
            "张", "李", "王", "赵", "潘", "马", "黄", "曾", "邵", "朱", "孙", "钱", "周", "吴", "郑", "冯", "陈", "禇", "卫",
            "蒋", "杨", "韩", "苏", "何", "秦", "许", "吕", "施", "孔", "曹", "雷", "苗", "韦", "章", "戚", "金", "魏", "方",
            "柳", "袁", "任", "费", "贺", "汤", "梅"
    };

    /**
     * 常用名
     */
    private final static String[] chineseLastName = {
            "五", "依", "国", "强", "美", "梅", "伟", "兰", "秀", "涛", "二", "艳", "军", "八", "平", "芳", "桂", "超", "明",
            "磊", "杰", "九", "静", "浩", "一", "瑞", "昊", "悦", "妍", "涵", "三", "玥", "子", "梓", "宇", "俊", "轩", "泽",
            "鹏", "乔", "豪", "六", "芸", "雨", "思", "琪", "莹", "怡", "晰", "维", "学", "思", "悟", "析", "文", "书", "勤",
            "颖", "灵", "睿", "锐", "哲", "慧", "敦", "迪", "明", "晓", "显", "悉", "妯", "婷", "姿", "媚", "婉", "妩", "倩",
            "俊", "威", "英", "健", "壮", "焕", "挺", "秀", "伟", "武", "雄", "巍", "松", "柏", "山", "石", "婵", "娟", "姣",
            "达", "耀", "兴", "荣", "华", "旺", "盈", "丰", "余", "昌", "盛", "顺", "通", "坦", "泰", "然", "宁", "定", "和",
            "乎", "安", "静", "康",
    };

    /**
     * 外国人姓
     */
    private final static String[] foreignerLastName = {
            "Davis", "Miller", "Garcia", "Rodriguez", "Smith", "Johnson", "Wilson",
            "Martinez", "Anderson", "Taylor", "Williams", "martin", "Jackson", "Thompson", "White",
            "Brown", "Jones", "Clark", "Lewis", "Robinson", "Walker", "Moore", "Lopez", "Lee",
            "Scott", "Young", "Allen", "Hill", "Evans", "Mitchell", "Baker"
    };

    private final static String[] foreignerFirstName = {
            "Abby", "Christne", "Dolores", "Demi", "Deborah", "Corrine", "Allison", "Alice", "Alina", "Beatrice",
            "Carrie", "Cassandra", "Tyler", "Vern", "Christy", "Estelle", "Ellen", "Ella"
    };


    public static String getChineseName() {
        if (RandomUtils.randomRangeNum(0, 100) % 2 == 0) {
            return chineseFamilyName[RandomUtils.randomRangeNum(0, chineseFamilyName.length)] + chineseLastName[RandomUtils.randomRangeNum(0, chineseLastName.length)];
        } else {
            return chineseFamilyName[RandomUtils.randomRangeNum(0, chineseFamilyName.length)] + chineseLastName[RandomUtils.randomRangeNum(0, chineseLastName.length)] + chineseLastName[RandomUtils.randomRangeNum(0, chineseLastName.length)];
        }
    }


    /**
     * 生成英文名
     *
     * @return
     */
    public static String getEnglishName() {
        if (RandomUtils.randomRangeNum(0, 100) % 2 == 0) {
            return foreignerFirstName[RandomUtils.randomRangeNum(0, foreignerFirstName.length)] + "·" + foreignerLastName[RandomUtils.randomRangeNum(0, foreignerLastName.length)];
        } else {
            return foreignerFirstName[RandomUtils.randomRangeNum(0, foreignerFirstName.length)] + "·" + foreignerFirstName[RandomUtils.randomRangeNum(0, foreignerFirstName.length)] + "·" + foreignerLastName[RandomUtils.randomRangeNum(0, foreignerLastName.length)];
        }
    }

}
