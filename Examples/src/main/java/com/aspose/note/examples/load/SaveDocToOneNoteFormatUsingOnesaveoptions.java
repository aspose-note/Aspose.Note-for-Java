package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.OneSaveOptions;
import com.aspose.note.examples.Utils;

public class SaveDocToOneNoteFormatUsingOnesaveoptions {

	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(SaveDocToOneNoteFormat.class) + "load/";

		Document document = new Document(dataDir + "Sample1.one");

		document.save(dataDir + "SaveDocToOneNoteFormatUsingOnesaveoptions_out.one", new OneSaveOptions());
	}
}
