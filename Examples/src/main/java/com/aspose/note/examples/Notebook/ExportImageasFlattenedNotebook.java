package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.ImageSaveOptions;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ExportImageasFlattenedNotebook {
	public static void main(String... args) throws IOException {
		
		Path dataDirPath = Utils.getPath(ExportImageasFlattenedNotebook.class,"");
		
		String dataDir = dataDirPath.toString() + '/';
		
		Notebook notebook = new Notebook(dataDir + "test.onetoc2");

		NotebookImageSaveOptions saveOptions = new NotebookImageSaveOptions(SaveFormat.Png);

		ImageSaveOptions documentSaveOptions = saveOptions.getDocumentSaveOptions();

		documentSaveOptions.setResolution(400);

		saveOptions.setFlatten(true);

		notebook.save(dataDir + "test.png", saveOptions);
	}

}
