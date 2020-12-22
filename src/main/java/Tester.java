import box.Items;
import box.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class Tester {
    private static final String API = "https://api.hh.ru/vacancies?text=";
    public static void main(String[] args) throws Exception {
        testReq();
    }

    public static void testReq() throws Exception {
        RestTemplate retTemp = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.add("authorisation", "Bearer JOIN9M0LTBRLMF0S1JBLA2VUSFHAPSJF63PGT89P96D6HGNNHALD7QL2PSTKUD8P");

        String otchet="";
        File output = new File("otchet.txt");
        writeUsingFileWriter("",output,false);

        String[] testvalues = {
                "",
                "java разработчик",
                "c++ разработчик",
                "java разработчик AND c++ разработчик",
                "Кафе OR Магазин",
                "стажёр",
                "!стажёр",
                "стажёр NOT директор",
                "(Продавец OR Менеджер) AND (Управляющий OR Уборщик) NOT цветочный NOT продуктовый NOT кассир NOT торгового",
                "аудит*",
                "hr-менеджер",
                "11.03.22",
                "10.12.20",
                "директор",
                "director",
                "rendező",
                "導向器",
                "!@$!@$%XXXX!$",
                "123333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" +
                        "3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" +
                        "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" +
                        "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" +
                        "333333333333333333333333333333333333333333333333333333333335555555555555555555555555555555555555555555555555555555555555555555555555555352",
                "a231s123148766425^%^@$%^!@%^#dffffsd!#####",
                "https://www.win-rar.com/fileadmin/winrar-versions/winrar/winrar-x64-600.exe",
                "<script type=\"text/javascript\" language=\"JavaScript\">" +
                        " var res=\"1111111111\" ",
                "https://cdn.pixabay.com/photo/2016/07/18/13/58/sun-flower-1525921_1280.jpg",
                "admin@hh.ru",
                "XSS - `<script>alert('Executing JS')</script>`",
                "DROP TABLE users;",
                API+API+API+API+API+API,
                "<form action=\"\" method=\"get\">\n" +
                        "  <input name=\"s\" placeholder=\"Искать здесь...\" type=\"search\">\n" +
                        "  <button type=\"submit\">Поиск</button>\n" +
                        "</form>"

        };

        for(String value : testvalues){
            ResponseEntity<String> out = retTemp.exchange(API+value, HttpMethod.GET,null,String.class);
            ObjectMapper mapper = new ObjectMapper();
            Result result = mapper.readValue(out.getBody(),Result.class);
            List<String> vacancies =
                    result.getItems().stream()
                            .map(Items::getName)
                            .collect(Collectors.toList());

            otchet = vacancies.size()!=0 ? "Содержимое поля текст : "+value+"\n"+"Вакансий( "+result.getFound()+"): "+vacancies
                    : "Содержимое поля текст : "+value+"\n"+"Вакансий не найдено";
            System.out.println("Статус запроса: "+out.getStatusCode()+"; "+otchet+"\n");
            writeUsingFileWriter("Статус запроса: "+out.getStatusCode()+"; "+otchet+"\n",output,true);
        }

    }

    private static void writeUsingFileWriter(String data, File file, boolean append) throws Exception {
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,append);
            fr.write(data+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
