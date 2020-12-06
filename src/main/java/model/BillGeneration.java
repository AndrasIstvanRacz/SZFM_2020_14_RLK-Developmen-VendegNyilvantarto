package model;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javafx.collections.ObservableList;


/**
 * PDF létrehozása.
 */
public class BillGeneration {

    /**
     * PDF fálj készítése a számla elmentéséhez.
     * @param fajlnev a fájl kívánt neve.
     * @param adat a felvett személyek listája.
     */
    public void pdfGeneration(String fajlnev, Guest adat) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(fajlnev + ".pdf"));
            document.open();

            float[] columnWidths = {2, 4, 4, 4, 6};
            PdfPTable table = new PdfPTable(columnWidths);
            table.setWidthPercentage(100);
            PdfPCell cell = new PdfPCell(new Phrase("Bill"));
            cell.setBackgroundColor(GrayColor.GRAYWHITE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setColspan(5);
            table.addCell(cell);

            table.getDefaultCell().setBackgroundColor(new GrayColor(0.75f));
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell("Name");
            table.addCell("Start date");
            table.addCell("End date");
            table.addCell("Room type");
            table.addCell("Payment");

            table.getDefaultCell().setBackgroundColor(GrayColor.GRAYWHITE);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);



                table.addCell(adat.getName());
                table.addCell(adat.getOccupying_the_room().toString());
                table.addCell(adat.getLeaving_the_room().toString());
                table.addCell(adat.getRoom_type());
                table.addCell(adat.getPayment().toString());


            document.add(table);

        } catch (Exception e) {
            e.printStackTrace();
        }
        document.close();
    }
}