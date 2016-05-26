package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import java.io.IOException;

public class LoadDocIntoAsposeNoteUsingPdfsaveoptions {
    public static void main(String... args) throws IOException {
        //ExStart:LoadDocIntoAsposeNoteUsingPdfSaveOptions    
        // Load the document into Aspose.Note.
        Document oneFile = new Document("FullFileName.one");

        // Save the document as PDF
        oneFile.save("FullFileName.pdf", new PdfSaveOptions());
        //ExEnd:LoadDocIntoAsposeNoteUsingPdfSaveOptions
    }
}
