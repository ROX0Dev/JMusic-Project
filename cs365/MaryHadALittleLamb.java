package cs365;

import jm.JMC;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class MaryHadALittleLamb implements JMC {
	private Part instrument;
	private Phrase phrase1;
	private Score song;
	private int[] noteArray;
	private double[] rhythmArray;
	
	private enum LAMB {
		MaryHadALittleLamb;
	}
	
	public static void main(String[] args) {
		MaryHadALittleLamb song = new MaryHadALittleLamb(LAMB.MaryHadALittleLamb);
		song.play();
		
	}
	
	public MaryHadALittleLamb(LAMB playSong) {
		song = new Score("MaryHadALittleLamb", 140.0);
		instrument = new Part(SGUITAR,0);
		phrase1 = new Phrase(0.0);
		
		noteArray = new int[] { B3, A3, G3, A3, B3, B3, B3, A3, A3, A3, B3, B3, B3, B3, A3, G3, A3, B3, B3, B3, B3, A3, A3, B3, A3, G3  };
		
   rhythmArray = new double[] { QN, QN, QN, QN, QN, QN, HN, QN, QN, HN, QN, QN, HN, QN, QN, QN, QN, QN, QN, QN, QN, QN, QN, QN, QN, WN  };
		
		
		
		
		phrase1.addNoteList(noteArray, rhythmArray);
		instrument.addPhrase(phrase1);
		song.addPart(instrument);
		
	}
	
	public void play() {
		Play.midi(song);
	}
}
