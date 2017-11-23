package fr.iia;

import org.springframework.stereotype.Component;

@Component
public class Guitare extends Instrument {
	@Override
	public String toString() {
		return "une Guitare";
	}
}
