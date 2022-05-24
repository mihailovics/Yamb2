package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.player.Anja.Utils;

public class YambPattern {
	private static final int YAMB = 5;

	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		}
		
		if (Utils.max(brojanja) >= YAMB)
			return true;
		return false;
		
	}

	
	static public int getPatternScore(int[] kockice) {
		
		
		
		if(new YambPattern().isPatternPresent(kockice)) {
			return YAMB *  + 50;
		}
		else {
			return 0;
		}
	}

}
