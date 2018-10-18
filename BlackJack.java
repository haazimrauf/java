package com.infosys.BlackJack;

public class BlackJack {
	public int play(int a, int b) {
		if (a > b && a!=22 && b!=22) {
			return a;
		}
		if (b > a && a!=22 && b!=22) {
			return b;
		}
		if(b==22 && a==22) {
			 return 0;
		}
		if(b==22 && a!=22) {
			return a;
		}
		if(a==22 && b!=22) {
			return b;
}
		return b;
		
}
}