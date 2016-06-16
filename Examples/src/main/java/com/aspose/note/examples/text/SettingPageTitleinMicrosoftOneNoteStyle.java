package com.aspose.note.examples.text;

import com.aspose.note.*;
import java.io.IOException;
import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;

import java.util.*;

public class SettingPageTitleinMicrosoftOneNoteStyle {

	public static void main(String... args) throws IOException {

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ExtractText.class, inputFile);

		// initialize new Document
		Document doc = new Document(inputPath.toString());
		// initialize new Page
		Page page = new Page(doc);

		// title text
		RichText titleText = new RichText(doc);
		titleText.setText("Title text.");
		titleText.setDefaultStyle(TextStyle.getDefaultMsOneNoteTitleTextStyle());

		// title date
		RichText titleDate = new RichText(doc);
		titleDate.setText("2011,11,11");
		titleDate.setDefaultStyle(TextStyle.getDefaultMsOneNoteTitleDateStyle());

		// title time
		RichText titleTime = new RichText(doc);
		titleTime.setText("12:34");
		titleTime.setDefaultStyle(TextStyle.getDefaultMsOneNoteTitleTimeStyle());

		Title title = new Title(doc);
		title.setTitleText(titleText);
		title.setTitleDate(titleDate);
		title.setTitleTime(titleTime);
		page.setTitle(title);

		// append page node
		doc.appendChild(page);

	}

}
