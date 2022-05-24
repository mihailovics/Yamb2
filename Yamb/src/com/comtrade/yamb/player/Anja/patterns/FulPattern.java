package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;

public class FulPattern {

	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		// 1,1,4,2,1,1
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		}
		// brojanja = {4,1,0,1,0,0}
		boolean dva = false;
		boolean tri = false;
		for(int i = 0; i<brojanja.length; i++) {
			if(brojanja[i] == 2) {
				dva = true;
			}
			if(brojanja[i]==3) {
				tri = true;
			}
		}
		if(dva == true && tri == true) {
			return true;
		}
		return false;
	}

	
	static public int getPatternScore(int[] kockice) {
		return 0;
	}

}
