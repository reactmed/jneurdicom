package org.reactmed.neurdicom.dao;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Log
public class InstanceDao {

    @PostConstruct
    public void postConstruct(){
        log.info("Hello from instance dao");
    }
}
