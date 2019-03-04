package com.psl.demo;

public class Performance {

	// private Singer s;
	// private Dancer d;
	IArt art;

	public Performance(IArt art) {

		// s=new Singer();
		// d=new Dancer();
		this.art = art;
	}

	public void perform() {
		// s.doArt();
		// d.doArt();
		art.doArt();
	}
}
