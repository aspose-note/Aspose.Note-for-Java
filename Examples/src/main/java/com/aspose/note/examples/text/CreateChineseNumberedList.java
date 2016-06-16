package com.aspose.note.examples.text;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;

public class CreateChineseNumberedList {
	public static void main(String... args) throws IOException {

		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(CreateChineseNumberedList.class, outputFile);

		// create an object of the Document class
		Document doc = new Document();

		// initialize Page class object
		Page page = new Page(doc);

		// initialize Outline class object
		Outline outline = new Outline(doc);

		// initialize TextStyle class object and set formatting properties
		TextStyle defaultStyle = new TextStyle();
		defaultStyle.setFontColor(Color.black);
		defaultStyle.setFontName("Arial");
		defaultStyle.setFontSize(10);

		// initialize OutlineElement class objects and apply numbering
		// numbers in the same outline are automatically incremented.
		OutlineElement outlineElem1 = new OutlineElement(doc);

		outlineElem1.setNumberList(new NumberList("{0})", NumberFormat.ChineseCounting, "Arial", 10));

		RichText text1 = new RichText(doc);
		text1.setText("First");
		text1.setDefaultStyle(defaultStyle);
		outlineElem1.appendChild(text1);

		OutlineElement outlineElem2 = new OutlineElement(doc);
		outlineElem2.setNumberList(new NumberList("{0})", NumberFormat.ChineseCounting, "Arial", 10));
		RichText text2 = new RichText(doc);
		text2.setText("Second");
		text2.setDefaultStyle(defaultStyle);
		outlineElem2.appendChild(text2);

		OutlineElement outlineElem3 = new OutlineElement(doc);
		outlineElem3.setNumberList(new NumberList("{0})", NumberFormat.ChineseCounting, "Arial", 10));
		RichText text3 = new RichText(doc);
		text3.setText("Third");
		text3.setDefaultStyle(defaultStyle);
		outlineElem3.appendChild(text3);

		// add outline elements
		outline.appendChild(outlineElem1);
		outline.appendChild(outlineElem2);
		outline.appendChild(outlineElem3);

		// add Outline node
		page.appendChild(outline);

		// add Page node
		doc.appendChild(page);

		// save the document
		doc.save(outputPath.toString());

		System.out.printf("File saved: %s\n", outputPath);

	}
}
