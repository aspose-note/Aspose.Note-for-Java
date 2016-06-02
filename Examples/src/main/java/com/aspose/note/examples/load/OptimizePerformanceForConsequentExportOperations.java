package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.TextStyle;
import com.aspose.note.Title;
import java.awt.Color;

public class OptimizePerformanceForConsequentExportOperations {
	public static void main(String... args) {
		// ExStart:OptimizePerformanceForConsequentExportOperations
		// initialize the new Document
		Document doc = new Document();
		doc.setAutomaticLayoutChangesDetectionEnabled(false);
		// initialize the new Page
		Page page = new Page(doc);
		// default style for all text in the document.
		TextStyle textStyle = new TextStyle();

		textStyle.setFontColor(Color.BLACK);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);

		// title text
		RichText titleText = new RichText(doc);
		titleText.setText("Title text.");
		titleText.setDefaultStyle(textStyle);

		// title date
		RichText titleDate = new RichText(doc);
		titleDate.setText("2011,11,11");
		titleDate.setDefaultStyle(textStyle);

		// title time
		RichText titleTime = new RichText(doc);
		titleTime.setText("12:34");
		titleTime.setDefaultStyle(textStyle);

		Title title = new Title(doc);
		title.setTitleText(titleText);
		title.setTitleDate(titleDate);
		title.setTitleTime(titleTime);
		page.setTitle(title);

		// append page node
		doc.appendChild(page);
		// save OneNote document in the HTML format
		try {
			doc.save("OptimizePerformanceForConsequentExportOperations.html");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as Html: " + e.getMessage());
		}
		// save OneNote document in the PDF format
		try {
			doc.save("OptimizePerformanceForConsequentExportOperations.pdf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as PDF: " + e.getMessage());
		}
		// save OneNote document in the JPG format
		try {
			doc.save("OptimizePerformanceForConsequentExportOperations.jpg");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as JPG: " + e.getMessage());
		}
		// set text font size
		textStyle.setFontSize(11);
		// detect layout changes manually
		doc.detectLayoutChanges();
		// save OneNote document in the BMP format
		try {
			doc.save("OptimizePerformanceForConsequentExportOperations.bmp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as bmp: " + e.getMessage());
		}
		// ExEnd:OptimizePerformanceForConsequentExportOperations
	}
}
