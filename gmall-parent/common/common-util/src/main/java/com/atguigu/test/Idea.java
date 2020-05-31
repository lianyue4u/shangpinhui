package com.atguigu.test;

import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowSlot;

import java.util.Map;

public class Idea {

    public static void main(String[] args) {

        String name = getName("zhang2");
        System.out.println(name);



    }






    public static  String getName(String name){
        System.out.println(name);
        return  name;
    }




}
