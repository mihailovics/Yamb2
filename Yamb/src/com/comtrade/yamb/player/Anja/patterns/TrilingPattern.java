package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.player.Anja.Utils;

public class TrilingPattern {
	private static final int TRILING = 3;

	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		}
	
		if (Utils.max(brojanja) >= TRILING)
			return true;
		return false;
	}

	
	static public int getPatternScore(int[] kockice) {
		if (new TrilingPattern().isPatternPresent(kockice)){
			return TRILING*Utils.max(kockice) + 20;
		}
		else {
			return 0;
		}
	}

}
