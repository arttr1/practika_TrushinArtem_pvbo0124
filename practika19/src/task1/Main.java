public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        System.out.println("=== 🛒 Тест оформления заказов с разными ИНН ===");
        testOrder(orderService, "Иванов Иван Иванович", "7707083893");       
        testOrder(orderService, "Петрова Анна", "500100732259");             
        testOrder(orderService, "Сидоров С.С.", "123");                      
        testOrder(orderService, "Кузнецов", "");                             
        testOrder(orderService, "Морозова Е.В.", "0000000000");              
        testOrder(orderService, "Лебедев А.", "abc123");                     
        testOrder(orderService, "Новиков Д.", null);                         
    }

    private static void testOrder(OrderService service, String fullName, String inn) {
        try {
            service.placeOrder(fullName, inn);
        } catch (InvalidINNException e) {
            System.err.println("Ошибка для '" + fullName + "': " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Некорректные данные: " + e.getMessage());
        }
    }
}