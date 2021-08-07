package com.zjc.collection.rock_paper_scissors;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/6
 */
public class Computer {
    int random;
    String random1;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public String getRandom1() {
        return random1;
    }

    public void setRandom1(String random1) {
        this.random1 = random1;
    }

    public void launch() {

        random = (int) (Math.random() * 3);
        if (random == 2) {
            random1 = "石头";
        } else if (random == 1) {
            random1 = "剪刀";
        } else if (random == 0) {
            random1 = "布";
        } else {
            System.out.println("计算机判断错误请重新开始游戏");
        }
    }
}
