package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.TextStyle;
import java.awt.Color;
import java.io.IOException;

public class CreateDocWithSimpleRichText {

	public static void main(String... args) throws IOException {

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
		doc.save("out.pdf", SaveFormat.Pdf);
	}
}
