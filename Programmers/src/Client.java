package src;/*
문제의 이해
0. 객체 : 고객, 메뉴판, 요리사, 요리
    - 고객    : 주문의 주체, 주문시 요리 선택 - dish
    - 메뉴판   : 요리사는 메뉴판을 통해 조리, 고객은 메뉴판을 이용 - 주문시 메뉴판 객체를 만들어서 요리사에게 보내주어야함
        - 메뉴판 내에는 요리명, 음식 분류, 먹는 방식 등이 명시
    - 요리사   : 메뉴판을 이용해서 조리 이후 조리된 요리를 고객에게 전달 - dish 반환
    - 요리    : 조리된 요리? 고객에게 넘어갈때 사용 - 완성된 요리 : 요리이름, 먹는 방식
1. 고객은 요리사에게 요리를 주문 할 수 있다. : Shef(new Menu(Dish))
2. 고객은 주문 시 메뉴판을 이용하여 주문해야 한다.
    - 요리사는 고객에게 전달받은 메뉴판을 통해 조리를 할 수 있다.
        : 매개변수로 메뉴판을 받아야함 (메뉴판에는 각 요리명, 음식분류, 먹는 방식 등이 명시되어있음 - )
        : 요리 선택은 Clinet 에서 해야한다.
3. 조리 이후 요리사는 조리된 요리를 고객에게 전달한다. : Dish

####
추가 : 프로퍼티 사용
추가 : 모아 주문하기? - 삭제
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        // 입출력 모듈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 메뉴 목록
        HashMap<String,Menu> hashMap = new HashMap<>();
        hashMap.put("갈비찜", new Menu("갈비찜", FoodType.KOREAN_FOOD, EatingType.CHOPSTICKS));
        hashMap.put("파스타", new Menu("파스타", FoodType.WESTERN_FOOD, EatingType.FORK));
        hashMap.put("마파두부", new Menu("마파두부", FoodType.CHINESE_FOOD, EatingType.SPOON));

        while(true){
            System.out.println("주문하시겟습니까?");
            System.out.println("==============");
            // 메뉴 목록 불러오기
            OrderMenu(hashMap);
            // 메뉴 입력
            String s = br.readLine();
            // 메뉴 확인
            if(s.equals("주문 종료")){
                break;
            }else{
                // 선택된 메뉴 존재 확인
                Menu menu = hashMap.get(s);
                if(menu != null){
                    // 메뉴 주문 후 요리와 먹는 방법 받기(Dish)
                    Dish takeDish = Shef.Order(menu);
                    String eating;
                    switch(takeDish.getEating()){
                        case FORK : eating="포크로 먹습니다.";
                            break;
                        case CHOPSTICKS: eating="젓가락으로 먹습니다.";
                            break;
                        case SPOON: eating="숟가락으로 먹습니다.";
                            break;
                        default:
                            eating="먹는 방법은 따로 없습니다.";
                    }
                    // 출력
                    System.out.println("고객은 주문한 " + takeDish.getFoodName() + "을 받았으며, " + eating);
                }else {// 선택한 메뉴가 없을 경우
                    System.out.println("주문한 메뉴가 없습니다. 다시 주문하여 주십시오");
                }
            }
        }

    }
    // 메뉴 목록 불러오기
    public static void OrderMenu(HashMap<String, Menu> map){
        int cnt = 0;
        for (String str : map.keySet()) {
            System.out.println(str);
        }
    }

}
/**
 * 기능
 * 요리사에게 전달
 * 객체를 요리사에게 넘겨야함
 * foodName = 음식 이름
 * foodType = 음식 분류
 * eating = 먹는 방식
 */
// 음식이름, 음식 분류, 먹는 방법
class Menu {
    private String foodName;
    private FoodType foodType;
    private EatingType eating;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public EatingType getEating() {
        return eating;
    }

    public void setEating(EatingType eating) {
        this.eating = eating;
    }

    public Menu(String foodName, FoodType foodType, EatingType eating){
        this.foodName = foodName;
        this.foodType = foodType;
        this.eating = eating;
    }
}

/**
 * @return Dish
 */
class Shef{

    public static Dish Order(Menu menu){
        String foodType;
        switch (menu.getFoodType()){
            case KOREAN_FOOD: foodType="한식";
                break;
            case JAPANESE_FOOD: foodType="일식";
                break;
            case CHINESE_FOOD: foodType="중식";
                break;
            case WESTERN_FOOD: foodType="양식";
                break;
            default:
                foodType="";
                break;

        }
        System.out.println(foodType + " 요리사는 " + menu.getFoodName() + " 주문을 받았습니다.");
        System.out.println(foodType + " 요리사는 " + menu.getFoodName() + "을 만들었습니다.");

        return new Dish(menu.getFoodName(), menu.getEating());
    }
}
/**
 * foodName = 음식 이름
 * eating = 먹는 방식
 */
class Dish{
    private String foodName;
    private EatingType eating;

    public String getFoodName() {
        return foodName;
    }

    public EatingType getEating() {
        return eating;
    }

    public Dish(String foodName, EatingType eating) {
        this.foodName = foodName;
        this.eating = eating;
    }
}
// 프로퍼티 정의

enum FoodType{
    KOREAN_FOOD,     // 한식
    JAPANESE_FOOD,     // 일식
    CHINESE_FOOD,   // 중식
    WESTERN_FOOD,   // 양식
}
enum EatingType{
    CHOPSTICKS,     // 젓가락
    SPOON,          // 숟가락
    FORK,           // 포크
}
