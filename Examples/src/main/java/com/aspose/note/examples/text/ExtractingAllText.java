package com.aspose.note.examples.text;

import com.aspose.note.Document;
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
        String text = oneFile.getText();

        // Print text on the output screen
        System.out.println(text);
        // ExEnd:ExtractingAllText
    }
}
