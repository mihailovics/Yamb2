package com.comtrade.yamb.player.Anja;

import com.comtrade.yamb.FieldData;
import com.comtrade.yamb.Response;
/**
 * Response za jedno bacanje.
 * @author adacic
 *
 */

public class PlayerResponse implements Response{

	private boolean moveOver;
	private boolean[] dice;
	private FieldData fieldData;
	
	public PlayerResponse(boolean moveOver, boolean[] dice, FieldData fieldData) {
		this.moveOver = moveOver;
		this.dice = dice;
		this.fieldData = fieldData;
	}

	@Override
	public boolean isMoveOver() {
		return moveOver;
	}

	@Override
	public boolean[] getDice() {
		return dice;
	}

	@Override
	public FieldData getFieldData() {
		return fieldData;
	}

}
