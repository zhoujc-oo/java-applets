package com.zjc.collection.rock_paper_scissors;

/**
 * @description
 * @Author zhoujc
 * @Date 2021/8/6
 */
public class Rstimate {

    /**
     * XXXX
     */
    private int bout;
    private int userWins;
    private int computerWins;

    /**
     *
     * @param cmp
     * @param user
     */
    public void decide(Computer cmp,User user){
        System.out.println("-----------石头剪刀布游戏-----------");
        System.out.println("游戏为三局两胜！！！\n游戏开始");

        for (bout = 1;bout <=3;bout++ ){
            System.out.println("第" + bout + "回合");
            Computer cmp1 = new Computer();
            User user1 = new User();
            user1.userLaunch();
            cmp1.launch();

            if (user1.getChooseNumeral() == cmp1.random){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------平局-------");

                //
            }else if (user1.getChooseNumeral() == 2 && cmp1.random == 1){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------玩家赢------" );
                userWins++;
            }else if (user1.getChooseNumeral() == 2 && cmp1.random == 0){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------电脑赢------" );
                computerWins++;
            }else if (user1.getChooseNumeral() == 1 && cmp1.random == 2){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------电脑赢------" );
                computerWins++;
            }else if (user1.getChooseNumeral() == 1 && cmp1.random == 0){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------玩家赢------" );
                userWins++;
            }else if (user1.getChooseNumeral() == 0 && cmp1.random == 2){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------玩家赢------" );
                userWins++;
            }else if (user1.getChooseNumeral() == 0 && cmp1.random == 1){
                System.out.println(user1.getChoose() + ":" + cmp1.random1 + "\n------电脑赢------" );
                computerWins++;
            }



            System.out.println("分数为：\n" + "电脑：" + computerWins + "   VS   " + userWins + "玩家");
            System.out.println();
            System.out.println();
        }
        if (computerWins == userWins){
            System.out.println("比赛为平局");
        }else if (computerWins < userWins){
            System.out.println("玩家胜利");
        }else {
            System.out.println("电脑胜利");
        }
    }
}
