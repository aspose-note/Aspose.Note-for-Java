package com.aspose.note.examples.load;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class SaveToBinaryImageUsingOtsuMethod {
    public static void main(String... args) throws IOException {
        // ExStart:SaveToBinaryImageUsingOtsuMethod
        // ExFor:Document.save(java.lang, com.aspose.note.SaveOptions)
        // ExFor:SaveFormat
        // ExFor:ImageSaveOptions
        // ExFor:ImageSaveOptions.setColorMode(int)
        // ExFor:ImageSaveOptions.setBinarizationOptions(com.aspose.note.ImageBinarizationOptions)
        // ExFor:ColorMode
        // ExFor:ImageBinarizationOptions
        // ExFor:ImageBinarizationOptions.setBinarizationMethod(int)
        // ExFor:BinarizationMethod
        // ExSummary:Shows how to save a document as binary image using fixed threshold.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Aspose.one");

        dataDir = dataDir + "SaveToBinaryImageUsingOtsuMethod_out.png";

        ImageBinarizationOptions binarizationOptions = new ImageBinarizationOptions();
        binarizationOptions.setBinarizationMethod(BinarizationMethod.Otsu);

        ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png);
        options.setColorMode(ColorMode.BlackAndWhite);
        options.setBinarizationOptions(binarizationOptions);

        // Save the document.
        oneFile.save(dataDir, options);

        // ExEnd:SaveToBinaryImageUsingOtsuMethod
    }
}
