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
		pdfSaveOptions.setPageSplittingAlgorithm(new AlwaysSplitObjectsAlgorithm());
		// or
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm());
		// or
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm());
		try {
			doc.save(dataDir + "UsingSplittingAlgorithmMethod_out.Jpeg", pdfSaveOptions);
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}
}
