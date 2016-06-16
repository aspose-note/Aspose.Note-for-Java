package com.aspose.note.examples.load;

import com.aspose.note.KeepPartAndCloneSolidObjectToNextPageAlgorithm;
import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.PdfSaveOptions;

public class UsingKeepSolidObjectsAlgorithm {
	public static void main(String... args) {
		float heightLimitOfClonedPart = 500;
		PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(heightLimitOfClonedPart));
		// or
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(heightLimitOfClonedPart));

		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(100));

		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(400));

		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(100));

		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(400));

        }
}
