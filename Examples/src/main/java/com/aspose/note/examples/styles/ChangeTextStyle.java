package com.aspose.note.examples.styles;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.RichText;
import com.aspose.note.TextRun;
import com.aspose.note.TextStyle;
import com.aspose.note.examples.Utils;

public class ChangeTextStyle {
	public static void main(String... args) throws IOException {
		// ExStart:ChangeTextStyle
		String dataDir = Utils.getSharedDataDir(ChangeTextStyle.class) + "styles/";

		// Load the document into Aspose.Note
		Document document = new Document(dataDir + "Sample1.one");

		// Get a particular RichText node
		List<RichText> richTextNodes = document.getChildNodes(RichText.class);
		RichText richText = richTextNodes.get(0);

		for (TextRun run : richText.getTextRuns()) {
			// Set font color
			run.getStyle().setFontColor(Color.yellow);
			// Set highlight color
			run.getStyle().setHighlight(Color.blue);
			// Set font size
			run.getStyle().setFontSize(20);
		}

		document.save(dataDir + "ChangeTextStyle_out.pdf");
		System.out.printf("File saved: %s\n", dataDir + "ChangeTextStyle_out.pdf");
		// ExEnd:ChangeTextStyle
	}
}
