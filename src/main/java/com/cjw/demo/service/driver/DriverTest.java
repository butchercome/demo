package com.cjw.demo.service.driver;

import java.util.Scanner;

/**
 * Created by Javen on 2016/11/20.
 */
public class DriverTest {
    public static void main(String[] args) {
        //创建输入对象
        Scanner sc = new Scanner(System.in);

        //获取用户输入的字符串
        String str = null;
        System.out.print("请输入任意字符:");
        str = sc.nextLine();
        char[] strbyte = str.toCharArray();
        Point point=new Point();
        point.setLatitude(String.valueOf(strbyte[0]));
        point.setLongtitude(String .valueOf(strbyte[1]));
        point.setDirection(String .valueOf(strbyte[2]));
        System.out.print("请输入移动的方向:");
        str=sc.nextLine();
        Point resultPoint=pointMove(point);
        System.out.println("你输入的字符为:" + str);

    }
    public static Point pointMove(Point startPoint){
        Point endPoint=new Point();

        return endPoint;
    }
}
