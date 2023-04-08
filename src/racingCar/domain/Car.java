package racingCar.domain;

public class Car {

    private static final int GO_FORWARD_NUM = 4;
    private static final String GO_FORWARD_MARKING = "_";
    private static final int GO_FORWARD_DISTANCE = 1;

    private final String name;
    private int position;


    private String displayCurrentPosition(){
        StringBuilder currentPosition = new StringBuilder();
        for(int i = 0; i < this.position; i++){
            currentPosition.append(GO_FORWARD_MARKING);
        }
        return currentPosition.toString();
    }



    public Car(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}
