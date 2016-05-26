package com.aspose.note.examples.load;

import com.aspose.note.AlwaysSplitObjectsAlgorithm;
import com.aspose.note.Document;
import com.aspose.note.KeepPartAndCloneSolidObjectToNextPageAlgorithm;
import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.PdfSaveOptions;

public class UsingSplittingAlgorithmMethod {
    public static void main(String... args) {
        //ExStart:UsingSplittingAlgorithmMethod
        Document doc = new Document("sample.one");

        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        pdfSaveOptions.setPageSplittingAlgorithm(new AlwaysSplitObjectsAlgorithm());
        // or
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm());
        // or
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm());
        try {
            doc.save("out.pdf", pdfSaveOptions);
        }
        catch (Exception ex)
        {
            System.out.println("Exception: " + ex.getMessage());
        }        
        //ExEnd:UsingSplittingAlgorithmMethod
    }    
}
