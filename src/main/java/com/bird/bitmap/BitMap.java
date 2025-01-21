package com.bird.bitmap;

/**
 * 位图数据结构的实现
 *
 * @author zhangruilong <zhangruilong03@kuaishou.com>
 * Created on 2025-01-21
 */
public class BitMap {
    private long bits; // 用于记录位图的数据

    /**
     * 设置指定位置的位为1
     *
     * @param index 位图中的索引
     */
    public void set(int index) {
        checkIndex(index);
        bits |= (1L << index);
    }

    /**
     * 清除指定位置的位，即设置为0
     *
     * @param index 位图中的索引
     */
    public void clear(int index) {
        checkIndex(index);
        if (check(index)) {
            // 左移、取反、与运算
            bits &= ~(1L << index);
        }
    }

    /**
     * 检查指定位置的位是否为1
     *
     * @param index 位图中的索引
     * @return true 如果位为1，否则返回false
     */
    public boolean check(int index) {
        checkIndex(index);
        return (bits & (1L << index)) != 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= 64) {
            throw new IllegalArgumentException("Index out of range [0, 63]");
        }
    }

    /**
     * 打印位图
     */
    public void print() {
        for (int i = 63; i >= 0; i--) {
            System.out.print((bits & (1L << i)) != 0 ? '1' : '0');
        }
        System.out.println();
    }
}