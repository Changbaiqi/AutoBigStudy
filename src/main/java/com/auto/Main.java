package com.auto;

public class Main {

    public static void main(String[] args) {
        //这里使用AutoStudy创建一个待学习的对象，参数传入抓包获得的SSUUID
        AutoStudy autoStudy = new AutoStudy("3FC8F3B867A95F74E22492CA94376A45447752B12A04AB3");
        System.out.println(autoStudy.toStudy(152)); //这里填写大学习的期数，152表示2022年第25期，然后会自动大学习。
        //学习成功会自动返回一串JSON，否则表示未学习
    }

}



