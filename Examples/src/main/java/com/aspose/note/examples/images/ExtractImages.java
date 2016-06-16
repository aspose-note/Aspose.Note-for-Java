package com.aspose.note.examples.images;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.examples.Utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ExtractImages {
	public static void main(String... args) throws IOException {

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ExtractImages.class, inputFile);

		// Load the document into Aspose.Note
		Document doc = new Document(inputPath.toString());

		// Get all images
		List<Image> list = doc.getChildNodes(Image.class);
		System.out.printf("Total Images: %s\n\n", list.size());

		// Traverse the list
		for (int i = 0; i < list.size(); i++) {
			Image image = list.get(i);

			String outputFile = "Output-" + i + "_" + image.getFileName();
			Path outputPath = Utils.getPath(ExtractImages.class, outputFile);

			byte[] buffer = image.getBytes();
			Files.write(outputPath, buffer);

			System.out.printf("File saved: %s\n", outputPath);
		}

	}
}
