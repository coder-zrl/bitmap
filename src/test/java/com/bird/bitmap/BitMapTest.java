package com.bird.bitmap;

import junit.framework.TestCase;

/**
 * @author zhangruilong <zhangruilong03@kuaishou.com>
 * Created on 2025-01-21
 */
public class BitMapTest extends TestCase {
    public void testBitMap() {
        BitMap bitmap = new BitMap();

        bitmap.set(10); // 设置第10位
        bitmap.set(25); // 设置第25位

        System.out.println("Bit 10 is " + (bitmap.check(10) ? "set" : "clear"));
        System.out.println("Bit 25 is " + (bitmap.check(25) ? "set" : "clear"));

        bitmap.clear(10); // 清除第10位
        System.out.println("Bit 10 is " + (bitmap.check(10) ? "set" : "clear"));

        bitmap.print(); // 打印位图
    }
}