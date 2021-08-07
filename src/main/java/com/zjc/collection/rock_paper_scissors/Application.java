package com.zjc.collection.rock_paper_scissors;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/6
 */
public class Application {
    public static void main(String[] args) {


    Computer cmp = new Computer();
    User user = new User();
    Rstimate rstimate = new Rstimate();

    rstimate.decide(cmp,user);
    }
}
