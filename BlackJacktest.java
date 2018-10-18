package com.infosys.BlackJack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJacktest {

	@Test
	public void playTest() {
		BlackJack black = new BlackJack();
		assertEquals(19,black.play(18,19));
		
	}


	
}

