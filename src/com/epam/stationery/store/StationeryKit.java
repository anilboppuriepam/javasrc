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

	public void displayItems() {

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
