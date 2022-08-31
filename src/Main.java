public class Main {
    public static void main(String[] args) {
        //Task 1.
        int age=25;
        if(age>=18){
            System.out.println("Congratulation! You are of legal age!");
        } else {
            System.out.println("You need wait. You are not of legal age!");
        }

        //Task 2.
        int age2 = 17;
        if(age2>=7&&age2<18){
            System.out.println("Child go to school");
        } else if(age2>=18&&age2<24){
            System.out.println("Man finish school and go to university");
        } else {
            System.out.println("Man finish university and go to work");
        }

        //Task3
        int wagonCapacity = 102;
        int sittingCapacity = 60;
        int people = 75;
        if(people<=60){
            System.out.println("There are "+(sittingCapacity-people)+" seats");
        } else if(people<=wagonCapacity){
            System.out.println("There are "+(wagonCapacity-people)+" standing room");
        } else{
            System.out.println("Wagon is full");
        }

    }
}