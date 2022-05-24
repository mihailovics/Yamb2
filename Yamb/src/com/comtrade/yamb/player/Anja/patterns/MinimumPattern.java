package com.comtrade.yamb.player.Anja.patterns;

import java.util.Arrays;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.player.*;

public class MinimumPattern {
	private static final int MINIMUM = 9;
	
	static public boolean isPatternPresent(int[] kockice) {
		int[] brojanja = new int[Constants.DICE_COUNT];
		// 1,1,4,2,1,1
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		}
		// brojanja = {4,1,0,1,0,0}
		
		Arrays.sort(kockice);
		
		int zbir = 0;
		for(int i = 0; i<kockice.length-1; i++) // kockice.length-1 stavljeno zbog toga
		{										// sto nam ne treba poslednji najveci u nizu
				zbir +=kockice[i];
		}
		
		if(zbir <= MINIMUM)
		{
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

	
	static public int getPatternScore(int[] kockice) {
		
		return 0;
	}

}
