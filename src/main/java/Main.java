import ru.netology.SQRService;

public class Main {
    public static void main(String[] args) throws Exception {

        SQRService service = new SQRService(200, 300);
        System.out.println(service.findNumberOfSquares());
    }
}