package com.aspose.note.examples.load;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.TextStyle;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class OptimizeExportPerformance {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(OptimizeExportPerformance.class) + "load/";

		// initialize the new Document
		Document doc = new Document();

		// Disable detection of layout changes
		doc.setAutomaticLayoutChangesDetectionEnabled(false);

		// Create a new Page
		Page page = new Page(doc);

		// Style for all text in the document.
		TextStyle textStyle = new TextStyle();
		textStyle.setFontColor(Color.BLACK);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);

		// Create title text
		RichText titleText = new RichText(doc);
		titleText.setText("Title text.");
		titleText.setDefaultStyle(textStyle);

		// Create title date
		RichText titleDate = new RichText(doc);
		titleDate.setText("2011,11,11");
		titleDate.setDefaultStyle(textStyle);

		// Create title time
		RichText titleTime = new RichText(doc);
		titleTime.setText("12:34");
		titleTime.setDefaultStyle(textStyle);

		// Add title to page
		Title title = new Title(doc);
		title.setTitleText(titleText);
		title.setTitleDate(titleDate);
		title.setTitleTime(titleTime);
		page.setTitle(title);

		// Add page to document
		doc.appendChild(page);

		// save OneNote document in the PDF format
		doc.save(dataDir + "OptimizeExportPerformance_out.pdf");

		// Save document in the TIFF format
		doc.save(dataDir + "OptimizeExportPerformance_out.tiff");

		// save OneNote document in the JPG format
		doc.save(dataDir + "OptimizeExportPerformance_out.jpg");

		// set text font size
		textStyle.setFontSize(24);

		// Manually trigger layout detection
		doc.detectLayoutChanges();

		// save OneNote document in the BMP format
		doc.save(dataDir + "OptimizeExportPerformance_out.bmp");
	}
}
