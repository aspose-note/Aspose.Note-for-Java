package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.OneSaveOptions;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class SaveDocToOneNoteFormatUsingOnesaveoptions {

	public static void main(String... args) throws IOException {
		// ExStart:SaveDocToOneNoteFormatUsingOneSaveOptions

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(SaveDocToOneNoteFormat.class, inputFile);
		String outputFile = "output.one";
		Path outputPath = Utils.getPath(SaveDocToOneNoteFormat.class, outputFile);

		Document document = new Document(inputPath.toString());

		document.save(outputPath.toString(), new OneSaveOptions());
		// ExEnd:SaveDocToOneNoteFormatUsingOneSaveOptions
	}
}
