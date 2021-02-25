package com.alpha.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrinterApp {

    private static boolean jobRunning = true;

    public static void main(String[] args) throws Exception {

        // Opens the image file

        FileInputStream fileInputStream = new FileInputStream("/home/lanre/Documents/notes/useFulPictures/1_VdLFpmSutr5BSbEeAtpmrQ.jpeg");
        InputStream inputStreams = new BufferedInputStream(fileInputStream);

        // creates a PDF doc flavor

        DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;

        // Locates the default print service for this environment.

        PrintService service = PrintServiceLookup.lookupDefaultPrintService();

        // Create and return a PrintJob capable of handling data from any of the supported document flavors.

        DocPrintJob printJob = service.createPrintJob();

        // register a listener to get notified when the job is complete

        printJob.addPrintJobListener(new JobCompleteMonitor());

        // Construct a SimpleDoc with the specified

        // print data, doc flavor and doc attribute set.

        Doc doc = new SimpleDoc(inputStreams, flavor, null);

        // Print a document with the specified job attributes.

        printJob.print(doc, null);

        while (jobRunning) {

            Thread.sleep(1000);

        }

        System.out.println("Exiting app");

        inputStreams.close();

    }

    private static class JobCompleteMonitor extends PrintJobAdapter {
        @Override
        public void printJobCompleted(PrintJobEvent jobEvent) {
            System.out.println("Job completed");
            jobRunning = false;
        }
    }

}


//public class PrinterApp {
//
//}
