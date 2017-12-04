package com.aspose.note.examples.pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.Page;
import com.aspose.note.PageHistory;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ConflictPageManipulation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//ExStart: ConflictPageManipulation
		String dataDir = Utils.getSharedDataDir(GetInfo.class) + "pages/";
		// Load the document into Aspose.Note
		LoadOptions options = new LoadOptions();
		Document doc = new Document(dataDir + "Aspose.one", options);

		DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		
		PageHistory history = doc.getPageHistory(doc.getFirstChild());
		for (int i = 0; i < history.size(); i++)
		{
			Page historyPage = history.get_Item(i);
			System.out.format(" %d. Author: %s, %s",
                    i,
                    historyPage.getPageContentRevisionSummary().getAuthorMostRecent(),
                    df.format(historyPage.getPageContentRevisionSummary().getLastModifiedTime()));
			System.out.println(historyPage.isConflictPage() ? ", IsConflict: true" : "");
		    // By default conflict pages are just skipped on saving.
		    // If mark it as non-conflict then it will be saved as usual one in the history.
		    if (historyPage.isConflictPage())
		        historyPage.setConflictPage(false);
		}

		doc.save(dataDir + "ConflictPageManipulation_out.one", SaveFormat.One);
		//ExEnd: ConflictPageManipulation
	}

}
