package com.gyx;

import java.util.Scanner;

/**
 * @ClassName TestTable
 * @Description:类描述
 * @Author gyx
 * @Date 2022/8/11
 * @Version V1.0
 **/
public class TestTable {

//    1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
//    现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
//    请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("苹果斤数：");
        int i = scanner.nextInt();
        System.out.println("草莓斤数：");
        int y = scanner.nextInt();
        System.out.println("共计："+8*i+13*y);
    }

}
