package com.aspose.note.examples.dom;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.DocumentVisitor;
import com.aspose.note.Image;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.OutlineGroup;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class UsingDocumentVisitor {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(UsingDocumentVisitor.class) + "dom/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

		// Create an object that inherits from the DocumentVisitor class.
		MyOneNoteToTxtWriter myConverter = new MyOneNoteToTxtWriter();

		/*
		 * This is the well known Visitor pattern. Get the model to accept a
		 * visitor.The model will iterate through itself by calling the
		 * corresponding methods on the visitor object (this is called
		 * visiting).
		 * 
		 * Note that every node in the object model has the Accept method so the
		 * visiting can be executed not only for the whole document, but for any
		 * node in the document.
		 */
		doc.accept(myConverter);

		// Once the visiting is complete, we can retrieve the result of the operation,
		// that in this example, has accumulated in the visitor.
		
		System.out.println("Total Nodes: " + myConverter.getNodeCount());
		System.out.println(myConverter.getText());

	}
}

class MyOneNoteToTxtWriter extends DocumentVisitor {
	private StringBuilder mBuilder = new StringBuilder();
	private boolean mIsSkipText = false;
	private int nodecount = 0;

	/**
	 * Gets the plain text of the document that was accumulated by the visitor.
	 */
	public String getText() {
		return mBuilder.toString();
	}

	/**
	 * Total number of nodes visited
	 */
	public int getNodeCount() {
		return this.nodecount;
	}

	/**
	 * Adds text to the current output. Honors the enabled/disabled output flag.
	 */
	private void appendText(String text) {
		if (!mIsSkipText)
			mBuilder.append(text).append(' ');
	}

	@Override
	public void visitRichTextStart(RichText run) {
		++nodecount;
		appendText(run.getText());
	}

	@Override
	public void visitDocumentStart(Document document) {
		++nodecount;
	}

	@Override
	public void visitPageStart(Page page) {
		++nodecount;
	}

	@Override
	public void visitTitleStart(Title title) {
		++nodecount;
	}

	@Override
	public void visitImageStart(Image image) {
		++nodecount;
	}

	@Override
	public void visitOutlineGroupStart(OutlineGroup outlineGroup) {
		++nodecount;
	}

	@Override
	public void visitOutlineStart(Outline outline) {
		++nodecount;
	}

	@Override
	public void visitOutlineElementStart(OutlineElement outlineElement) {
		++nodecount;
	}

}
