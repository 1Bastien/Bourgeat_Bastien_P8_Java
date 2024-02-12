package com.openclassrooms.tourguide;

import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gpsUtil.GpsUtil;
import rewardCentral.RewardCentral;
import com.openclassrooms.tourguide.service.RewardsService;

@Configuration
public class TourGuideModule {

	@Autowired
	private ExecutorService executorService;
	
	@Bean
	GpsUtil getGpsUtil() {
		return new GpsUtil();
	}

	@Bean
	RewardsService getRewardsService() {
		return new RewardsService(getGpsUtil(), getRewardCentral(), executorService);
	}

	@Bean
	RewardCentral getRewardCentral() {
		return new RewardCentral();
	}

}
