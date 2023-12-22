package task24.t2;

import java.util.Scanner;

public class Client {
    Chair chair;
    public void setChair(Chair chair){
        this.chair=chair;
    }
    public void sit(){
        if (chair instanceof VictorianChair){
            System.out.println("Викторианский стул возрастом "+((VictorianChair)chair).getAge());
        }
        else if(chair instanceof MagicChair){
            System.out.println("Магический стул");
            ((MagicChair)chair).doMagic();
        }

        else if (chair instanceof FunctionalChair){
            System.out.println("Функциональный стул, умеет складывать числа");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Введите два целых числа");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println("Результат: "+((FunctionalChair)chair).sum(a,b));

        }

    }

    public static void main(String[] args) {
        ChairFactory factory=new ChairFactory();
        VictorianChair chair1=factory.createVictorianChair(10);
        MagicChair chair2=factory.createMagicChair();
        FunctionalChair chair3=factory.createFunctionalChair();

        Client client=new Client();

        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();

    }
}
