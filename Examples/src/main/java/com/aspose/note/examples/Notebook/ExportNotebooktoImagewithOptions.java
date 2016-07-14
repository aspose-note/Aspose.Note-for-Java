package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.ImageSaveOptions;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ExportNotebooktoImagewithOptions {
	public static void main(String... args) throws IOException {
		
		Path dataDirPath = Utils.getPath(ExportNotebooktoImagewithOptions.class,"");
		
		String dataDir = dataDirPath.toString() + '/';
		
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "test.onetoc2");

		NotebookImageSaveOptions notebookSaveOptions = new NotebookImageSaveOptions(SaveFormat.Png);

		ImageSaveOptions documentSaveOptions = notebookSaveOptions.getDocumentSaveOptions();

		documentSaveOptions.setResolution(400);

		dataDir = dataDir + "ConvertToImageWithOptions_out_.png";

		// Save the Notebook
		notebook.save(dataDir, notebookSaveOptions);
	}

}
