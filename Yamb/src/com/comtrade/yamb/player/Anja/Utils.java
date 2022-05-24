package com.comtrade.yamb.player.Anja;

public class Utils {
	public static int max(int[] brojevi) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < brojevi.length; i++) {
			if (brojevi[i] > max) 
				max = brojevi[i];
		}
		return max;
	}
}
