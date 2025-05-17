
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import product.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private static final ObjectMapper jsonMapper = new ObjectMapper();
    private static final String DATA_DIR = "data/";

    static {
        new File(DATA_DIR).mkdirs();
    }

    // Сохранение в JSON
    public static void saveProductsToJson(List<Product> products) throws IOException {
        jsonMapper.writeValue(new File(DATA_DIR + "products.json"), products);
    }

    // Загрузка из JSON
    public static List<Product> loadProductsFromJson() throws IOException {
        File file = new File(DATA_DIR + "products.json");
        if (file.exists()) {
            return jsonMapper.readValue(file, new TypeReference<List<Product>>() {});
        }
        return new ArrayList<Product>();
    }

    // Экспорт в Excel
    public static void exportProductsToExcel(List<Product> products, String filePath) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Товары");

        // Заголовки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Название");
        headerRow.createCell(2).setCellValue("Цена");

        // Данные
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(p.getId());
            row.createCell(1).setCellValue(p.getName());
            row.createCell(2).setCellValue(p.getPrice());
        }

        // Сохранение
        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);
        workbook.close();
        out.close();
    }
}