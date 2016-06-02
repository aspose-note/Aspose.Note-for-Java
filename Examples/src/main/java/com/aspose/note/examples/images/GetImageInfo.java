package com.aspose.note.examples.images;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class GetImageInfo {
	public static void main(String... args) throws IOException {

		// ExStart:GetImageInfo

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(GetImageInfo.class, inputFile);

		// Load the document into Aspose.Note
		Document doc = new Document(inputPath.toString());

		// Get all images
		List<Image> list = doc.getChildNodes(Image.class);
		System.out.printf("Total Images: %s\n\n", list.size());

		// Traverse the list
		for (Image image : list) {
			System.out.println("Width: " + image.getWidth());
			System.out.println("Height: " + image.getHeight());
			System.out.println("OriginalWidth: " + image.getOriginalWidth());
			System.out.println("OriginalHeight: " + image.getOriginalHeight());
			System.out.println("FileName: " + image.getFileName());
			System.out.println("Extension: " + image.getExtension());
			System.out.println("LastModifiedTime: " + image.getLastModifiedTime());
			System.out.println();
		}
		// ExEnd:GetImageInfo
	}
}
