package com.aspose.note.examples.text;

import java.util.stream.Collectors;

import com.aspose.note.Document;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

public class ExtractingAllText {
    public static void main(String[] args)
    {
        // ExStart:ExtractingAllText
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(ExtractingAllText.class) + "text\\";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Sample1.one");

        // Retrieve text
        String text = oneFile.getChildNodes(RichText.class).stream()
				.map(RichText::getText)
				.collect(Collectors.joining(System.lineSeparator()));

        // Print text on the output screen
        System.out.println(text);
        // ExEnd:ExtractingAllText
    }
}
