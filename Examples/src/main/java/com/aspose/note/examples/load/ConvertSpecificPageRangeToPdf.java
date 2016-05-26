package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import java.io.IOException;

public class ConvertSpecificPageRangeToPdf {
    public static void main(String... args) throws IOException {
        //ExStart:ConvertSpecificPageRangeToPdf
        // Load the document into Aspose.Note.
        Document oneFile = new Document("FullFileName.one");

        // Initialize PdfSaveOptions object
        PdfSaveOptions opts = new PdfSaveOptions();
        // Set page index
        opts.setPageIndex(2);
        // Set page count
        opts.setPageCount(3);

        // Save the document as PDF
        oneFile.save("FullFileName.pdf", opts);
        //ExEnd:ConvertSpecificPageRangeToPdf
    }    
}
