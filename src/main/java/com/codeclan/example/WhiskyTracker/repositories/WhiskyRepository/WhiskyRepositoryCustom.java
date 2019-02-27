package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> findWhiskyThatHasADistilleryAndAge(String name, int age);

    List<Whisky> getWhiskyByRegion(String region);

}
