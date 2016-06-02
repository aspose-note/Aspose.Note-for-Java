package com.aspose.note.examples.introduction;

import java.io.IOException;
import com.aspose.note.*;
import com.aspose.note.examples.Utils;
import java.awt.*;
import java.nio.file.Path;

public class CreateOneNoteDocumentWithSimpleRichText {

	public static void main(String... args) throws IOException {
		// ExStart:CreateOneNoteDocumentWithSimpleRichText
		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(CreateOneNoteDocumentWithSimpleRichText.class, outputFile);

		// For complete examples and data files, please go to
		// https://github.com/aspose-note/Aspose.Note-for-Java
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);
		// initialize Outline class object
		Outline outline = new Outline(doc);
		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement(doc);

		// initialize TextStyle class object and set formatting properties
		TextStyle textStyle = new TextStyle();
		textStyle.setFontColor(Color.black);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);

		// initialize RichText class object and apply text style
		RichText text = new RichText(doc);
		text.setText("Hello OneNote text!");
		text.setDefaultStyle(textStyle);

		// add RichText node
		outlineElem.appendChild(text);
		// add OutlineElement node
		outline.appendChild(outlineElem);
		// add Outline node
		page.appendChild(outline);
		// add Page node
		doc.appendChild(page);
		// save OneNote document
		doc.save(outputPath.toString(), SaveFormat.Pdf);

		// ExEnd:CreateOneNoteDocumentWithSimpleRichText
	}

}
