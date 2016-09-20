package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class ExportNotebooktoPDF {
	public static void main(String... args) throws IOException {
		
		String dataDir = Utils.getSharedDataDir(ExportNotebooktoPDF.class) + "Notebook/";
				
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		dataDir = dataDir + "ExportNotebooktoPDF_out.pdf";

		// Save the Notebook
		notebook.save(dataDir);
	}

}
