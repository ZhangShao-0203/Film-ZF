package com.film.action;

import com.film.pojo.Actor;
import com.film.service.IActorService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ActorAction extends ActionSupport implements ModelDriven<Actor> {

    private IActorService actorService;
    Actor actor;

    @Override
    public Actor getModel() {
        return actor;
    }
}
