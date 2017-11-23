package fr.iia;

import org.springframework.stereotype.Component;

@Component
public class Guitariste {
	private Instrument instrument;

	@Override
	public String toString() {
		if (instrument != null)
			return "Je suis un Guitariste. Mon instrument est " + instrument;
		else
			return "Je suis un Guitariste. Mais je ne suis pas prêt";
	}
	
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
