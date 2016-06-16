package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.TextStyle;
import com.aspose.note.Title;
import java.awt.Color;
import java.io.IOException;

public class CreateDocWithFormattedRichText {

	public static void main(String... args) throws IOException {

                // create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);
		// initialize Title class object
		Title title = new Title(doc);
		// initialize TextStyle class object and set formatting properties
		TextStyle defaultTextStyle = new TextStyle();
		defaultTextStyle.setFontColor(Color.black);
		defaultTextStyle.setFontName("Arial");
		defaultTextStyle.setFontSize(10);

		RichText titleText = new RichText(doc);
		titleText.setText("Title!");
		titleText.setDefaultStyle(defaultTextStyle);

		// titleText.setTitleText(true);
		// IsTitleText = true

		Outline outline = new Outline(doc);
		outline.setVerticalOffset(100);
		outline.setHorizontalOffset(100);

		OutlineElement outlineElem = new OutlineElement(doc);
		// RunIndex = 5 means the style will be applied only to 0-4 characters.
		// ("Hello")
		TextStyle textStyleForHelloWord = new TextStyle();
		textStyleForHelloWord.setFontColor(Color.red);
		textStyleForHelloWord.setFontName("Arial");
		textStyleForHelloWord.setFontSize(10);
		textStyleForHelloWord.setRunIndex(5);

		// RunIndex = 13 means the style will be applied only to 5-12
		// characters. (" OneNote")
		TextStyle textStyleForOneNoteWord = new TextStyle();
		textStyleForOneNoteWord.setFontColor(Color.green);
		textStyleForOneNoteWord.setFontName("Calibri");
		textStyleForOneNoteWord.setFontSize(10);
		textStyleForOneNoteWord.setItalic(true);
		textStyleForOneNoteWord.setRunIndex(13);

		// RunIndex = 18 means the style will be applied only to 13-17
		// characters. (" text").
		// Other characters ("!") will have the default style.
		TextStyle textStyleForTextWord = new TextStyle();
		textStyleForTextWord.setFontColor(Color.blue);
		textStyleForTextWord.setFontName("Arial");
		textStyleForTextWord.setFontSize(15);
		textStyleForTextWord.setBold(true);
		textStyleForTextWord.setItalic(true);
		textStyleForTextWord.setRunIndex(18);

		RichText text = new RichText(doc);
		text.setText("Hello OneNote text!");
		text.setDefaultStyle(defaultTextStyle);
		text.getStyles().addItem(textStyleForHelloWord);
		text.getStyles().addItem(textStyleForOneNoteWord);
		text.getStyles().addItem(textStyleForTextWord);

		title.setTitleText(titleText);
		// set page title
		page.setTitle(title);
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
