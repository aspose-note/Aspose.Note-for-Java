package com.aspose.note.examples.load;

import java.awt.Color;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class OptimizePerformanceForConsequentExportOperations {
	public static void main(String... args) {
		// ExStart:ConsequentExportOperations
		String dataDir = Utils.getSharedDataDir(OptimizePerformanceForConsequentExportOperations.class) + "load/";
		// initialize the new Document
		Document doc = new Document();
		doc.setAutomaticLayoutChangesDetectionEnabled(false);
		// initialize the new Page
		Page page = new Page();
		// default style for all text in the document.
		ParagraphStyle textStyle = new ParagraphStyle();

		textStyle.setFontColor(Color.BLACK);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);

		// title text
		RichText titleText = new RichText();
		titleText.setText("Title text.");
		titleText.setParagraphStyle(textStyle);

		// title date
		RichText titleDate = new RichText();
		titleDate.setText("2011,11,11");
		titleDate.setParagraphStyle(textStyle);

		// title time
		RichText titleTime = new RichText();
		titleTime.setText("12:34");
		titleTime.setParagraphStyle(textStyle);

		Title title = new Title();
		title.setTitleText(titleText);
		title.setTitleDate(titleDate);
		title.setTitleTime(titleTime);
		page.setTitle(title);

		// append page node
		doc.appendChildLast(page);
		// save OneNote document in the HTML format
		try {
			doc.save(dataDir + "OptimizePerformanceForConsequentExportOperations_out.html");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as Html: " + e.getMessage());
		}
		// save OneNote document in the PDF format
		try {
			doc.save(dataDir + "OptimizePerformanceForConsequentExportOperations_out.pdf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as PDF: " + e.getMessage());
		}
		// save OneNote document in the JPG format
		try {
			doc.save(dataDir + "OptimizePerformanceForConsequentExportOperations_out.jpg");
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
			doc.save(dataDir + "OptimizePerformanceForConsequentExportOperations_out.bmp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saving as bmp: " + e.getMessage());
		}
		// ExEnd:ConsequentExportOperations
	}
}
