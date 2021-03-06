package com.alpha.company;

import javax.print.PrintService;
import java.awt.print.PrinterJob;

public class Printer {
    public static PrintService printService(String printerName) {
        PrintService service = null;

        PrintService[] services = PrinterJob.lookupPrintServices();

        for (int index = 0; service == null && index < services.length; index++) {
            if (services[index].getName().equalsIgnoreCase(printerName)) {
                service = services[index];
            }
        }
        return service;
    }

    public static PrinterJob printerJob(String printerName) throws Exception {
        PrintService printService = Printer.printService(printerName);

        if (printService == null) {
            throw new IllegalStateException("Unrecognized Printer Service \"" + printerName + '"');
        } else {
            PrinterJob printerJob1 = PrinterJob.getPrinterJob();
            printerJob1.setPrintService(printService);
            return printerJob1;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(printService("CUPS-BRF-Printer"));
    }
}
