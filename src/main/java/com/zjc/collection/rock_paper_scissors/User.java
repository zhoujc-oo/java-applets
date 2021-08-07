package com.zjc.collection.rock_paper_scissors;

import java.util.Scanner;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/6
 */
public class User {

    String choose;
    int chooseNumeral;
    int chooseCount;

    public int getChooseCount() {
        return chooseCount;
    }

    public void setChooseCount(int chooseCount) {
        this.chooseCount = chooseCount;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public int getChooseNumeral() {
        return chooseNumeral;
    }

    public void setChooseNumeral(int chooseNumeral) {
        this.chooseNumeral = chooseNumeral;
    }

    public void userLaunch(){
        Scanner in = new Scanner(System.in);
        System.out.println("请在石头，剪刀，布内选择并输出：");
        choose = in.next();

        if ("石头".equals(choose)) {
            chooseNumeral = 2;
            chooseCount = 0;
        } else if ("剪刀".equals(choose)) {
            chooseNumeral = 1;
            chooseCount = 0;
        } else if ("布".equals(choose)) {
            chooseNumeral = 0;
            chooseCount = 0;
        } else {
            System.out.println("输入错误！！！");
            chooseCount = 1;
        }

//        if (choose == "石头"){
//            chooseNumeral = 2;
//        }else if (choose == "剪刀"){
//            chooseNumeral = 1;
//        } else if (choose == "布") {
//            chooseNumeral = 0;
//        }else {
//
//        }
    }
}
