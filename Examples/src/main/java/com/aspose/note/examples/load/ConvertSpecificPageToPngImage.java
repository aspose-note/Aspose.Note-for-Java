package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.LoadOptions;
import com.aspose.note.SaveFormat;
import java.io.IOException;

public class ConvertSpecificPageToPngImage {
    public static void main(String... args) throws IOException {
        //ExStart:ConvertSpecificPageToPngImage
        // Load the document into Aspose.Note.
        Document oneFile = new Document("SeveralImagesOnPageJoint.one", new LoadOptions());

        // Initialize ImageSaveOptions object
        ImageSaveOptions opts = new ImageSaveOptions(SaveFormat.Png);
        // set page index
        opts.setPageIndex(0);

        // Save the document as PNG.
        oneFile.save("ConvertOneNoteToImageWithSpecificPag.png", opts);
        //ExEnd:ConvertSpecificPageToPngImage
    }    
}
