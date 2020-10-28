package com.kh.challenge.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ChallengeServiceImpl implements ChallengeService {

	private Scanner sc = new Scanner(System.in);

	@Override
	public void challenge1() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	@Override
	public void challenge2() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.print("1~100 합계 : " + sum);
	}

	@Override
	public void challenge3() {
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}

	@Override
	public void challenge4() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}

	}

	@Override
	public void challenge5() {
		System.out.println("입력 1 : ");
		int input1 = sc.nextInt();
		System.out.println("입력 2 : ");
		int input2 = sc.nextInt();

		for (int i = input1; i <= input2; i++) {
			if (i > input2) {
				int temp = input2;
				input2 = input1;
				input1 = temp;

			}

		}

	}

	@Override
	public void challenge6() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge7() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge8() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge9() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge10() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge11() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge12() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge13() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge14() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge15() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge16() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge17() {
		// TODO Auto-generated method stub

	}

	@Override
	public void challenge18() {
		System.out.println("입력 : ");
		int input = sc.nextInt();

		char[][] star = new char[input][input];

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				if (i == j) {
					star[i][j] = '*';
				}
				if (i + j == 4) {
					star[i][j] = '*';
				}
				System.out.print(star[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void challenge19() {
		int[][] random = new int[4][4];

		Set<Integer> sort = new LinkedHashSet<Integer>();
		while (sort.size() < 16) {
			int rand = (int) (Math.random() * 16 + 1);
			sort.add(rand);
		}

		List<Integer> list = new ArrayList<Integer>(sort);
		System.out.println(list);
		int index = 0;
		for (int i = 0; i < random.length; i++) {
			for (int j = 0; j < random[i].length; j++) {
				random[i][j] = list.get(index++);

			}
		}
		int count = 0;
		while (true) {
			System.out.println();
			for (int i = 0; i < random.length; i++) {
				for (int j = 0; j < random[i].length; j++) {
					System.out.print(random[i][j] + " ");
				}
				System.out.println();
			}

			if(count == 16) break;
			System.out.print("0으로 변환할 숫자 : ");
			int input = sc.nextInt();

			for (int i = 0; i < random.length; i++) {
				for (int j = 0; j < random[i].length; j++) {
					if (input == random[i][j]) {
						random[i][j] = 0;
						count++;
						
					}
				}
			}

		}

	}

	@Override
	public void challenge20() {
		System.out.print("계산해야되는 금액 : ");
		int price = sc.nextInt();
	
		System.out.print("제출한 금액 : ");
		int money = sc.nextInt();
		
		int change = money - price;
		
		System.out.println("거스름돈 : " + change);
		
		System.out.println("5만원 : " + change/50000);
		System.out.println("1만원 : " + change/10000);
		System.out.println("5천원 : " + change/50000);
		System.out.println("5만원 : " + change/50000);
		System.out.println("5만원 : " + change/50000);
		System.out.println("5만원 : " + change/50000);
		System.out.println("5만원 : " + change/50000);
		System.out.println("5만원 : " + change/50000);
		
		
		
		

	}

	@Override
	public void challenge21() {
		char[][] arr = new char[5][5];
		for(int i = 0; i < 5; i++) {
			arr[i][i] = '*';
			arr[i][arr.length -1 - i] = '*';
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

	@Override
	public Set<Integer> generateLotto() {
		// TODO Auto-generated method stub
		return null;
	}

}
