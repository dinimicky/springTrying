package com.springinaction.springidol;

public class Sonnet29 implements Poem {
	private static String[] LINES = {
		"When, in disgrace with fortune and men's eyes,",
		"I all alone beweep my outcast state",
		"And trouble deaf heaven with my bootless cries"
	};

	public Sonnet29() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recite() {
		// TODO Auto-generated method stub
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}

	}

}
