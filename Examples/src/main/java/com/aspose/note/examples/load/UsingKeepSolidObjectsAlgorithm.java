package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.AlwaysSplitObjectsAlgorithm;
import com.aspose.note.Document;
import com.aspose.note.KeepPartAndCloneSolidObjectToNextPageAlgorithm;
import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

public class UsingKeepSolidObjectsAlgorithm {
	public static void main(String... args) throws IOException {
		
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(UsingKeepSolidObjectsAlgorithm.class) + "load\\";

        // Load the document into Aspose.Note.
        Document doc = new Document(dataDir + "Aspose.one");
		// ExStart:KeepSOlidObjectsAlgoirthm-1
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        pdfSaveOptions.setPageSplittingAlgorithm(new AlwaysSplitObjectsAlgorithm());
        // Or
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm());
        // Or
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm());
        // ExEnd:KeepSOlidObjectsAlgoirthm-1

        // ExStart:KeepSOlidObjectsAlgoirthm-2
        float heightLimitOfClonedPart = 500;
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(heightLimitOfClonedPart));
        // Or
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(heightLimitOfClonedPart));
        // ExEnd:KeepSOlidObjectsAlgoirthm-2

        // ExStart:KeepSOlidObjectsAlgoirthm-3
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(100));
        // ExEnd:KeepSOlidObjectsAlgoirthm-3
        // Or
        // ExStart:KeepSOlidObjectsAlgoirthm-4
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(400));
        // ExEnd:KeepSOlidObjectsAlgoirthm-4
        dataDir = dataDir + "UsingKeepSOlidObjectsAlgoirthm_out.pdf";
        doc.save(dataDir);
        }
}
