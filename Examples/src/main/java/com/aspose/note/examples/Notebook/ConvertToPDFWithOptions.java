package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookPdfSaveOptions;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

public class ConvertToPDFWithOptions {
	public static void main(String... args) throws IOException {
		// ExStart:ConvertToPDFWithOptions
		String dataDir = Utils.getSharedDataDir(ConvertToPDFWithOptions.class) + "Notebook/";
		
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		NotebookPdfSaveOptions notebookSaveOptions = new NotebookPdfSaveOptions();

		PdfSaveOptions documentSaveOptions = notebookSaveOptions.getDocumentSaveOptions();

		documentSaveOptions.setPageSplittingAlgorithm (new KeepSolidObjectsAlgorithm());

		dataDir = dataDir + "ExportNotebooktoPDFwithOptions_out.pdf";

		// Save the Notebook
		notebook.save(dataDir, notebookSaveOptions);
		// ExEnd:ConvertToPDFWithOptions
	}

}
