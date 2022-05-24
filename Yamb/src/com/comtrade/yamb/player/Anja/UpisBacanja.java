package com.comtrade.yamb.player.Anja;

import com.comtrade.yamb.Constants;
import com.comtrade.yamb.Die;
import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Request;
import com.comtrade.yamb.RequestType;
import com.comtrade.yamb.player.Anja.patterns.CetvorkePattern;
import com.comtrade.yamb.player.Anja.patterns.DvojkePattern;
import com.comtrade.yamb.player.Anja.patterns.FulPattern;
import com.comtrade.yamb.player.Anja.patterns.KeceviPattern;
import com.comtrade.yamb.player.Anja.patterns.KentaPattern;
import com.comtrade.yamb.player.Anja.patterns.MaximumPattern;
import com.comtrade.yamb.player.Anja.patterns.MinimumPattern;
import com.comtrade.yamb.player.Anja.patterns.PeticePattern;
import com.comtrade.yamb.player.Anja.patterns.PokerPattern;
import com.comtrade.yamb.player.Anja.patterns.SesticePattern;
import com.comtrade.yamb.player.Anja.patterns.TrilingPattern;
import com.comtrade.yamb.player.Anja.patterns.TrojkePattern;
import com.comtrade.yamb.player.Anja.patterns.YambPattern;

public class UpisBacanja {
	private static final int PRVO_BACANJE = 1;
	private static final int DRUGO_BACANJE = 2;
	private static final int TRECE_BACANJE = 3;
	
	public PlayerResponse napraviUpis(Request request) {
		if (request.getType() != RequestType.THROW) return null;
		
		int[] kockice = simplifyDice(request.getDice());
		boolean moveOver = false;
		boolean dice[] = new boolean[Constants.DICE_COUNT];
		FieldData fieldData = null;
		
		// IMPLEMENTIRATI LOGIKU
		if (request.getThrowNumber() == PRVO_BACANJE) {
			if(new YambPattern().isPatternPresent(kockice)) {
				
				
				if (request.getBoard().getColumns()[Konstante.KOLONA_RUCNA].getFields().get(Konstante.YAMB).isPlayable())
				{
					fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.YAMB);
					moveOver = true;
				}
				
				else if (request.getBoard().getColumns()[Konstante.NA_GORE].getFields().get(Konstante.YAMB).isPlayable())
				{
					fieldData = new FieldData(Konstante.NA_GORE, Konstante.YAMB);
					moveOver = true;
				}
				else if (request.getBoard().getColumns()[Konstante.SA_KRAJEVA].getFields().get(Konstante.YAMB).isPlayable())
				{
					fieldData = new FieldData(Konstante.SA_KRAJEVA, Konstante.YAMB);
					moveOver = true;
				}
				
				
				/*request.getBoard().getColumns()[1].getFields().get(0).isPlayable();*/
			}
			
			
			else if (new PokerPattern().isPatternPresent(kockice)) {
				moveOver = true;
				int maxVrednost = Utils.max(kockice);
				for (int i = 0; i < Constants.DICE_COUNT; i++) {
					dice[i] = kockice[i] == maxVrednost;
				}
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.POKER_POLJE);
			}
			
			else if (new KentaPattern().isPatternPresent(kockice)) {
				moveOver = true;
				int maxVrednost = Utils.max(kockice);
				for (int i = 0; i < Constants.DICE_COUNT; i++) {
					dice[i] = kockice[i] == maxVrednost;
				}
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.KENTA);
			}
			else if (new FulPattern().isPatternPresent(kockice)) {
				moveOver = true;
				int maxVrednost = Utils.max(kockice);
				for (int i = 0; i < Constants.DICE_COUNT; i++) {             
					dice[i] = kockice[i] == maxVrednost;
				}
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.FUL);
			}
			
			else if(new TrilingPattern().isPatternPresent(kockice)) {
				moveOver = true;
				int maxVrednost = Utils.max(kockice);
				for (int i = 0; i < Constants.DICE_COUNT; i++) {
					dice[i] = kockice[i] == maxVrednost;
				}
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.TRILING);
			}
			else if(new KeceviPattern().isPatternPresent(kockice)) {
				moveOver = true;
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.KECEVI);
				
			}
			
			else if(new SesticePattern().isPatternPresent(kockice)) {
				moveOver = true;
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.SESTICE);
			}
			else if(new PeticePattern().isPatternPresent(kockice)) {
				moveOver = true;
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.PETICE);
			}
			
			else if(new CetvorkePattern().isPatternPresent(kockice)) {
				moveOver = true;
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.CETVORKE);
			}
			else if (new MaximumPattern().isPatternPresent(kockice)) {
				moveOver = true;
				int maxVrednost = Utils.max(kockice);
				for (int i = 0; i < Constants.DICE_COUNT; i++) {
					dice[i] = kockice[i] == maxVrednost;
				}
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.MAXIMUM);
			}
			else if(new TrojkePattern().isPatternPresent(kockice)) {
				moveOver = true;
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.TROJKE);
			}
			else if(new DvojkePattern().isPatternPresent(kockice)) {
				moveOver = true;
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.DVOJKE);
			}
						
			
			else if (new MinimumPattern().isPatternPresent(kockice)) {
				moveOver = true;
				int maxVrednost = Utils.max(kockice);
				for (int i = 0; i < Constants.DICE_COUNT; i++) {
					dice[i] = kockice[i] == maxVrednost;
				}
				fieldData = new FieldData(Konstante.KOLONA_RUCNA, Konstante.MINIMUM);
			}
			
			
						
		}
		if (request.getThrowNumber() == DRUGO_BACANJE) 
		{
			if(new YambPattern().isPatternPresent(kockice))
			{
				fieldData = new FieldData(Konstante.SLOBODNA, Konstante.YAMB);
			}
		}
		
		
		
		return new PlayerResponse(moveOver, dice, fieldData);
	}
	
	private int[] simplifyDice(Die[] dice) {
		int[] kockice = new int[Constants.DICE_COUNT];
		for (int i = 0; i < Constants.DICE_COUNT; i++) {
			kockice[i] = dice[i].getValue();
		}
		return kockice;
	
	}
}
