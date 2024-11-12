package day21;

import java.util.Scanner;

public class BoardService1 {



    public static void main(String[] args) { // main start // 번역된 코드들을 실행하는 기능 (main스레드) 포함

        // - 입력 객체
        Scanner scanner =new Scanner(System.in);
        // - 저장소 설계, 게시물1개당 내용과작성자(2개), 게시물 3개면 내용6개
        // 변수란? 하나의 데이터/주소값 을 저장하는 공간/메모리
        //타입이란? 변수의 저장될 데이터/주소의 타입, 데이터 분류, 기본타입(7:int~double) vs 참조타입( 클래스,인터페이스,배열)

        String content1 = "" ;          String writer1 = "" ;
        String content2 = "" ;          String writer2 = "" ;
        String content3 = "" ;          String writer3 = "" ;


        //if :  다중 if는  다중 조건의 다중결과를 충족 할 수 있다.,
        //if~else if : 다중 조건의 무조건 1개 결과를 충족한다.


        while ( true ){ //무한루프
            System.out.println("1.게시물쓰기 2.게시물출력 선택 : ");// 출력
            int choose = scanner.nextInt();
            if( choose == 1) { //만약에 입력한 값이 1이면 '게시물 쓰기' 구현

                // 게시물을 저장할 내용 입력 받기
                System.out.printf("새로운 게시물 내용: "); String content = scanner.next();
                System.out.printf("새로운 게시물 작성자: "); String writer = scanner.next();

                // 게시물을 작성할 공간이 있는지 체크, 임의로 게시물이 존재하지 않는 뜻 null(객체없다뜻) 또는""
                if( content1 == null ){ // 만약에 첫번쨰 게시물의 정보가 비어있으면 입력받기
                    content1 = content; writer1 = writer;

                } else if ( content2 == null ) {
                    content2 = content; writer2 = writer;
                } else if ( content3 == null ) {
                    content3 = content; writer3 =writer;

                }else{
                    System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");
                }

            }
            else if ( choose == 2) { // 만약에 입력한 값이 2이면 '게시물 출력' 구현

            }
        }



    }
}
