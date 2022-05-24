package com.comtrade.yamb.player.Anja.patterns;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.player.PlayerResponse;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;

public class KentaPattern {
	private static final int PRVO_BACANJE = 1;
	private static final int DRUGO_BACANJE = 2;
	private static final int TRECE_BACANJE = 3;

	
	static public boolean isPatternPresent(int[] kockice) {
		//1,2,3,4,5,5
		
		int[] brojanja = new int[Constants.DICE_COUNT];
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			brojanja[kockice[i] - 1]++;
		//brojanja{1,1,1,1,2,0}
		}
		
		boolean kec = false;
		boolean dvojka = false;
		boolean trojka = false;
		boolean cetvorka = false;
		boolean petica = false;
		boolean sestica = false;
		
		for(int i = 0; i<kockice.length; i++) {
			switch(kockice[i]) {
			case 1:
				kec = true;
				break;
			case 2:
				dvojka = true;
				break;
			case 3:
				trojka = true;
				break;
			case 4:
				cetvorka = true;
				break;
			case 5:
				petica = true;
				break;
			case 6:
				sestica = true;
				break;
			}
		}
		if((kec && dvojka && trojka && cetvorka && petica) || (dvojka && trojka && cetvorka && petica && sestica)) {
			return true;
		}
		else {
			return false;
		}

		
	}

	
	
	
	
	static public int getPatternScore(int[] kockice, Request request) {
		
		if(request.getThrowNumber() == PRVO_BACANJE){
			return 66;
		}
		if(request.getThrowNumber() == DRUGO_BACANJE){
			return 56;
		}
		if(request.getThrowNumber() == PRVO_BACANJE){
			return 46;
		}
		return 0;
	}

}
