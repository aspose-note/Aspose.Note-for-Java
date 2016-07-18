package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class ExportNotebooktoImage {
	public static void main(String... args) throws IOException {
		
		Path dataDirPath = Utils.getPath(ExportNotebooktoImage.class,"");
		
		String dataDir = dataDirPath.toString() + '/';
		
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		dataDir = dataDir + "ConvertToImage_out.png";
		
		// Save the Notebook
		notebook.save(dataDir);
	}

}
