package com.example.demo;

import java.util.HashSet;

public class ZhongJiang {
	public static void main(String[] args) {
		HashSet<Integer> hongQiuZhongJiang=new HashSet<>();
		while (true) {
			int qiu=(int)(Math.random()*33)+1;
			hongQiuZhongJiang.add(qiu);
			if (hongQiuZhongJiang.size()==6) {
				break;
			}
		}
		HashSet<Integer> lanQiuZhongJiang=new HashSet<>();
		while (true) {
			int qiu=(int)(Math.random()*16)+1;
			lanQiuZhongJiang.add(qiu);
			if (lanQiuZhongJiang.size()==1) {
				break;
			}
		}
		System.out.println("蓝球中奖号:"+hongQiuZhongJiang+"红球球中奖号:"+lanQiuZhongJiang);
	}
}
