package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class LoadPasswordProtectedOneNoteDoc {
	public static void main(String... args) throws IOException {
		// ExStart:LoadPasswordProtectedOneNoteDoc

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(LoadDocIntoAsposeNoteUsingSaveformat.class, inputFile);

		LoadOptions loadOptions = new LoadOptions();

		loadOptions.setDocumentPassword("password");

		Document doc = new Document(inputPath.toString(), loadOptions);
		// ExEnd:LoadPasswordProtectedOneNoteDoc
	}
}
