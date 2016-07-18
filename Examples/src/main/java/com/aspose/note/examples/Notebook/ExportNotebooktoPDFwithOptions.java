package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.KeepSolidObjectsAlgorithm;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookPdfSaveOptions;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

public class ExportNotebooktoPDFwithOptions {
	public static void main(String... args) throws IOException {
		
		Path dataDirPath = Utils.getPath(ExportNotebooktoPDFwithOptions.class,"");
		
		String dataDir = dataDirPath.toString() + '/';
		
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		NotebookPdfSaveOptions notebookSaveOptions = new NotebookPdfSaveOptions();

		PdfSaveOptions documentSaveOptions = notebookSaveOptions.getDocumentSaveOptions();

		documentSaveOptions.setPageSplittingAlgorithm (new KeepSolidObjectsAlgorithm());

		dataDir = dataDir + "ConvertToPDF_out_.pdf";

		// Save the Notebook
		notebook.save(dataDir, notebookSaveOptions);
	}

}
