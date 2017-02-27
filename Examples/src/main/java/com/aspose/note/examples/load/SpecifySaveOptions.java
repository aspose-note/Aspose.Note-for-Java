package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class SpecifySaveOptions {
    public static void main(String[] args) throws IOException {
        // ExStart:SpecifySaveOptions
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SpecifySaveOptions.class) + "load\\";

        // Load the document into Aspose.Note.
        Document doc = new Document(dataDir + "Aspose.one");

        // Initialize PdfSaveOptions object
        PdfSaveOptions opts = new PdfSaveOptions();

        // Set page index
        opts.setPageIndex(2);

        // Set page count
        opts.setPageCount(3);

        dataDir = dataDir + "Document.SaveWithOptions_out.pdf";
        doc.save(dataDir, opts);
        // ExEnd:SpecifySaveOptions
    }
}
