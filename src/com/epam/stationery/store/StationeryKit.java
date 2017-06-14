package com.epam.stationery.store;

import java.util.Collections;
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

		Map<Integer, Set<Stationery>> umap = Collections
				.unmodifiableMap(itemMap);

		Set<Map.Entry<Integer, Set<Stationery>>> entries = umap.entrySet();

		for (Map.Entry<Integer, Set<Stationery>> map : entries) {
			// System.out.print(map.getKey() +":" + map.getValue());
			System.out.print(map.getKey() + ":");
			System.out.println("");
			Set<Stationery> stationery = map.getValue();
			for (Stationery st : stationery) {
				System.out.println(st.getClass() + st.getColor() + ":"
						+ st.getPrice());
			}

		}

	}

	public void add(Integer categoryId, Set stationery) {

		itemMap.put(categoryId, stationery);
	}

}
