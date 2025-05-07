package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	List<Music> list = new ArrayList<Music>();

	public boolean addList(Music music) {
		boolean result = list.add(music);
		return result;
	}

	public int addAtZero(Music music) {
		int result = 0;
		list.add(0, music);
		if (list.contains(music))
			result += 1;
		return result;
	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music searchMusic = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title))
				searchMusic = list.get(i);
		}
		return searchMusic;
	}

	public Music removeMusic(String title) {
		Music removeMusic = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				removeMusic = list.get(i);
				list.remove(i);
			}
		}
		return removeMusic;
	}

	public Music setMusic(String title, Music music) {
		Music setMusic = null;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				setMusic = music;
				list.remove(i);
				list.add(i, setMusic);
			}
		}
		return setMusic;
	}
}
