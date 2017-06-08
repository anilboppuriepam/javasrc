package com.epam.factory;

import java.util.HashSet;
import java.util.Set;

import com.epam.domain.Clip;
import com.epam.domain.Folder;
import com.epam.domain.Marker;
import com.epam.domain.Paper;
import com.epam.domain.Pen;
import com.epam.domain.Pencil;
import com.epam.domain.Stapler;
import com.epam.domain.StickNote;
import com.epam.interfaces.StationeryIdentifiers;
import com.epam.stationery.store.StationeryKit;

public class Main {

	static StationeryKit kit = new StationeryKit();

	static {

		// 1. first create each stationery item
		Pencil greenPencil = new Pencil(10, "Green");
		Pencil bluePencil = new Pencil(10, "Blue");
		Pencil redPencil = new Pencil(10, "Red");

		// 2. add them to a set of pencils

		Set<Pencil> pencilSet = new HashSet<>();
		pencilSet.add(greenPencil);
		pencilSet.add(bluePencil);
		pencilSet.add(redPencil);

		// 3. add Stationery sets to Kit Map

		kit.add(StationeryIdentifiers.PENCIL_ID, pencilSet);

		Pen bluePen = new Pen(45, "Black");
		Pen greenPen = new Pen(54, "Green");
		Pen redPen = new Pen(40, "Red");

		Set<Pen> penSet = new HashSet<>();
		penSet.add(bluePen);
		penSet.add(greenPen);
		penSet.add(redPen);

		kit.add(StationeryIdentifiers.PEN_ID, penSet);

		Paper paper = new Paper(175);
		Set<Paper> paperSet = new HashSet<>();
		paperSet.add(paper);
		kit.add(StationeryIdentifiers.PAPER_ID, paperSet);

		Clip clip = new Clip(25);

		Set<Clip> clipSet = new HashSet<>();
		clipSet.add(clip);

		kit.add(StationeryIdentifiers.CLIP_ID, clipSet);

		Marker markerYellow = new Marker("Yellow", 125);
		Marker markerGreen = new Marker("Green", 250);
		Marker markerPink = new Marker("Pink", 175);

		Set<Marker> markerSet = new HashSet<>();
		markerSet.add(markerYellow);
		markerSet.add(markerGreen);
		markerSet.add(markerPink);

		kit.add(StationeryIdentifiers.MARKER_ID, markerSet);

		Stapler stapler = new Stapler(250, false);
		Stapler staplerBig = new Stapler(435, true);
		Stapler staplerLarge = new Stapler(1000, false);

		Set<Stapler> staplerSet = new HashSet<>();

		staplerSet.add(stapler);
		staplerSet.add(staplerBig);
		staplerSet.add(staplerLarge);

		kit.add(StationeryIdentifiers.STAPLER_ID, staplerSet);

		Folder folder = new Folder(200);

		Set<Folder> folderSet = new HashSet<>();
		folderSet.add(folder);
		kit.add(StationeryIdentifiers.FOLDER_ID, folderSet);

		StickNote stickNote = new StickNote(50);

		Set<StickNote> stickNoteSet = new HashSet<>();
		stickNoteSet.add(stickNote);

		kit.add(StationeryIdentifiers.STICK_NOTE, stickNoteSet);

	}

	public static void main(String[] args) {

		kit.display(5);
		kit.displayItems();

	}

}
