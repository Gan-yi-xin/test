package com.gyx;

import java.util.Scanner;

/**
 * @ClassName TestTable2
 * @Description:类描述
 * @Author gyx
 * @Date 2022/8/11
 * @Version V1.0
 **/
public class TestTable2 {
//    3、超市做促销活动，草莓限时打 8 折。
//    现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//    请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("苹果斤数：");
        int i = scanner.nextInt();
        System.out.println("草莓斤数：");
        int y = scanner.nextInt();
        System.out.println("芒果斤数：");
        int x = scanner.nextInt();
        System.out.println("共计："+8*i+13*y*0.8+20*x);
    }
}
