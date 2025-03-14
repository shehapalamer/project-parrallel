import java.io.FileWriter;
import java.io.IOException;

public class BookScraper {
    public static void main(String[] args) {
        // مثال: حفظ بيانات تجريبية في ملف CSV على سطح المكتب
        try (FileWriter writer = new FileWriter("/Users/shehabsalah/Desktop/books.csv", true)) {
            writer.append("Title,Price,Rating\n");
            writer.append("Example Book,£10.00,Three\n");
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
