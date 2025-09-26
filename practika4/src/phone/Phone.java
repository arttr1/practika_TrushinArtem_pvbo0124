package phone;

public class Phone{
    private String number, model;
    private int weight;
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    Phone(){
        this.number = "";
        this.model = "";
        this.weight = Integer.MIN_VALUE;
    }

    void receiveCall(String name){
        System.out.printf("Звонит %s\n", name);
    }

    void receiveCall(String name, String number){
        System.out.printf("Звонит %s, номер: %s\n", name, number);
    }

    void sendMessage(String... numbers){
        System.out.println("Сообщение будет отправлено следующим абонентам");
        System.out.println("====================");
        for (String number: numbers){
            System.out.println(number);
        }
        System.out.println("====================");

    }

    String getNumber(){
        return this.number;
    }

    String getModel(){
        return this.model;
    }


}