package com.aspose.note.examples.load;

import com.aspose.note.AlwaysSplitObjectsAlgorithm;
import com.aspose.note.Document;
import com.aspose.note.KeepPartAndCloneSolidObjectToNextPageAlgorithm;
import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class UsingSplittingAlgorithmMethod {
	public static void main(String... args) throws IOException {

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(UsingSplittingAlgorithmMethod.class, inputFile);

		String outputFile = "output.Jpeg";
		Path outputPath = Utils.getPath(UsingSplittingAlgorithmMethod.class, outputFile);

		Document doc = new Document(inputPath.toString());

		PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
		pdfSaveOptions.setPageSplittingAlgorithm(new AlwaysSplitObjectsAlgorithm());
		// or
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepPartAndCloneSolidObjectToNextPageAlgorithm());
		// or
		pdfSaveOptions.setPageSplittingAlgorithm(new KeepSolidObjectsAlgorithm());
		try {
			doc.save(outputPath.toString(), pdfSaveOptions);
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}
}
