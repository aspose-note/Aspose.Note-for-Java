package com.aspose.note.examples.text;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class SettingPageTitleinMicrosoftOneNoteStyle {

	public static void main(String... args) throws IOException {
		// ExStart: SettingPageTitleinMicrosoftOneNoteStyle
		String dataDir = Utils.getSharedDataDir(SettingPageTitleinMicrosoftOneNoteStyle.class) + "text/";

		// initialize new Document
		Document doc = new Document(dataDir + "Sample1.one");
		// initialize new Page
		Page page = new Page();

		// title text
		RichText titleText = new RichText();
		titleText.setText("Title text.");
		titleText.setParagraphStyle(ParagraphStyle.getDefault());

		// title date
		RichText titleDate = new RichText();
		titleDate.setText("2011,11,11");
		titleDate.setParagraphStyle(ParagraphStyle.getDefault());

		// title time
		RichText titleTime = new RichText();
		titleTime.setText("12:34");
		titleTime.setParagraphStyle(ParagraphStyle.getDefault());

		Title title = new Title();
		title.setTitleText(titleText);
		title.setTitleDate(titleDate);
		title.setTitleTime(titleTime);
		page.setTitle(title);

		// append page node
		doc.appendChildLast(page);
		// ExEnd: SettingPageTitleinMicrosoftOneNoteStyle
	}

}
