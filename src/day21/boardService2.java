package day21;/*
        BoardService2
            -내용 과 작성자로 구성된 게시물을 최대 100개 까지 저장하는 서비스 구축
            -조건 : main함수 1개와 배열은 최대 2까지 사용구현
            -구축 : 게시물 쓰기와 게시물 출력 기능 구현





 */




import java.util.Scanner;

public class boardService2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // - 여러개의 변수에 있는 데이터를 배열로 사용하면 관리가 편하다.
        // 배열이란 ? 여러개의 동일한 타입의 데이터들을 * 하나의 변수 * 에 저장할 수 있는 (참조) 타입

        String content1 = null; // 첫 번째 게시물 내용
        String author1 = null;  // 첫 번째 게시물 작성자
        String content2 = null; // 두 번째 게시물 내용
        String author2 = null;  // 두 번째 게시물 작성자
        int Pos = 0;      //

        while (true) {
            System.out.println("게시물을 작성하려면 1번 게시물 출력을 원하면 2번 종료하려면 0번을 입력하세요:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (Pos < 2) {
                    System.out.print("게시물 내용을 입력하세요: ");
                    String content = scanner.nextLine();
                    System.out.print("작성자를 입력하세요: ");
                    String author = scanner.nextLine();

                    if (Pos == 0) {
                        content1 = content;
                        author1 = author;
                    } else {
                        content2 = content;
                        author2 = author;
                    }
                    Pos++;
                    System.out.println("게시물이 작성되었습니다.");
                } else {
                    System.out.println("게시물 저장 공간이 가득 찼습니다.");
                }
            } else if (choice == 2) {
                System.out.println("작성된 게시물:");
                if (Pos > 0) {
                    System.out.println("게시물 1: " + content1 + " (작성자: " + author1 + ")");
                }
                if (Pos > 1) {
                    System.out.println("게시물 2: " + content2 + " (작성자: " + author2 + ")");
                }
                if (Pos == 0) {
                    System.out.println("작성된 게시물이 없습니다.");
                }
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}

