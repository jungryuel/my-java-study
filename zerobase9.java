// Java 프로그래밍 - 클래스와 객체_1
class Car {
    String name;
    String type;
//car(){} 생성자는 있으나 생략가능
    public void printCarInfo() {//void는 반환값이 없다는 의미
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    public void move() {
        System.out.println("이동!");
    }

    public void brake() {
        System.out.println("정지!");
    }
}

class Car2 {
    String name;
    String type;

//    Car2() {}
    Car2(String name, String type) {
        this.name = name;//받아온 이름을 객체의 변수에 할당
        this.type = type;//this는 자기객체를 가리킨다
        System.out.println("생성자 출력!");
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    public void load() {
        System.out.println("짐을 주세요!");
    }

    public void horn() {
        System.out.println("빵빵!");
    }
}


public class zerobase9 {

    public static void main(String[] args) {
        //클래스 사용
    	Car myCar1 = new Car();//객체 생성
        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCarInfo();//각 메소드 출력
        myCar1.move();
        myCar1.brake();

        Car2 myCar2 = new Car2("b", "sedan");//26행에 생성자 부분이 비어있기에 여기서 넣어준다 
        myCar2.printCarInfo();
        myCar2.load();
        myCar2.horn();
    }
}
