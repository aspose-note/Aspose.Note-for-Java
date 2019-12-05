package com.aspose.note.examples.text;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.NumberList;
import com.aspose.note.OutlineElement;
import com.aspose.note.examples.Utils;

public class GetListProperties {
	public static void main(String... args) throws IOException {
		// ExStart:GetListProperties
		String dataDir = Utils.getSharedDataDir(GetListProperties.class) + "text/";

		// Load the document into Aspose.Note
		Document oneFile = new Document(dataDir + "Sample1.one");

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
