package com.aspose.note.examples.hyperlinks;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.TextStyle;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class AddHyperlink {
	public static void main(String... args) throws IOException {
		// ExStart:AddHyperlink
		String dataDir = Utils.getSharedDataDir(AddHyperlink.class) + "hyperlinks/";
		
		// create an object of the Document class
		Document doc = new Document();

		// initialize Page class object
		Page page = new Page();

		// initialize Title class object
		Title title = new Title();

		// initialize default text style
		ParagraphStyle defaultTextStyle = new ParagraphStyle()
												.setFontName("Arial")
												.setFontSize(10)
												.setFontColor(java.awt.Color.GRAY);

		RichText titleText = new RichText().append("Title");
		titleText.setParagraphStyle(defaultTextStyle);

		Outline outline = new Outline();
		outline.setMaxWidth(200);
		outline.setMaxHeight(200);
		outline.setVerticalOffset(100);
		outline.setHorizontalOffset(100);

		OutlineElement outlineElem = new OutlineElement();

		TextStyle textStyleRed = new TextStyle()
										.setFontName("Arial")
										.setFontSize(10)
										.setFontColor(java.awt.Color.red);

		RichText text = new RichText()
								.append("This is ", textStyleRed)
								.append("hyperlink", new TextStyle().setHyperlinkAddress("www.google.com"))
								.append(". This text is not a hyperlink.", TextStyle.getDefault());
		text.setParagraphStyle(defaultTextStyle);

		title.setTitleText(titleText);
		page.setTitle(title);
		outlineElem.appendChildLast(text);

		// add outline elements
		outline.appendChildLast(outlineElem);

		// add Outline node
		page.appendChildLast(outline);

		// add Page node
		doc.appendChildLast(page);

		doc.save(dataDir + "AddHyperlink_out.pdf");
		// ExEnd:AddHyperlink
		System.out.printf("File saved: %s\n", dataDir + "AddHyperlink_out.pdf");
	}
}
