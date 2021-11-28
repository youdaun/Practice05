package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Friend[] friend = new Friend[3];
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<friend.length; i++) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			
			System.out.print("학교: ");
			String school = sc.nextLine();
			
			System.out.println("-----------------------------");
			
			Friend f = new Friend(name, hp, school);
			friend[i] = f;
		}
		
		for(int i=0; i<friend.length; i++) {
			friend[i].showInfo();
		}

		sc.close();
	}

}
