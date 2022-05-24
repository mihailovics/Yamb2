package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.player.Anja.Utils;

public class PokerPattern {
	
	private static final int POKER = 4;
	

	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		//1,1,4,2,1,1
		for(int i = 0; i < Constants.DICE_COUNT; i++)
		{
			brojanja[kockice[i] - 1]++;
		}
		//brojanja{4,1,0,1,0,0}
		if(Utils.max(brojanja)>=POKER)
			return true;
		return false;
	}
	
	/*private int[] simplifyDice(Die[] dice) {
		int[] kockice = new int[Constants.DICE_COUNT];
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			kockice[i] = dice[i].getValue();
		}
		return kockice;
	}*/
	
	
	static public int getPatternScore(int[] kockice) {

		if (new PokerPattern().isPatternPresent(kockice)){
			return POKER*Utils.max(kockice) + 40;
		}
		else {
			return 0;
		}
	}

}
