package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class SetOutputImageResolution {
	public static void main(String... args) throws IOException {
		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(SetOutputImageResolution.class, inputFile);

		String outputFile = "output.Jpeg";
		Path outputPath = Utils.getPath(SetOutputImageResolution.class, outputFile);

		Document doc = new Document(inputPath.toString());

		ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.Jpeg);

		imageSaveOptions.setResolution(120);

		doc.save(outputPath.toString(), imageSaveOptions);
	}
}
