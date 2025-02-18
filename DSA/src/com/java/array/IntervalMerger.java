package com.java.array;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class IntervalMerger {
	public int[][] merge(int[][] intervals) {
		// Sort the intervals by their starting times
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> merged = new ArrayList<>();

		for (int[] interval : intervals) {
			// If merged is empty or there is no overlap, add the interval
			if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
				merged.add(interval);
			} else {
				// There is an overlap, merge the current interval with the last one
				merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
			}
		}

		// Convert the list to a 2D array and return
		return merged.toArray(new int[merged.size()][]);
	}

	public static void main(String[] args) {
		IntervalMerger intervalMerger = new IntervalMerger();

		// Example input
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		// Merge intervals
		int[][] result = intervalMerger.merge(intervals);

		// Print the result
		System.out.println("Merged Intervals:");
		for (int[] interval : result) {
			System.out.print("[" + interval[0] + "," + interval[1] + "] ");
		}
	}
}