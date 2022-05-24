package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;

public class PeticePattern  {

	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		// 1,1,4,2,1,1
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		}
		// brojanja = {4,1,0,1,0,0}
		
		if(brojanja[4] >=3)
			return true;
		return false;
	}

	
	static public int getPatternScore(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		
		for(int i = 0; i < Constants.DICE_COUNT; i++)
		{
			brojanja[kockice[i] - 1]++;
		}
		return 5*brojanja[4];
	}

}
