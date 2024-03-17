package org.example;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("we got a sequencer");
        } catch (MidiUnavailableException exception) {
            System.out.println("Bunner");
            exception.printStackTrace();
        } catch (RuntimeException exception){
            System.out.println("Expection handle!!!");
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MusicTest musicTest = new MusicTest();
        musicTest.play();
    }
}
