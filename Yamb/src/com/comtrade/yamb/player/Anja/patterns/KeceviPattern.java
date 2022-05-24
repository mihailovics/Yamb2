package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;

public class KeceviPattern {
	private static final int KEC = 1;

	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		//1,3,1,4,5,5
		for(int i = 0; i < Constants.DICE_COUNT; i++)
		{
			brojanja[kockice[i] - 1]++;
		}
		//brojanja{2,0,1,1,2,0}
		
		if(brojanja[0] >= 4)
		{
			return true;
		}
		
		
		
		return false;
		
		
		
	}

	
	static public int getPatternScore(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		
		for(int i = 0; i < Constants.DICE_COUNT; i++)
		{
			brojanja[kockice[i] - 1]++;
		}
		return 1*brojanja[0];
	}
	

}
