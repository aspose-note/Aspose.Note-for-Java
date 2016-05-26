package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import java.io.IOException;

public class SaveDocToOneNoteFormatUsingSaveformat {

    public static void main(String... args) throws IOException {
        //ExStart:SaveDocToOneNoteFormatUsingSaveFormat
        Document document = new Document("input.one");

        document.save("output", SaveFormat.One);       
        //ExEnd:SaveDocToOneNoteFormatUsingSaveFormat
    }        
}
