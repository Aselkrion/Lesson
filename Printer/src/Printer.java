public class Printer {
    private String queue = ""; // Вывести все на печать
    private String printer = "";
    private int printerNumberOfPages = 0;
    private String totalQueue = "";
    private int totalPrinterNumberOfPages = 0;

    public String documentText;  // Переменная текст документа
    public String documentName; // Переменная имя документа
    private int numberOfPages;

    public Printer(String documentName, String documentText) {
        this.documentName = documentName;
        this.documentText = documentText;
    }


    public void append() {
        if (documentText.isEmpty()) {
            return;
        }
        queue = queue + documentName + "\n" + "-----------------------------------------\n" + documentText + System.lineSeparator() + System.lineSeparator();
        numberOfPages = numberOfPages + (1 + documentText.length() / 100);
    }

    public void printer() {
        printer = printer + queue;
        queue = "";
        totalQueue = "";
        printerNumberOfPages = printerNumberOfPages + numberOfPages;
        numberOfPages = 0;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


    public int getTotalPrinterNumberOfPages() {
        return totalPrinterNumberOfPages = totalPrinterNumberOfPages + printerNumberOfPages;
    }

    public String getTotalQueue() {
        return totalQueue = totalQueue + queue;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    @Override
    public String toString() {
        return printer + "\n" + "Распечатанных страниц: " + getTotalPrinterNumberOfPages() +
                "\n" + "Не распечатанных страниц: " + getNumberOfPages() +
                "\n" + "Текст в очереди на печать: " + "\n" + getTotalQueue();
    }

}
