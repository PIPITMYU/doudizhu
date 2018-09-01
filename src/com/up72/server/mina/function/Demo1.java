package com.up72.server.mina.function;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		List<Long> countScore = new ArrayList<Long>();
		List<Long> countScore1 = new ArrayList<Long>();
		countScore1.add(0l);
		countScore1.add(0l);
		countScore1.add(0l);
		List<List<Long>> xiaoJuFen = new ArrayList<List<Long>>();
		List<Long> xiaoju1 = new ArrayList<Long>();
		xiaoju1.add(-3l);
		xiaoju1.add(0l);
		xiaoju1.add(6l);
		List<Long> xiaoju2 = new ArrayList<Long>();
		xiaoju2.add(-3l);
		xiaoju2.add(-3l);
		xiaoju2.add(8l);
		xiaoJuFen.add(xiaoju1);
		xiaoJuFen.add(xiaoju2);
		for (int i = 0; i < xiaoJuFen.size(); i++) {
			for (int j = 0; j < xiaoJuFen.get(i).size(); j++) {
				System.out.println(xiaoJuFen.get(i).get(j));
				countScore.add(xiaoJuFen.get(i).get(j));
			}
		}
		Long a = 0l;
		Long b = 0l;
		Long c = 0l;
		for (int i = 0; i < countScore.size(); i++) {
			if(i % 3 == 0){
				a += countScore.get(i);
				countScore1.set(0, a);
			}else if(i % 3 == 1){
				b += countScore.get(i);
				countScore1.set(1, b);
			}else if(i % 3 == 2){
				c += countScore.get(i);
				countScore1.set(2, c);
			}
		}
		
		System.out.println(countScore1);
	}
}
