package com.aspose.note.examples.text;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.TextStyle;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class SettingPageTitleinMicrosoftOneNoteStyle {

	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(SettingPageTitleinMicrosoftOneNoteStyle.class) + "text/";

		// initialize new Document
		Document doc = new Document(dataDir + "Sample1.one");
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
		doc.appendChildLast(page);

	}

}
