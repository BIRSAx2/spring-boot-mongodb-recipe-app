package dev.mouhieddine.recipeapp.services;

import dev.mouhieddine.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
