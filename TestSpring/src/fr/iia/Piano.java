package fr.iia;

import org.springframework.stereotype.Component;

@Component
public class Piano extends Instrument {
	@Override
	public String toString() {
		return "un Piano";
	}
}
