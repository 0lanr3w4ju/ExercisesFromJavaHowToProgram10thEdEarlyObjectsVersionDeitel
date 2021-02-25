package com.alpha.company;

import javax.print.PrintService;
import java.awt.print.*;

public class printStuff {
    public static PrintService findPrintService(String printerName) {
        PrintService printService = null;
        PrintService[] printServices = PrinterJob.lookupPrintServices();
        for (int index = 0; printService == null && index < printServices.length; index++) {
            if (printServices[index].getName().equalsIgnoreCase(printerName)) {
                printService = printServices[index];
            } else {
                System.out.println("no such printer!");
                return null;
            }
        }
        return printService;
    }

    public static PrinterJob findPrinterJob(String printerName) throws PrinterException {
        PrintService printService = findPrintService(printerName);

        if (printService != null) {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPrintService(printService);
            return printerJob;
        }
        else {
            throw new IllegalStateException("Unrecognized Printer Service \"" + printerName + '"');
        }
    }




}
