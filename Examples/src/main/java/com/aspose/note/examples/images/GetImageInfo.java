package com.aspose.note.examples.images;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.examples.Utils;

public class GetImageInfo {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(GetImageInfo.class) + "images/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

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
			System.out.println("LastModifiedTime: " + image.getLastModifiedTime());
			System.out.println();
		}
	}
}
