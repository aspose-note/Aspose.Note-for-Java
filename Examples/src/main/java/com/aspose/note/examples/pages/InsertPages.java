package com.aspose.note.examples.pages;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.TextStyle;
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
		TextStyle textStyle = new TextStyle();
		textStyle.setFontColor(java.awt.Color.black);
		textStyle.setFontName("David Transparent");
		textStyle.setFontSize(10);

		RichText text = new RichText(doc);
		text.setText("First page.");
		text.setDefaultStyle(textStyle);

		outlineElem.appendChild(text);
		outline.appendChild(outlineElem);
		page1.appendChild(outline);

		// Adding nodes to second Page
		Outline outline2 = new Outline(doc);
		OutlineElement outlineElem2 = new OutlineElement(doc);

		TextStyle textStyle2 = new TextStyle();
		textStyle2.setFontColor(java.awt.Color.black);
		textStyle2.setFontName("David Transparent");
		textStyle2.setFontSize(10);

		RichText text2 = new RichText(doc);
		text2.setText("Second page.");
		text2.setDefaultStyle(textStyle2);

		outlineElem2.appendChild(text2);
		outline2.appendChild(outlineElem2);
		page2.appendChild(outline2);

		// Adding nodes to third Page
		Outline outline3 = new Outline(doc);
		OutlineElement outlineElem3 = new OutlineElement(doc);
		TextStyle textStyle3 = new TextStyle();
		textStyle3.setFontColor(java.awt.Color.black);
		textStyle3.setFontName("Broadway");
		textStyle3.setFontSize(10);

		RichText text3 = new RichText(doc);
		text3.setText("Third page.");
		text3.setDefaultStyle(textStyle3);

		outlineElem3.appendChild(text3);
		outline3.appendChild(outlineElem3);
		page3.appendChild(outline3);

		// Add pages to the OneNote Document
		doc.appendChild(page1);
		doc.appendChild(page2);
		doc.appendChild(page3);

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
