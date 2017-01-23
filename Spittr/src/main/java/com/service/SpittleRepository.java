package com.service;

import java.util.List;

import com.vo.Spittle;

public interface SpittleRepository {
	public List<Spittle> findSpittles(long max,int count);
}
