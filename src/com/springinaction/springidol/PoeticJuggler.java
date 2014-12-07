package com.springinaction.springidol;

public class PoeticJuggler extends Juggler {
	private Poem poem;

	public PoeticJuggler(Poem poem) {
		// TODO Auto-generated constructor stub
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		// TODO Auto-generated constructor stub
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
