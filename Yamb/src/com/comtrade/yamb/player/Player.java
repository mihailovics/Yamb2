package com.comtrade.yamb.player;

import com.comtrade.yamb.Request;
import com.comtrade.yamb.Response;
import com.comtrade.yamb.player.Anja.UpisBacanja;

public class Player {
	public Response play(Request request) {
	      
		   UpisBacanja upis = new UpisBacanja();
			  
		      return upis.napraviUpis(request);
   }
}
