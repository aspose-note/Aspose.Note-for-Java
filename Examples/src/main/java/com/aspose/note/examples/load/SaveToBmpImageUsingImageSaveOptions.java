package com.aspose.note.examples.load;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class SaveToBmpImageUsingImageSaveOptions {
    public static void main(String... args) throws IOException {
        // ExStart:SaveToBmpImageUsingImageSaveOptions
        // ExFor:Document.save(java.lang, com.aspose.note.SaveOptions)
        // ExFor:SaveFormat
        // ExFor:ImageSaveOptions
        // ExSummary:Shows how to save a document as image in Bmp format using ImageSaveOptions.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Aspose.one");

        dataDir = dataDir + "SaveToBmpImageUsingImageSaveOptions_out.bmp";

        // Save the document.
        oneFile.save(dataDir, new ImageSaveOptions(SaveFormat.Bmp));

        // ExEnd:SaveToBmpImageUsingImageSaveOptions
    }
}
