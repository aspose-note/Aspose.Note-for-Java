package com.aspose.note.examples.images;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.examples.Utils;

public class ExtractImages {
	public static void main(String[] args) throws IOException {
		// ExStart:ExtractImages
		String dataDir = Utils.getSharedDataDir(ExtractImages.class) + "images/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

		// Get all images
		List<Image> list = doc.getChildNodes(Image.class);
		System.out.printf("Total Images: %s\n\n", list.size());

		// Traverse the list
		for (int i = 0; i < list.size(); i++) {
			Image image = list.get(i);

			String outputFile = "ExtractImages_out" + i + "_" + image.getFileName();

			byte[] buffer = image.getBytes();
			Files.write(Paths.get(dataDir + outputFile), buffer);
			System.out.printf("File saved: %s\n", dataDir);
		}
		// ExEnd:ExtractImages
	}
}
