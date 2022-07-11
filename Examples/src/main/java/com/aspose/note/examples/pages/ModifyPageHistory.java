package com.aspose.note.examples.pages;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.PageHistory;
import com.aspose.note.examples.Utils;

public class ModifyPageHistory {
	public static void main(String... args) throws IOException {
		// ExStart:ModifyPageHistory
		String dataDir = Utils.getSharedDataDir(InsertPages.class) + "pages/";
		// Load OneNote document and get first child
		Document document = new Document(dataDir + "Sample1.one");

		Page page = document.getFirstChild();

		PageHistory pageHistory = document.getPageHistory(page);

		pageHistory.removeRange(0, 1);

		pageHistory.set_Item(0, new Page());

		pageHistory.get_Item(1).getTitle().getTitleText().clear().append("New Title");

		pageHistory.addItem(new Page());

		pageHistory.insertItem(1, new Page());

		document.save(dataDir + "ModifyPageHistory_out.one");
		// ExEnd:ModifyPageHistory
	}
}
