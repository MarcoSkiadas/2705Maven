package org.JavaFullstackProjekt;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {

    String asciiArt1 = FigletFont.convertOneLine("Hello World");
    System.out.println(asciiArt1);
    }
}
