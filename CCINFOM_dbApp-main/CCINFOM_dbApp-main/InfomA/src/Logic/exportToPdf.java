package Logic;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.layout.property.TextAlignment;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileNotFoundException;

public class ExportToPdf {

    public void exportTable(
            DefaultTableModel tableModel,
            String fileName,
            String title,
            String recordLabel
    ) {
        try {
            // Create Reports directory if it doesn't exist
            File outputDir = new File("Reports");
            if (!outputDir.exists()) {
                outputDir.mkdir();
            }

            String filepath = "Reports" + File.separator + fileName;

            PdfWriter writer = new PdfWriter(filepath);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            /* =========================
               TITLE
               ========================= */
            Paragraph paragraphTitle = new Paragraph(title);
            paragraphTitle.setFontSize(18);
            paragraphTitle.setBold();
            paragraphTitle.setTextAlignment(TextAlignment.CENTER);
            paragraphTitle.setMarginBottom(20);
            document.add(paragraphTitle);

            /* =========================
               TOTAL RECORD COUNT
               ========================= */
            int totalRecords = tableModel.getRowCount();
            Paragraph totalCount = new Paragraph(recordLabel + ": " + totalRecords);
            totalCount.setFontSize(12);
            totalCount.setBold();
            totalCount.setMarginBottom(20);
            document.add(totalCount);

            /* =========================
               TABLE
               ========================= */
            Table pdfTable = new Table(tableModel.getColumnCount());
            pdfTable.setWidth(com.itextpdf.layout.property.UnitValue.createPercentValue(100));

            // Headers
            for (int i = 0; i < tableModel.getColumnCount(); i++) {
                Cell headerCell = new Cell()
                        .add(new Paragraph(tableModel.getColumnName(i)))
                        .setBackgroundColor(ColorConstants.LIGHT_GRAY)
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBold();

                pdfTable.addCell(headerCell);
            }

            // Rows
            for (int row = 0; row < tableModel.getRowCount(); row++) {
                for (int col = 0; col < tableModel.getColumnCount(); col++) {
                    Object value = tableModel.getValueAt(row, col);
                    pdfTable.addCell(
                            new Cell().add(new Paragraph(value != null ? value.toString() : ""))
                    );
                }
            }

            document.add(pdfTable);
            document.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

