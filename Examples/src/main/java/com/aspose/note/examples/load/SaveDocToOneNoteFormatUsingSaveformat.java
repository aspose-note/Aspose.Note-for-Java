package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class SaveDocToOneNoteFormatUsingSaveformat {

	public static void main(String... args) throws IOException {
		// ExStart:SaveDocToOneNoteFormatUsingSaveFormat
		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(SaveDocToOneNoteFormatUsingSaveformat.class, inputFile);
		String outputFile = "output.one";
		Path outputPath = Utils.getPath(SaveDocToOneNoteFormatUsingSaveformat.class, outputFile);

		Document document = new Document(inputPath.toString());

		document.save(outputPath.toString(), SaveFormat.One);
		// ExEnd:SaveDocToOneNoteFormatUsingSaveFormat
	}
}
