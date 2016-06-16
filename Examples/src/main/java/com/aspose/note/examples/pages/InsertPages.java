package com.aspose.note.examples.pages;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;

public class InsertPages {
	public static void main(String... args) throws IOException {

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

		Path outputBmp = Utils.getPath(InsertPages.class, "Output.bmp");
		doc.save(outputBmp.toString(), SaveFormat.Bmp);
		System.out.printf("File Saved: %s\n", outputBmp);

		Path outputPdf = Utils.getPath(InsertPages.class, "Output.pdf");
		doc.save(outputPdf.toString(), SaveFormat.Pdf);
		System.out.printf("File Saved: %s\n", outputPdf);

		Path outputGif = Utils.getPath(InsertPages.class, "Output.gif");
		doc.save(outputGif.toString(), SaveFormat.Gif);
		System.out.printf("File Saved: %s\n", outputGif);

		Path outputJpg = Utils.getPath(InsertPages.class, "Output.jpg");
		doc.save(outputJpg.toString(), SaveFormat.Jpeg);
		System.out.printf("File Saved: %s\n", outputJpg);

		Path outputPng = Utils.getPath(InsertPages.class, "Output.png");
		doc.save(outputPng.toString(), SaveFormat.Png);
		System.out.printf("File Saved: %s\n", outputPng);

		Path outputTiff = Utils.getPath(InsertPages.class, "Output.tiff");
		doc.save(outputTiff.toString(), SaveFormat.Tiff);
		System.out.printf("File Saved: %s\n", outputTiff);

	}
}
