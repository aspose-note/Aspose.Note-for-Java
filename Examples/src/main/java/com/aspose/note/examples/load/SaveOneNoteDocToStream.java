package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SaveOneNoteDocToStream {
    public static void main(String... args) throws IOException {
        //ExStart:SaveOneNoteDocToStream
        // Load the document into Aspose.Note. 
        Document doc = new Document("Document.one"); 

        ByteArrayOutputStream dstStream = new ByteArrayOutputStream (); 

        doc.save(dstStream, SaveFormat.Pdf); 
        //ExEnd:SaveOneNoteDocToStream
    }    
}
