package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.OneSaveOptions;
import java.io.IOException;

public class SaveDocToOneNoteFormatUsingOnesaveoptions {

    public static void main(String... args) throws IOException {
        //ExStart:SaveDocToOneNoteFormatUsingOneSaveOptions
        Document document = new Document("input.one");

        document.save("output", new OneSaveOptions());
        //ExEnd:SaveDocToOneNoteFormatUsingOneSaveOptions
    }        
}
