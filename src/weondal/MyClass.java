package weondal;

import java.util.*;

public class MyClass {
	
	public void addition() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		System.out.println(list.get(0) + " + " + list.get(1) + " = ? ");
		System.out.println(list.get(2) + " + " + list.get(3) + " = ? ");
		System.out.println(list.get(4) + " + " + list.get(5) + " = ? ");
		System.out.println(list.get(6) + " + " + list.get(7) + " = ? ");
		System.out.println(list.get(8) + " + " + list.get(9) + " = ? ");
		System.out.println("위 문제들의 답을 순서대로 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if (a == (list.get(0) + list.get(1))){
			System.out.println("첫번째 문제는 정답 입니다.");
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (b == (list.get(2) + list.get(3))){
			System.out.println("두번째 문제는 정답 입니다.");
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (c == (list.get(4) + list.get(5))){
			System.out.println("세번째 문제는 정답 입니다.");
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		if (d == (list.get(6) + list.get(7))){
			System.out.println("네번째 문제는 정답 입니다.");
		}else {
			System.out.println("네번째 문제를 틀렸습니다.");
		}
		if (e == (list.get(8) + list.get(9))){
			System.out.println("다섯번째 문제는 정답 입니다.");
		}else {
			System.out.println("다섯번째 문제를 틀렸습니다.");
		}
	}
	
	public void subtraction() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		System.out.println(list.get(0) + " - " + list.get(1) + " = ? ");
		System.out.println(list.get(2) + " - " + list.get(3) + " = ? ");
		System.out.println(list.get(4) + " - " + list.get(5) + " = ? ");
		System.out.println(list.get(6) + " - " + list.get(7) + " = ? ");
		System.out.println(list.get(8) + " - " + list.get(9) + " = ? ");
		System.out.println("위 문제들의 답을 순서대로 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if (a == (list.get(0) - list.get(1))){
			System.out.println("첫번째 문제는 정답 입니다.");
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (b == (list.get(2) - list.get(3))){
			System.out.println("두번째 문제는 정답 입니다.");
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (c == (list.get(4) - list.get(5))){
			System.out.println("세번째 문제는 정답 입니다.");
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		if (d == (list.get(6) - list.get(7))){
			System.out.println("네번째 문제는 정답 입니다.");
		}else {
			System.out.println("네번째 문제를 틀렸습니다.");
		}
		if (e == (list.get(8) - list.get(9))){
			System.out.println("다섯번째 문제는 정답 입니다.");
		}else {
			System.out.println("다섯번째 문제를 틀렸습니다.");
		}
	}
	
	public void multiplication() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		System.out.println(list.get(0) + " * " + list.get(1) + " = ? ");
		System.out.println(list.get(2) + " * " + list.get(3) + " = ? ");
		System.out.println(list.get(4) + " * " + list.get(5) + " = ? ");
		System.out.println(list.get(6) + " * " + list.get(7) + " = ? ");
		System.out.println(list.get(8) + " * " + list.get(9) + " = ? ");
		System.out.println("위 문제들의 답을 순서대로 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if (a == (list.get(0) * list.get(1))){
			System.out.println("첫번째 문제는 정답 입니다.");
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (b == (list.get(2) * list.get(3))){
			System.out.println("두번째 문제는 정답 입니다.");
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (c == (list.get(4) * list.get(5))){
			System.out.println("세번째 문제는 정답 입니다.");
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		if (d == (list.get(6) * list.get(7))){
			System.out.println("네번째 문제는 정답 입니다.");
		}else {
			System.out.println("네번째 문제를 틀렸습니다.");
		}
		if (e == (list.get(8) * list.get(9))){
			System.out.println("다섯번째 문제는 정답 입니다.");
		}else {
			System.out.println("다섯번째 문제를 틀렸습니다.");
		}
	}
	
	public void division() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		System.out.println(list.get(0) + " / " + list.get(1) + " = ? ");
		System.out.println(list.get(2) + " / " + list.get(3) + " = ? ");
		System.out.println(list.get(4) + " / " + list.get(5) + " = ? ");
		System.out.println(list.get(6) + " / " + list.get(7) + " = ? ");
		System.out.println(list.get(8) + " / " + list.get(9) + " = ? ");
		System.out.println("위 문제들의 답을 순서대로 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if (a == (list.get(0) / list.get(1))){
			System.out.println("첫번째 문제는 정답 입니다.");
		}else {
			System.out.println("첫번째 문제를 틀렸습니다.");
		}
		if (b == (list.get(2) / list.get(3))){
			System.out.println("두번째 문제는 정답 입니다.");
		}else {
			System.out.println("두번째 문제를 틀렸습니다.");
		}
		if (c == (list.get(4) / list.get(5))){
			System.out.println("세번째 문제는 정답 입니다.");
		}else {
			System.out.println("세번째 문제를 틀렸습니다.");
		}
		if (d == (list.get(6) / list.get(7))){
			System.out.println("네번째 문제는 정답 입니다.");
		}else {
			System.out.println("네번째 문제를 틀렸습니다.");
		}
		if (e == (list.get(8) / list.get(9))){
			System.out.println("다섯번째 문제는 정답 입니다.");
		}else {
			System.out.println("다섯번째 문제를 틀렸습니다.");
		}
	}

}
