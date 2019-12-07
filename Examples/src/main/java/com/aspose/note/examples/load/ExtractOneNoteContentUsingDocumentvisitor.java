package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.DocumentVisitor;
import com.aspose.note.Image;
import com.aspose.note.LoadOptions;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.OutlineGroup;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

//ExStart: ExtractOneNoteContentUsingDocumentvisitor
public class ExtractOneNoteContentUsingDocumentvisitor extends DocumentVisitor {

	final private StringBuilder mBuilder;
	final private boolean mIsSkipText;
	private int nodecount;

	public ExtractOneNoteContentUsingDocumentvisitor() {
		nodecount = 0;
		mIsSkipText = false;
		mBuilder = new StringBuilder();
	}

	// Gets the plain text of the document that was accumulated by the visitor.
	public String GetText() {
		return mBuilder.toString();
	}

	// Adds text to the current output. Honors the enabled/disabled output flag.
	private void AppendText(String text) {
		if (!mIsSkipText)
			mBuilder.append(text);
	}

	// Called when a RichText node is encountered in the document.
	public /* override */ void VisitRichTextStart(RichText run) {
		++nodecount;
		AppendText(run.getText());
	}

	// Called when a Document node is encountered in the document.
	public /* override */ void VisitDocumentStart(Document document) {
		++nodecount;
	}

	// Called when a Page node is encountered in the document.
	public /* override */ void VisitPageStart(Page page) {
		++nodecount;
	}

	// Called when a Title node is encountered in the document.
	public /* override */ void VisitTitleStart(Title title) {
		++nodecount;
	}

	// Called when a Image node is encountered in the document.
	public /* override */ void VisitImageStart(Image image) {
		++nodecount;
	}

	// Called when a OutlineGroup node is encountered in the document.
	public /* override */ void VisitOutlineGroupStart(OutlineGroup outlineGroup) {
		++nodecount;
	}

	// Called when a Outline node is encountered in the document.
	public void VisitOutlineStart(Outline outline) {
		++nodecount;
	}

	// Called when a OutlineElement node is encountered in the document.
	public void VisitOutlineElementStart(OutlineElement outlineElement) {
		++nodecount;
	}

	// Gets the total count of nodes by the Visitor
	public int NodeCount() {
		return this.nodecount;
	}

	public static void main(String[] args) throws IOException {
		// Open the document we want to convert.

		String dataDir = Utils.getSharedDataDir(ExtractOneNoteContentUsingDocumentvisitor.class) + "load/";

		Document doc = new Document(dataDir + "Sample1.one", new LoadOptions());

		// Create an object that inherits from the DocumentVisitor class.
		ExtractOneNoteContentUsingDocumentvisitor myConverter = new ExtractOneNoteContentUsingDocumentvisitor();

		// This is the well known Visitor pattern. Get the model to accept a
		// visitor.
		// The model will iterate through itself by calling the corresponding
		// methods
		// on the visitor object (this is called visiting).
		//
		// Note that every node in the object model has the Accept method so the
		// visiting
		// can be executed not only for the whole document, but for any node in
		// the document.
		doc.accept(myConverter);

		// Once the visiting is complete, we can retrieve the result of the
		// operation,
		// that in this example, has accumulated in the visitor.
		System.out.println(myConverter.GetText());
		System.out.println(myConverter.NodeCount());
	}
}
//ExEnd: ExtractOneNoteContentUsingDocumentvisitor