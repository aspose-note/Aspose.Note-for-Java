package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import java.io.IOException;

public class LoadDocIntoAsposeNoteUsingSaveformat {
    public static void main(String... args) throws IOException {        
        //ExStart:LoadDocIntoAsposeNoteUsingSaveFormat    
        // Load the document into Aspose.Note.
        Document oneFile = new Document("FullFileName.one");

        // Save the document as PDF
        oneFile.save("FullFileName.pdf", SaveFormat.Pdf);
        //ExEnd:LoadDocIntoAsposeNoteUsingSaveFormat
    }    
}
