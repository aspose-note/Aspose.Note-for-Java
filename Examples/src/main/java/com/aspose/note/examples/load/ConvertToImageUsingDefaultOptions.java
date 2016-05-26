package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.SaveFormat;
import java.io.IOException;

public class ConvertToImageUsingDefaultOptions {
    public static void main(String... args) throws IOException {
        //ExStart:ConvertToImageUsingDefaultOptions
        // Load the document into Aspose.Note.
        Document oneFile = new Document("SeveralImagesOnPageJoint.one", new LoadOptions());

        // Save the document as Gif.
        oneFile.save("ConvertOneNoteToImageWithDefaultOptions.gif", SaveFormat.Gif);
        //ExEnd:ConvertToImageUsingDefaultOptions
    }
}
