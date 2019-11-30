package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.AlwaysSplitObjectsAlgorithm;
import com.aspose.note.Document;
import com.aspose.note.KeepPartAndCloneSolidObjectToNextPageAlgorithm;
import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

public class UsingSplittingAlgorithmMethod {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(UsingSplittingAlgorithmMethod.class) + "load/";

		Document doc = new Document(dataDir + "Sample1.one");

		PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
		
		// ExStart:PageSplittUsingKeepPartAndCloneSolidObjectToNextPageAlgorithm.-1
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(100));
        // ExEnd:PageSplittUsingKeepPartAndCloneSolidObjectToNextPageAlgorithm.-1
        // Or
        // ExStart:PageSplittUsingKeepPartAndCloneSolidObjectToNextPageAlgorithm.-2
        pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(400));
        // ExEnd:PageSplittUsingKeepPartAndCloneSolidObjectToNextPageAlgorithm.-2
        
		try {
			doc.save(dataDir + "UsingSplittingAlgorithmMethod_out.Jpeg", pdfSaveOptions);
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}
}
