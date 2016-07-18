package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class CreatandSaveANotebook {
	public static void main(String... args) throws IOException {
				
		String outputFile = "test_out_.onetoc2";
		Path outputPath = Utils.getPath(CreatandSaveANotebook.class,outputFile);

		Notebook notebook = new Notebook();

		// Save the Notebook
		notebook.save(outputPath.toString());
	}

}
