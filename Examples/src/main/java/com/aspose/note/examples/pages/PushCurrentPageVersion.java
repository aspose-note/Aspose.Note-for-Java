package com.aspose.note.examples.pages;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.PageHistory;
import com.aspose.note.examples.Utils;

public class PushCurrentPageVersion {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(InsertPages.class) + "pages/";
		// Load OneNote document and get first child
		Document document = new Document(dataDir + "Sample1.one");
		Page page = document.getFirstChild();

		PageHistory pageHistory = document.getPageHistory(page);

		pageHistory.addItem(page.deepClone());

		document.save(dataDir + "PushCurrentPageVersion_out.one");

	}
}
