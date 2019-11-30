package com.aspose.note.examples.Notebook;

import com.aspose.note.Notebook;
import com.aspose.note.NotebookPdfSaveOptions;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class ConvertToPDFAsFlattened {
    public static void main(String[] args) throws IOException {
        // ExStart:ConvertToPDFAsFlattened
        String dataDir = Utils.getSharedDataDir(ConvertToPDFAsFlattened.class) + "Notebook/";

        // Load a OneNote Notebook
        Notebook notebook = new Notebook(dataDir + "Notizbuch îffnen.onetoc2");

        NotebookPdfSaveOptions notebookSaveOptions = new NotebookPdfSaveOptions();

        notebookSaveOptions.setFlatten(true);

        dataDir = dataDir + "ExportNotebookToPDFAsFlattened_out.pdf";

        // Save the Notebook
        notebook.save(dataDir, notebookSaveOptions);
        // ExEnd:ConvertToPDFAsFlattened
    }
}
