package com.aspose.note.examples.pages;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.examples.Utils;

public class CreateDocWithRootAndSubPages {

	public static void main(String... args) {
		// ExStart:CreateDocWithRootAndSubPages
		String dataDir = Utils.getSharedDataDir(CreateDocWithRootAndSubPages.class) + "pages/";
		
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object and set its level
		Page page1 = new Page();
		page1.setLevel((byte) 1);
		// initialize Page class object and set its level
		Page page2 = new Page();
		page1.setLevel((byte) 2);
		// initialize Page class object and set its level
		Page page3 = new Page();
		page1.setLevel((byte) 1);

		// ---------- Adding nodes to first Page ----------
		Outline outline = new Outline();
		OutlineElement outlineElem = new OutlineElement();
		ParagraphStyle textStyle = new ParagraphStyle();
		textStyle.setFontColor(java.awt.Color.black);
		textStyle.setFontName("David Transparent");
		textStyle.setFontSize(10);

		RichText text = new RichText();
		text.setText("First page.");
		text.setParagraphStyle(textStyle);

		outlineElem.appendChildLast(text);
		outline.appendChildLast(outlineElem);
		page1.appendChildLast(outline);

		// ---------- Adding nodes to second Page ----------
		Outline outline2 = new Outline();
		OutlineElement outlineElem2 = new OutlineElement();
		// var textStyle2 = new TextStyle { FontColor = Color.Black, FontName =
		// "Arial", FontSize = 10 };
		ParagraphStyle textStyle2 = new ParagraphStyle();
		textStyle2.setFontColor(java.awt.Color.black);
		textStyle2.setFontName("David Transparent");
		textStyle2.setFontSize(10);

		// var text2 = new RichText() { Text = "Second page.", DefaultStyle =
		// textStyle2 };
		RichText text2 = new RichText();
		text2.setText("Second page.");
		text2.setParagraphStyle(textStyle2);

		outlineElem2.appendChildLast(text2);
		outline2.appendChildLast(outlineElem2);
		page2.appendChildLast(outline2);

		// ---------- Adding nodes to third Page ----------
		Outline outline3 = new Outline();
		OutlineElement outlineElem3 = new OutlineElement();
		ParagraphStyle textStyle3 = new ParagraphStyle();
		textStyle3.setFontColor(java.awt.Color.black);
		textStyle3.setFontName("Broadway");
		textStyle3.setFontSize(10);

		RichText text3 = new RichText();
		text3.setText("Third page.");
		text3.setParagraphStyle(textStyle3);

		outlineElem3.appendChildLast(text3);
		outline3.appendChildLast(outlineElem3);
		page3.appendChildLast(outline3);

		// ---------- Add pages to the OneNote Document ----------
		doc.appendChildLast(page1);
		doc.appendChildLast(page2);
		doc.appendChildLast(page3);

		try {
			doc.save(dataDir + "GenerateRootAndSubLevelPagesInOneNote_out.bmp", SaveFormat.Bmp);

		} catch (IOException e) {

		}
		// ExEnd:CreateDocWithRootAndSubPages
        }

}
