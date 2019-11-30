package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class ConvertToImage {
	public static void main(String... args) throws IOException {
		// ExStart:ConvertToImage
		String dataDir = Utils.getSharedDataDir(ConvertToImage.class) + "Notebook/";
		
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		dataDir = dataDir + "ExportNotebooktoImage_out.png";
		
		// Save the Notebook
		notebook.save(dataDir);
		// ExEnd:ConvertToImage
	}

}
