package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class SaveToJpegImageUsingSaveFormat {
    public static void main(String... args) throws IOException {
        // ExStart:SaveToJpegImageUsingSaveFormat
        // ExFor:Document.save(java.lang, com.aspose.note.SaveOptions)
        // ExFor:SaveFormat
        // ExSummary:Shows how to save a document as image in Jpeg format using SaveFormat.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Aspose.one");

        dataDir = dataDir + "SaveToJpegImageUsingSaveFormat_out.jpg";

        // Save the document.
        oneFile.save(dataDir, SaveFormat.Jpeg);

        // ExEnd:SaveToJpegImageUsingSaveFormat
    }
}
