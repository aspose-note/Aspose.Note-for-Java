package com.aspose.note.examples.load;

import com.aspose.note.KeepPartAndCloneSolidObjectToNextPageAlgorithm;
import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.PdfSaveOptions;

public class UsingKeepSolidObjectsAlgorithm {
	public static void main(String... args) {
		// ExStart:UsingKeepSolidObjectsAlgorithm
		float heightLimitOfClonedPart = 500;
		PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
		pdfSaveOptions
				.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(heightLimitOfClonedPart));
		// or
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(heightLimitOfClonedPart));
		// ExEnd:UsingKeepSolidObjectsAlgorithm

		// ExStart:UsingKeepSolidObjectsAlgorithm1
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(100));
		// ExEnd:UsingKeepSolidObjectsAlgorithm1

		// ExStart:UsingKeepSolidObjectsAlgorithm2
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm(400));
		// ExEnd:UsingKeepSolidObjectsAlgorithm2

		// ExStart:UsingKeepSolidObjectsAlgorithm3
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(100));
		// ExEnd:UsingKeepSolidObjectsAlgorithm3

		// ExStart:UsingKeepSolidObjectsAlgorithm4
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm(400));
		// ExEnd:UsingKeepSolidObjectsAlgorithm4
	}
}
