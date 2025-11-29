public class OrderService {

    /**
     * Имитация оформления заказа с проверкой ИНН.
     * @param fullName ФИО клиента
     * @param inn ИНН (строка)
     * @throws InvalidINNException если ИНН недействителен
     */
    public void placeOrder(String fullName, String inn) throws InvalidINNException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }

        validateINN(inn); // Проверка ИНН — может выбросить InvalidINNException

        System.out.println("Заказ оформлен для: " + fullName + " (ИНН: " + inn + ")");
    }

    private void validateINN(String inn) throws InvalidINNException {
        if (inn == null) {
            throw new InvalidINNException("ИНН не указан");
        }

        String trimmed = inn.trim();
        if (trimmed.isEmpty()) {
            throw new InvalidINNException("ИНН пустой");
        }

        // Проверяем, что состоит только из цифр
        if (!trimmed.matches("\\d+")) {
            throw new InvalidINNException("ИНН содержит недопустимые символы: '" + trimmed + "'");
        }

        // Допустимые длины: 10 (юрлица) или 12 (физлица)
        int len = trimmed.length();
        if (len != 10 && len != 12) {
            throw new InvalidINNException("Некорректная длина ИНН: " + len + " (должно быть 10 или 12)");
        }

        // Простейшая проверка: не все нули
        if (trimmed.matches("0+")) {
            throw new InvalidINNException("ИНН не может состоять только из нулей");
        }

    }
}