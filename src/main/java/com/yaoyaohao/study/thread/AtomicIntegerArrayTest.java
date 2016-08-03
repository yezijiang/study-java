package com.yaoyaohao.study.thread;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 原子更新数组
 * 	AtomicIntegerArray
 *  AtomicLongArray
 *  AtomicReferenceArray
 * 
 * @author liujianzhu
 * @date 2016年8月3日 上午10:45:33
 */
public class AtomicIntegerArrayTest {
	static int[] value = new int[]{1,2};
	static AtomicIntegerArray ai = new AtomicIntegerArray(value);
	
	public static void main(String[] args) {
		ai.getAndAdd(0, 3);
		System.out.println(ai.get(0));
		System.out.println(value[0]);
	}
}
