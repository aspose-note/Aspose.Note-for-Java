package com.aspose.note.examples.printingdocuments;

import javax.print.PrintException;

import com.aspose.note.Document;
import com.aspose.note.DocumentPrintAttributeSet;
import com.aspose.note.PrintOptions;
import com.aspose.note.examples.Utils;
import com.aspose.note.examples.images.AlternativeText;

public class PrintDocuments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void PrintDocument() throws PrintException
	{
		//ExStart: PrintDocument
		String dataDir = Utils.getSharedDataDir(AlternativeText.class) + "load/";
		
		Document document = new Document(dataDir + "Aspose.one");

		document.print();
		//ExEnd: PrintDocument
	}
	
	public static void PrintDocumentWithPrintOptions() throws PrintException
	{
		//ExStart: PrintDocumentWithPrintOptions
		String dataDir = Utils.getSharedDataDir(AlternativeText.class) + "load/";

		Document document = new Document(dataDir + "Aspose.one");

		//Prints first and second pages using Microsoft XPS Document Writer
		final DocumentPrintAttributeSet asposeAttr = new DocumentPrintAttributeSet("Microsoft XPS Document Writer");
		asposeAttr.setPrintRange(1, 2);
		 
		//Uncomment line below to retarget output to specified file.
		//This functionality is supported by Microsoft XPS Document Writer.
		//It is not guaranteed that other printers support it.
		//asposeAttr.add(new Destination((new java.io.File("./out.xps")).toURI()));
		  
		document.print(asposeAttr);
		//ExEnd: PrintDocumentWithPrintOptions
	}
	
	public static void PrintDocumentsWithVirtualPrinter() throws PrintException
	{
		//ExStart: PrintDocumentsWithVirtualPrinter
		//Prints 3 copies of first and second pages using virtual pdf printer doPDF 8
		//It is free and can be downloaded here http://www.dopdf.com/download.php
		String dataDir = Utils.getSharedDataDir(AlternativeText.class) + "load/";
		Document doc = new Document(dataDir + "test.one");
		 
		 
		final DocumentPrintAttributeSet asposeAttr = new DocumentPrintAttributeSet("doPDF 8");
		asposeAttr.setPrintRange(1, 2);
		asposeAttr.setCopies(3);
		 
		PrintOptions printOptions = new PrintOptions();
		printOptions.setDocumentName("Test.one");
		printOptions.setPrinterSettings(asposeAttr);
		  
		doc.print(printOptions);
		//ExEnd: PrintDocumentsWithVirtualPrinter
		
	}
	
}
