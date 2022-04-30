package com.greatlearning.gradedproject3;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import com.greatlearning.question1.service.Service;

class Floor {

	public static void floorConstruction(int floor[], int numberOfFloor) {

		System.out.println("The order of construction is as follows");

		Queue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		int[] tempArray = new int[numberOfFloor];
		int max = numberOfFloor;

		for (int var = 0; var < numberOfFloor; var++) {

			System.out.println("Day: " + (var + 1));
			tempArray[var] = floor[var];
			queue.add(tempArray[var]);

			while (!queue.isEmpty() && queue.peek() == max) {
				System.out.print(queue.poll() + " ");
				max--;
			}
		}

	}

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");

		int numberOfFloor = scanner.nextInt();

		int floors[] = new int[numberOfFloor];

		for (int var = 0; var < numberOfFloor; var++) {
			System.out.println("enter the floor size given on day : " + (var + 1));
			floors[var] = scanner.nextInt();
		}
		System.out.println();

		floorConstruction(floors, numberOfFloor);
	}
}