package 영화표예매;

import java.util.Scanner;

public class CheckSeat {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1]예약하기, [2]종료하기");
            int choice = sc.nextInt();
            if (choice == 2) {
                movie.SeatStatus();
                movie.TicketPrice();
                break;
            }
            if (choice == 1) {
                System.out.println("좌석을 선택해주세요");
                movie.SeatChoice(sc.nextInt());
                movie.SeatStatus();




            }

        }
    }
}

         class Movie {
            int arr[] = new int[10];
            final int price = 12000;
            int seatnum;
            int ticketP = 0;

            public void SeatStatus() {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) System.out.print("[ ]");
                    else System.out.print("[V]");
                }
            }

            public void SeatChoice(int seatnum) {
                if (arr[seatnum-1] == 0) {
                    System.out.println("좌석이 선택 되었습니다.");
                    arr[seatnum-1] = 1;
                } else System.out.println("이미 예약된 좌석입니다.");
            }
            public void TicketPrice (){
                for (int i = 0; i < 10; i++) {
                    if (arr[i] == 1) {
                        ticketP += 12000;
                    }
                }
                System.out.println("티켓 가격은" + ticketP + "입니다.");
             }

        }

