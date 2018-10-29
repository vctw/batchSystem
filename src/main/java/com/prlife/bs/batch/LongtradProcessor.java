package com.prlife.bs.batch;

import org.springframework.batch.item.ItemProcessor;

import com.prlife.bs.model.ActuaryData;
import com.prlife.bs.model.MultiStreaming;

public class LongtradProcessor implements ItemProcessor<MultiStreaming, ActuaryData>{

	@Override
	public ActuaryData process(MultiStreaming arg0) throws Exception {
		ActuaryData data = new ActuaryData();
		
		return data;
	}

}
