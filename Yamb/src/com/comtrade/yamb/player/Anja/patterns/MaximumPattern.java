package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.player.Anja.Utils;

public class MaximumPattern {
	private static final int MAXIMUM = 24;
	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		// 3,5,4,6,5,1
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		}
		// brojanja = {4,1,0,1,0,0}
		
		
		int pom = 0;
		for(int i = 0; i<kockice.length; i++) {
			for(int j = 1; i<kockice.length; i++) {
				if(kockice[i] < kockice[j]) {
					pom = kockice[j];
					kockice[j] = kockice[i];
					kockice[i] = pom;
				}
			}
		}
		
		int zbir = 0;
		for(int i = 0; i<kockice.length-1; i++) {  // kockice.length-1 stavljeno zbog toga 
			zbir +=kockice[i];					   // sto nam ne treba poslednji najmanji u nizu
		}
		
		
		if(zbir >= MAXIMUM)
		{
			return true;
		}
		else {
			return false;
		}
	}

	
	static public int getPatternScore(int[] kockice) {
		return MAXIMUM*Utils.max(kockice) + 50;
	}

}
