package com.epam.stationery.store;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;

import com.epam.domain.Clip;
import com.epam.domain.Folder;
import com.epam.domain.Marker;
import com.epam.domain.Paper;
import com.epam.domain.Pen;
import com.epam.domain.Pencil;
import com.epam.domain.Stapler;
import com.epam.domain.Stationery;
import com.epam.domain.StickNote;

public class StationeryKit {

	private Map<Integer, Set<Stationery>> itemMap = new HashMap<>();

	public void displayItemName(Integer key) {

		System.out.println(itemMap.get(key));

	}

	public void display(Integer key) {
		// validate the key

		Set<Stationery> stationery = itemMap.get(key);
		System.out.println(stationery);

	}

	/*
	 *  This method has lot of code smell hence alternative implementation
	 *  has been developed with name diplayItems2()
	 * public void displayItems() {

		System.out.printf("\t%20s%20s%20s \n", " ProductID", "Description",
				"Price");
		for (Map.Entry<Integer, Set<Stationery>> entry : itemMap.entrySet()) {

			Integer key = entry.getKey();
			Set<Stationery> stationery = itemMap.get(key);

			for (Stationery st : stationery) {

				if (st instanceof Pencil) {

					Pencil pencil = (Pencil) st;

					System.out.printf("\t%20s%20s%20.2f\n ", key,
							pencil.getColor()
									+ pencil.getClass().getSimpleName(),
							pencil.getPrice());
				} else if (st instanceof Pen) {

					Pen pen = (Pen) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key,
							pen.getColor() + pen.getClass().getSimpleName(),
							pen.getPrice());
				}

				else if (st instanceof Paper) {

					Paper paper = (Paper) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key, paper
							.getClass().getSimpleName(), paper.getPrice());
				} else if (st instanceof Clip) {

					Clip clip = (Clip) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key, clip
							.getClass().getSimpleName(), clip.getPrice());
				} else if (st instanceof Marker) {

					Marker marker = (Marker) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key, marker
							.getClass().getSimpleName(), marker.getPrice());
				} else if (st instanceof Stapler) {

					Stapler stapler = (Stapler) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key, stapler
							.getClass().getSimpleName(), stapler.getPrice());
				} else if (st instanceof Folder) {

					Folder folder = (Folder) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key, folder
							.getClass().getSimpleName(), folder.getPrice());
				} else if (st instanceof StickNote) {

					StickNote stickNote = (StickNote) st;
					System.out.printf("\t%20s%20s%20.2f\n ", key, stickNote
							.getClass().getSimpleName(), stickNote.getPrice());
				}

			}
			System.out.println();

		}
	}
*/
	public void displayItems2() {

		System.out.printf("\t%20s%20s%20s \n", " ProductID", "Description",
				"Price");
		for (Map.Entry<Integer, Set<Stationery>> entry : itemMap.entrySet()) {

			Integer key = entry.getKey();
			Set<Stationery> stationery = itemMap.get(key);

			for (Stationery st : stationery) {

				System.out.printf("\t%20s%20s%20.2f\n ", key, st.getClass()
						.getSimpleName(), st.getPrice());
			}
			System.out.println();
		}

	}

	public void add(Integer categoryId, Set stationery) {

		itemMap.put(categoryId, stationery);
	}

}
