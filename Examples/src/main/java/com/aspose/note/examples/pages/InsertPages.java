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

public class InsertPages {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(InsertPages.class) + "pages/";
		
		// create an object of the Document class
		Document doc = new Document();

		// Initialize Page class object and set its level
		Page page1 = new Page(doc);
		page1.setLevel((byte) 1);

		// Initialize Page class object and set its level
		Page page2 = new Page(doc);
		page1.setLevel((byte) 2);

		// Initialize Page class object and set its level
		Page page3 = new Page(doc);
		page1.setLevel((byte) 1);

		// Adding nodes to first Page
		Outline outline = new Outline(doc);
		OutlineElement outlineElem = new OutlineElement(doc);
		ParagraphStyle textStyle = new ParagraphStyle();
		textStyle.setFontColor(java.awt.Color.black);
		textStyle.setFontName("David Transparent");
		textStyle.setFontSize(10);

		RichText text = new RichText(doc);
		text.setText("First page.");
		text.setParagraphStyle(textStyle);

		outlineElem.appendChildLast(text);
		outline.appendChildLast(outlineElem);
		page1.appendChildLast(outline);

		// Adding nodes to second Page
		Outline outline2 = new Outline(doc);
		OutlineElement outlineElem2 = new OutlineElement(doc);

		ParagraphStyle textStyle2 = new ParagraphStyle();
		textStyle2.setFontColor(java.awt.Color.black);
		textStyle2.setFontName("David Transparent");
		textStyle2.setFontSize(10);

		RichText text2 = new RichText(doc);
		text2.setText("Second page.");
		text2.setParagraphStyle(textStyle2);

		outlineElem2.appendChildLast(text2);
		outline2.appendChildLast(outlineElem2);
		page2.appendChildLast(outline2);

		// Adding nodes to third Page
		Outline outline3 = new Outline(doc);
		OutlineElement outlineElem3 = new OutlineElement(doc);
		ParagraphStyle textStyle3 = new ParagraphStyle();
		textStyle3.setFontColor(java.awt.Color.black);
		textStyle3.setFontName("Broadway");
		textStyle3.setFontSize(10);

		RichText text3 = new RichText(doc);
		text3.setText("Third page.");
		text3.setParagraphStyle(textStyle3);

		outlineElem3.appendChildLast(text3);
		outline3.appendChildLast(outlineElem3);
		page3.appendChildLast(outline3);

		// Add pages to the OneNote Document
		doc.appendChildLast(page1);
		doc.appendChildLast(page2);
		doc.appendChildLast(page3);

		doc.save(dataDir + "InsertPages_out.bmp" , SaveFormat.Bmp);
		System.out.printf("File Saved: %s\n", dataDir + "InsertPages.bmp");

		doc.save(dataDir + "InsertPages_out.pdf", SaveFormat.Pdf);
		System.out.printf("File Saved: %s\n", dataDir + "InsertPages.pdf");

		doc.save(dataDir + "InsertPages_out.gif", SaveFormat.Gif);
		System.out.printf("File Saved: %s\n", dataDir + "InsertPages.gif");

		doc.save(dataDir + "InsertPages_out.jpeg", SaveFormat.Jpeg);
		System.out.printf("File Saved: %s\n", dataDir + "InsertPages.jpeg");

		doc.save(dataDir + "InsertPages_out.png", SaveFormat.Png);
		System.out.printf("File Saved: %s\n", dataDir + "InsertPages.png");

		doc.save(dataDir + "InsertPages_out.tiff", SaveFormat.Tiff);
		System.out.printf("File Saved: %s\n", dataDir + "InsertPages.tiff");

	}
}
