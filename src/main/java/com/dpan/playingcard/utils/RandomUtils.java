package com.dpan.playingcard.utils;

/**
 * 随机数
 */
public class RandomUtils {

    /**
     * 获取一个指定长度的整数字符串
     *
     * @param len         长度
     * @param leadingZero 是否补齐前导零
     * @return
     */
    public static String randomStringNum(int len, boolean leadingZero) {
        double r = randomRangeNum(0, (int) Math.pow(10, len));
        return leadingZero ? String.format("%0" + len + "d", r) : String.valueOf(r);
    }

    /**
     * 获取一个在 [min,max) 内的随机整数
     *
     * @param min
     * @param max
     * @return
     */
    public static int randomRangeNum(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

}
