package com.aspose.note.examples.pages;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.PageHistory;
import com.aspose.note.examples.Utils;

public class RollBackToPreviousPageVersion {
	public static void main(String... args) throws IOException {
		// ExStart:RollBackToPreviousPageVersion
		String dataDir = Utils.getSharedDataDir(InsertPages.class) + "pages/";

		// Load OneNote document and get first child
		Document document = new Document(dataDir + "Sample1.one");

		Page page = document.getFirstChild();

		PageHistory pageHistory = document.getPageHistory(page);

		document.removeChild(page);

		document.appendChildLast(pageHistory.get_Item(pageHistory.size() - 1));

		document.save(dataDir + "RollBackToPreviousPageVersion_out.one");
		// ExEnd:RollBackToPreviousPageVersion
	}
}
