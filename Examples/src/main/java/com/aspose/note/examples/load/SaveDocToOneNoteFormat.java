package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.examples.Utils;

public class SaveDocToOneNoteFormat {

	public static void main(String... args) throws IOException {
		// ExStart:SaveDocToOneNoteFormat
		String dataDir = Utils.getSharedDataDir(SaveDocToOneNoteFormat.class) + "load/";
		
		Document doc = new Document(dataDir + "Sample1.one");
		doc.save(dataDir + "SaveDocToOneNoteFormat_out.one");
		// ExEnd:SaveDocToOneNoteFormat
	}
}
