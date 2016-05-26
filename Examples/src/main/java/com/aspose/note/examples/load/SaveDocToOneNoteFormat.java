package com.aspose.note.examples.load;

import com.aspose.note.Document;
import java.io.IOException;

public class SaveDocToOneNoteFormat {
    
    public static void main(String... args) throws IOException {
        //ExStart:SaveDocToOneNoteFormat
        Document doc = new Document("input.one");

        doc.save("output.one");        
        //ExEnd:SaveDocToOneNoteFormat
    }        
}
