package com.prlife.bs.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.prlife.bs.model.MultiStreaming;

public class OdsReader implements ItemReader<MultiStreaming> {

	@Override
	public MultiStreaming read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		return null;
	}

}
