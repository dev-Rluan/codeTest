class test {

    // 아래의 실행 메서드 main은 calculateLove 메서드를 실행시키기 위해 작성되었습니다.
    // public, static 등의 키워드에 아직 익숙하지 않아도 괜찮습니다.
    // calculateLove 메서드 내부의 흐름 위주로 고민해주세요.

    public static void main( String[ ] args ) {
        int  result = loop();
        System.out.println(result);
    }


    // 여기서 String 은 calculateLove 메서드의 반환 타입이 “문자열”임을 의미합니다.
    public static int loop(  ) {

        int  num = 5;


       for(int i = 0; i< 10; i=i+3){
           num = num+i;
           for(int j =0; j<3;j=j+1){
               num = num +j;
           }
       }
        return num;
    }

}