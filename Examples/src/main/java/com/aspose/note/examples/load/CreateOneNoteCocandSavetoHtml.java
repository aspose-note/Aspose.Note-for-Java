package com.aspose.note.examples.load;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;

import com.aspose.note.CssSavingArgs;
import com.aspose.note.Document;
import com.aspose.note.FontFaceType;
import com.aspose.note.FontSavingArgs;
import com.aspose.note.HtmlSaveOptions;
import com.aspose.note.ICssSavingCallback;
import com.aspose.note.IFontSavingCallback;
import com.aspose.note.IImageSavingCallback;
import com.aspose.note.ImageSavingArgs;
import com.aspose.note.ResourceExportType;
import com.aspose.note.examples.Utils;

public class CreateOneNoteCocandSavetoHtml {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		SaveAsHtmlToMemoryStream();
		
		SaveAsHtmlWithResourcesInSeparateFiles();
		
		SaveAsHtmlWithResourcesInSeparateFiles();
	}

	public static void SaveAsHtmlToMemoryStream() throws IOException
	{
		String dataDir = Utils.getSharedDataDir(ConvertSpecificPageRangeToPdf.class) + "load/";
		
		//ExStart: SaveAsHtmlToMemoryStream
		Document document = new Document(dataDir + "Sample1.one");
		
		HtmlSaveOptions options = new HtmlSaveOptions();
        options.setExportCss(ResourceExportType.ExportEmbedded);
        options.setExportImages(ResourceExportType.ExportEmbedded);
        options.setExportFonts(ResourceExportType.ExportEmbedded);
        options.setFontFaceTypes(FontFaceType.Ttf);
 
        ByteArrayOutputStream r = new ByteArrayOutputStream();
        document.save(r, options);
        //ExEnd: SaveAsHtmlToMemoryStream
	}
	
	public static void SaveAsHtmlWithResourcesInSeparateFiles() throws IOException
	{
		String dataDir = Utils.getSharedDataDir(ConvertSpecificPageRangeToPdf.class) + "load/";
		
		//ExStart: SaveAsHtmlWithResourcesInSeparateFiles
		Document document = new Document(dataDir + "Sample1.one");
		
		HtmlSaveOptions options = new HtmlSaveOptions();
	    options.setExportCss(ResourceExportType.ExportAsFile);
	    options.setExportFonts(ResourceExportType.ExportAsFile);
	    options.setExportImages(ResourceExportType.ExportAsFile);
	 
	    document.save(dataDir + "document.html", options);
		//ExEnd: SaveAsHtmlWithResourcesInSeparateFiles
	}
	
	public static void SaveAsHtmlToMemoryStreamWithCallbacksToSaveResources() throws IOException
	{
		String dataDir = Utils.getSharedDataDir(ConvertSpecificPageRangeToPdf.class) + "load/";
		
		//ExStart: SaveAsHtmlToMemoryStreamWithCallbacksToSaveResources
		Document document = new Document(dataDir + "Sample1.one");
		
		UserSavingCallbacks savingCallbacks = new UserSavingCallbacks();
	    savingCallbacks.setRootFolder("documentFolder");
	    savingCallbacks.setCssFolder("css");
	    savingCallbacks.setKeepCssStreamOpened(true);
	    savingCallbacks.setImagesFolder("images");
	    savingCallbacks.setFontsFolder("fonts");
	 
	    HtmlSaveOptions options = new HtmlSaveOptions();
	    options.setFontFaceTypes(FontFaceType.Ttf);
	    options.setCssSavingCallback(savingCallbacks);
	    options.setImageSavingCallback(savingCallbacks);
	    options.setFontSavingCallback(savingCallbacks);
	    options.setExportCss(ResourceExportType.ExportAsFile);
	    options.setExportImages(ResourceExportType.ExportAsFile);
	    options.setExportFonts(ResourceExportType.ExportAsFile);
	 
	    File dir = new File(savingCallbacks.getRootFolder());
	    if (!dir.exists())
	    {
	        dir.mkdir();
	    }
	 
	    document.save(Paths.get(savingCallbacks.getRootFolder(), "document.html").toString(), options);
	 
	    try (OutputStreamWriter writer = new OutputStreamWriter(savingCallbacks.getCssStream(), "utf-8")){
	        writer.write(System.lineSeparator());
	        writer.write("/* This line is appended to stream manually by user */");
	        writer.close();
	    }
		//ExEnd: SaveAsHtmlToMemoryStreamWithCallbacksToSaveResources
	}
}

class UserSavingCallbacks implements ICssSavingCallback, IFontSavingCallback, IImageSavingCallback
{
	//ExStart: UserSavingCallbacks
    public final int getCssSaved(){ return auto_CssSaved; }
    private void setCssSaved(int value){ auto_CssSaved = value; }
    private int auto_CssSaved;
    public final int getFontsSaved(){ return auto_FontsSaved; }
    private void setFontsSaved(int value){ auto_FontsSaved = value; }
    private int auto_FontsSaved;
    public final int getImagessSaved(){ return auto_ImagessSaved; }
    private void setImagessSaved(int value){ auto_ImagessSaved = value; }
    private int auto_ImagessSaved;
 
    public final String getRootFolder(){ return auto_RootFolder; }
    public final void setRootFolder(String value){ auto_RootFolder = value; }
    private String auto_RootFolder;
 
    public final boolean getKeepCssStreamOpened(){ return auto_KeepCssStreamOpened; }
    public final void setKeepCssStreamOpened(boolean value){ auto_KeepCssStreamOpened = value; }
    private boolean auto_KeepCssStreamOpened;
 
    public final String getCssFolder(){ return auto_CssFolder; }
    public final void setCssFolder(String value){ auto_CssFolder = value; }
    private String auto_CssFolder;
 
    public final OutputStream getCssStream(){ return auto_CssStream; }
    private void setCssStream(OutputStream value){ auto_CssStream = value; }
    private OutputStream auto_CssStream;
 
    public final String getFontsFolder(){ return auto_FontsFolder; }
    public final void setFontsFolder(String value){ auto_FontsFolder = value; }
    private String auto_FontsFolder;
 
    public final String getImagesFolder(){ return auto_ImagesFolder; }
    public final void setImagesFolder(String value){ auto_ImagesFolder = value; }
    private String auto_ImagesFolder;
 
    public final void fontSaving(FontSavingArgs args)
    {
        String uri = null;
        OutputStream stream = null;
        String[] referenceToUri = { uri };
        OutputStream[] referenceToStream = { stream };
        this.createResourceInFolder(this.getFontsFolder(), args.getFileName(), /*out*/ referenceToUri, /*out*/ referenceToStream);
        uri = referenceToUri[0];
        stream = referenceToStream[0];
        args.setStream(stream);
        args.setUri(Paths.get("..", uri).toString().replace("\\", "\\\\"));
 
        this.setFontsSaved(this.getFontsSaved() + 1);
    }
 
    public final void cssSaving(CssSavingArgs args)
    {
        String uri = null;
        OutputStream stream = null;
        String[] referenceToUri = { uri };
        OutputStream[] referenceToStream = { stream };
        this.createResourceInFolder(this.getCssFolder(), args.getFileName(), /*out*/ referenceToUri, /*out*/ referenceToStream);
        uri = referenceToUri[0];
        stream = referenceToStream[0];
        this.setCssStream(stream);
        args.setStream(stream);
        args.setKeepStreamOpen(this.getKeepCssStreamOpened());
        args.setUri(uri);
 
        this.setCssSaved(this.getCssSaved() + 1);
    }
 
    public final void imageSaving(ImageSavingArgs args)
    {
        String uri = null;
        OutputStream stream = null;
        String[] referenceToUri = { uri };
        OutputStream[] referenceToStream = { stream };
        this.createResourceInFolder(this.getImagesFolder(), args.getFileName(), /*out*/ referenceToUri, /*out*/ referenceToStream);
        uri = referenceToUri[0];
        stream = referenceToStream[0];
        args.setStream(stream);
        args.setUri(uri);
 
        this.setImagessSaved(this.getImagessSaved() + 1);
    }
 
    private void createResourceInFolder(String folder, String filename, /*out*/ String[] uri, /*out*/ OutputStream[] stream)
    {
        String relativePath = folder;
 
        String fullPath = Paths.get(this.getRootFolder(), relativePath).toString();
        File dir = new File(fullPath);
        try {
            if (!dir.exists())
            {
                dir.mkdir();
            }
 
            stream[0] = new FileOutputStream(Paths.get(fullPath, filename).toFile());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        uri[0] = Paths.get(relativePath, filename).toString();
    }
    //ExEnd: UserSavingCallbacks
}
