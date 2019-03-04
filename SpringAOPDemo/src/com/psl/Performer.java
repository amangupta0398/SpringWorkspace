package com.psl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="perform")
public class Performer {

	
	public void performerHaveLunch() {
		System.out.println("performer having a lunch");
	}

	public void perform() throws Exception {
		System.out.println("performer performing");
		throw new Exception();
	}

	public void giveAutoGraph() {
		System.out.println("Batwaaj Autograph");
	}

	public void takeFlightToHome() {
		System.out.println("Acha Chalta Hu Dua Me Yaad Rakhna!!!!!");
	}

}
