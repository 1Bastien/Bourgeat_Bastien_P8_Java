package com.openclassrooms.tourguide.user;

import java.util.concurrent.CompletableFuture;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

public class UserReward {

	public final VisitedLocation visitedLocation;
	public final Attraction attraction;
	private CompletableFuture<Integer> rewardPoints;
	public UserReward(VisitedLocation visitedLocation, Attraction attraction, CompletableFuture<Integer> completableFuture) {
		this.visitedLocation = visitedLocation;
		this.attraction = attraction;
		this.rewardPoints = completableFuture;
	}
	
	public UserReward(VisitedLocation visitedLocation, Attraction attraction) {
		this.visitedLocation = visitedLocation;
		this.attraction = attraction;
	}

	public void setRewardPoints(CompletableFuture<Integer> rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	public CompletableFuture<Integer> getRewardPoints() {
		return rewardPoints;
	}
	
}
