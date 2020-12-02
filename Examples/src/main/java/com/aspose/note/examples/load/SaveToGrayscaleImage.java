package com.aspose.note.examples.load;

import com.aspose.note.ColorMode;
import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class SaveToGrayscaleImage {
    public static void main(String... args) throws IOException {
        // ExStart:SaveAsGrayscaleImage
        // ExFor:Document.Save(java.lang, com.aspose.note.SaveOptions)
        // ExFor:SaveFormat
        // ExFor:ImageSaveOptions
        // ExFor:ImageSaveOptions.setColorMode(int)
        // ExFor:ColorMode
        // ExSummary:Shows how to save a document as grayscale image.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Aspose.one");

        dataDir = dataDir + "SaveAsGrayscaleImage_out.png";

        ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png);
        options.setColorMode(ColorMode.GrayScale);

        // Save the document.
        oneFile.save(dataDir, options);

        // ExEnd:SaveAsGrayscaleImage
    }
}
