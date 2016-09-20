package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class SaveDocToOneNoteFormatUsingSaveformat {

	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(SaveDocToOneNoteFormatUsingSaveformat.class) + "load/";
		
		Document document = new Document(dataDir + "Sample1.one");

		document.save(dataDir + "SaveDocToOneNoteFormatUsingSaveformat_out.one", SaveFormat.One);
	}
}
