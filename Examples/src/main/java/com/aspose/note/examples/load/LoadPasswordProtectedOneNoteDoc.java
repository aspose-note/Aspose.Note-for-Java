package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;

public class LoadPasswordProtectedOneNoteDoc {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(LoadPasswordProtectedOneNoteDoc.class) + "load/";

		LoadOptions loadOptions = new LoadOptions();

		loadOptions.setDocumentPassword("password");

		Document doc = new Document(dataDir + "Sample1.one", loadOptions);
		
		System.out.println(doc.getFileFormat());
	}
}
