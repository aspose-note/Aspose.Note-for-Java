package com.aspose.note.examples.load;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Paths;

public class SaveToPdfUsingPageSettings {
    public static void main(String... args) throws IOException {
        SaveToPdfUsingLetterPageSettings();
        SaveToPdfUsingA4PageSettingsWithoutHeightLimit();
    }


    public static void SaveToPdfUsingLetterPageSettings() throws IOException
    {
        // ExStart:SaveToPdfUsingLetterPageSettings
        // ExSummary:Shows how to save a document in Pdf format with Letter page layout.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveToPdfUsingPageSettings.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "OneNote.one").toString());

        String dst = Paths.get(dataDir, "SaveToPdfUsingLetterPageSettings.pdf").toString();

        // Save the document.
        PdfSaveOptions options = new PdfSaveOptions();
        options.setPageSettings(PageSettings.getLetter());
        oneFile.save(dst, options);

        // ExEnd:SaveToPdfUsingLetterPageSettings
    }

    public static void SaveToPdfUsingA4PageSettingsWithoutHeightLimit() throws IOException
    {
        // ExStart:SaveToPdfUsingA4PageSettingsWithoutHeightLimit
        // ExSummary:Shows how to save a document in Pdf format with A4 page layout without height limit.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveToPdfUsingPageSettings.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "OneNote.one").toString());

        String dst = Paths.get(dataDir, "SaveToPdfUsingA4PageSettingsWithoutHeightLimit.pdf").toString();

        // Save the document.
        PdfSaveOptions options = new PdfSaveOptions();
        options.setPageSettings(PageSettings.getA4NoHeightLimit());
        oneFile.save(dst, options);

        // ExEnd:SaveToPdfUsingA4PageSettingsWithoutHeightLimit
    }
}
