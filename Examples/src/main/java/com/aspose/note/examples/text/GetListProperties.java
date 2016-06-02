package com.aspose.note.examples.text;

import com.aspose.note.Document;
import com.aspose.note.NumberList;
import com.aspose.note.OutlineElement;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class GetListProperties {
	public static void main(String... args) throws IOException {
		// ExStart:GetListProperties

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(GetListProperties.class, inputFile);

		// Load the document into Aspose.Note
		Document oneFile = new Document(inputPath.toString());

		// Retrieve a collection nodes of the outline element
		List<OutlineElement> nodes = oneFile.getChildNodes(OutlineElement.class);

		// Iterate through each node
		for (OutlineElement node : nodes) {
			if (node.getNumberList() != null) {
				NumberList list = node.getNumberList();
				// Retrieve font name
				System.out.println("Font Name: " + list.getFont());
				// Retrieve font length
				System.out.println("Font Length: " + list.getFont());
				// Retrieve font size
				System.out.println("Font Size: " + list.getFontSize());
				// Retrieve font color
				System.out.println("Font Color: " + list.getFontColor());
				// Retrieve format
				System.out.println("Font format: " + list.getFormat());
				// Check bold
				System.out.println("Is bold: " + list.isBold());
				// Check italic
				System.out.println("Is italic: " + list.isItalic());

				System.out.println();
			}
		}
		// ExEnd:GetListProperties
	}
}
