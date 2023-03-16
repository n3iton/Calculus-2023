package org.demetrius.Commands;

import org.demetrius.util.Environment;
import org.demetrius.util.SimpleAudioPlayer;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Panic implements ICommand{
    @Override
    public void execute(Environment environment, String message) throws IOException {
        try {
            SimpleAudioPlayer simpleAudioPlayer = new SimpleAudioPlayer("/Users/demetrius/Desktop/Вычмат/Lab1/music/melody.wav");
        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
        environment.getPrintStream().println("______________________________¶¶¶¶¶¶\n" +
                "_____________________________¶¶¶¶¶¶¶¶¶\n" +
                "____________________________¶¶¶¶¶¶¶¶¶¶\n" +
                "____________________________¶¶¶¶¶¶¶¶¶¶¶\n" +
                "____________________________¶¶¶¶¶¶¶¶¶¶\n" +
                "_____________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "____________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "___________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________¶¶¶¶\n" +
                "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶¶¶¶¶¶\n" +
                "_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______¶¶¶¶¶\n" +
                "________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶\n" +
                "________________¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶\n" +
                "_______________¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶\n" +
                "_______________¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "______________¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "______________¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "____________¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "___________¶¶¶¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "___________¶¶_¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "___________¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "_____________¶¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "__________¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "_________¶__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
                "_________¶_________¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶\n" +
                "__________¶________¶¶¶¶¶¶¶______¶¶¶¶¶¶¶¶\n" +
                "___________¶______¶¶¶¶¶¶¶_________¶¶¶¶¶¶\n" +
                "____________¶____¶¶¶¶¶¶¶__________¶¶¶¶¶¶\n" +
                "_____________¶__¶¶¶¶¶¶¶__________¶¶¶¶¶¶\n" +
                "_______________¶¶¶¶¶¶¶___________¶¶¶¶¶\n" +
                "______________¶¶¶¶¶¶¶_¶¶¶_______¶¶¶¶¶¶\n" +
                "______________¶¶¶¶¶¶_____¶______¶¶¶¶¶\n" +
                "_____________¶¶¶¶¶¶______¶______¶¶¶¶¶\n" +
                "_____________¶¶¶¶¶_______¶_____¶¶¶¶¶¶\n" +
                "____________¶¶¶¶¶_______¶¶_____¶¶¶¶¶¶\n" +
                "___________¶¶¶¶¶¶______¶¶______¶¶¶¶¶¶\n" +
                "___________¶¶¶¶¶¶______¶_______¶¶¶¶¶¶¶¶\n" +
                "____________¶¶¶¶______¶____________¶¶¶¶¶¶\n" +
                "______¶¶¶¶¶¶_¶¶¶_¶¶¶¶¶\n" +
                "¶¶¶¶¶¶_______¶¶¶");

    }

    @Override
    public String getName() {
        return "panic";
    }

    @Override
    public String getDescription() {
        return "panic : shut up and go to bed.";
    }
}