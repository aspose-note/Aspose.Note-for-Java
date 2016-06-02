package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class ConvertToImageUsingDefaultOptions {
	public static void main(String... args) throws IOException {
		// ExStart:ConvertToImageUsingDefaultOptions
		// Load the document into Aspose.Note.

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ConvertToImageUsingDefaultOptions.class, inputFile);
		String outputFile = "ConvertOneNoteToImageWithDefaultOptions.gif";
		Path outputPath = Utils.getPath(ConvertToImageUsingDefaultOptions.class, outputFile);

		Document oneFile = new Document(inputPath.toString(), new LoadOptions());

		// Save the document as Gif.
		oneFile.save(outputPath.toString(), SaveFormat.Gif);
		// ExEnd:ConvertToImageUsingDefaultOptions
	}
}
